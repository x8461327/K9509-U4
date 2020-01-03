package cn.kgc.controller;

import cn.kgc.domain.District;
import cn.kgc.domain.Street;
import cn.kgc.service.DistritctService;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class DistrictController {

    @Autowired
    private DistritctService distritctService;

    @RequestMapping("/getDistrictData")
    public Map<String,Object> getDistrictData(PageUtil pageUtil){
        //调用业务区域数据
        PageInfo<District> pageInfo=distritctService.getDistrictByPage(pageUtil);

        //封装返回数据
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }

    @RequestMapping("/getStreet")
    public Map<String,Object> getStreet(PageUtil pageUtil){
        //调用业务区域数据
        PageInfo<Street> pageInfo=distritctService.getStreetByPage(pageUtil);

        //封装返回数据
        Map<String,Object> map=new HashMap<>();
        map.put("total",pageInfo.getTotal());
        map.put("rows",pageInfo.getList());
        return map;
    }


    @RequestMapping("/addDistrict")
    public int addDistrict(District district){
        int i = distritctService.addDistrict(district);
        return i;
    }
    @RequestMapping("/updateDistrict")
    public int updateDistrict(District district){
        int i = distritctService.updateDistrict(district);
        return i;
    }

    @RequestMapping("/deleteDistrict")
    public int deleteDistrict(Integer id){
        distritctService.deleteDistrict(id);
        return 1;
    }

    @RequestMapping("/deleteByFruitName")
    public int deleteByFruitName(int[] ids){
        System.out.println(ids);
        return 0;
    }
}
