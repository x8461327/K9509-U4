package cn.kgc.service.imp;

import cn.kgc.domain.Wood;
import cn.kgc.domain.WoodAll;
import cn.kgc.domain.WoodExample;
import cn.kgc.mapper.WoodMapper;
import cn.kgc.service.WoodService;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class WoodServiceImp implements WoodService {

    @Autowired
    private WoodMapper woodMapper;
//    查询所有模板木方
    @Override
    public PageInfo<WoodAll> selectByExample(PageUtil pageUtil) {
        PageHelper.startPage(pageUtil.getPage(),pageUtil.getRows());
        List<WoodAll> selectall = woodMapper.selectall();
        return new PageInfo<>(selectall);
    }

    @Override
    public int addWood(Wood wood) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(date);
        wood.setTime(format);
        return woodMapper.insertSelective(wood);
    }

    @Override
    public int deleteMoreWood(Integer[] ids) {
        return woodMapper.deleteMoreWood(ids);
    }

    //添加模板木方


}
