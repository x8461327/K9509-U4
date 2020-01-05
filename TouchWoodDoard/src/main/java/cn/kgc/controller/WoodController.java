package cn.kgc.controller;

import cn.kgc.domain.*;
import cn.kgc.service.*;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WoodController {
    @Autowired
    private WoodService woodService;
    @Autowired
    private AccountService accountService;
    @Autowired
    private UserService userService;
    @Autowired
    private StatusService statusService;
    @Autowired
    private ProductService productService;

    //登录验证跳转
    @RequestMapping("/url")
    public ModelAndView url(String username, String password, ModelAndView mv, HttpSession session) {
        List<Account> select = accountService.select(username, password);
        System.out.println(select.toString());
        if (select.size() > 0 && select.size() < 2) {
            //登录成功获取所有售货人
            List<User> users = userService.selectUser();
            session.setAttribute("users",users);
            //获取所有交易状态
            List<Status> statuses = statusService.selectStatus();
            session.setAttribute("statuses",statuses);
            //获取木方模板型号
            List<Product> products = productService.selectProduct();
            session.setAttribute("products",products);
            mv.setViewName("admin");
        } else {
            mv.addObject("msg", "<h3>登录失败,账号或者密码错误</h3>");
            mv.setViewName("erorr");
        }

        return mv;
    }

    //跳转查询页面
    @RequestMapping("/templatewood")
    public ModelAndView templatewood(ModelAndView mv) {
        mv.setViewName("templatewood");
        return mv;
    }

    //查询所有数据
    @RequestMapping("/getWoodData")
    @ResponseBody
    public Map<String, Object> getWoodData(PageUtil pageUtil) {
        PageInfo<WoodAll> pageInfo = woodService.selectByExample(pageUtil);
        Map<String, Object> map = new HashMap<>();
        map.put("total", pageInfo.getTotal());
        map.put("rows", pageInfo.getList());
        return map;
    }

    //添加
    @RequestMapping("/addWood")
    @ResponseBody
    public int addWood(Wood wood) {
        try {
            int result = woodService.addWood(wood);
            return result;   //拼接的json
        } catch (Exception e) {
            return -1;
        }

    }

    @RequestMapping("/deleteMorewood")
    public int deleteMorewood(String ids){
        System.out.println("进出删除");
        try {
            //将字符串转化为数据组
            String [] strList=ids.split(",");
            Integer [] idList=new Integer[strList.length];
            for (int i=0;i<strList.length;i++) {
                idList[i]=new Integer(strList[i]);
            }
            //调用业务
            int temp=woodService.deleteMoreWood(idList);
            return temp;   //拼接的json
        }catch (Exception e){
            e.printStackTrace();   //使用日志工具记录
            return -1;
        }
    }
}
