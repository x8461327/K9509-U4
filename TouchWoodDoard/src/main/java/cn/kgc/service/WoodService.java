package cn.kgc.service;

import cn.kgc.domain.Wood;
import cn.kgc.domain.WoodAll;
import cn.kgc.domain.WoodExample;
import cn.kgc.util.PageUtil;
import com.github.pagehelper.PageInfo;

import java.text.ParseException;
import java.util.List;

public interface WoodService {

    PageInfo<WoodAll> selectByExample(PageUtil pageUtil);

    int addWood(Wood wood) throws ParseException;

    public int deleteMoreWood(Integer [] ids);
}
