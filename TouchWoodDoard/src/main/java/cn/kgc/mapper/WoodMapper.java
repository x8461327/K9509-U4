package cn.kgc.mapper;

import cn.kgc.domain.Wood;
import cn.kgc.domain.WoodAll;
import cn.kgc.domain.WoodExample;
import cn.kgc.util.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface WoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Wood record);

    int insertSelective(Wood record);

    List<Wood> selectByExample(WoodExample example);

    Wood selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Wood record);

    int updateByPrimaryKey(Wood record);

    @Select("select w.`id`,w.`time`,p.`productName`,w.`quantity`,w.`unitprice`,w.`totalprices`,w.`purchaser`,w.`cellphone`,w.`engineeringunit`,w.`deliveryaddress`,u.`name`,u.`phone`,s.`statusname` from wood w,user u,product p,status s where w.`productid`=p.`id` and w.`seller` = u.`id` and w.`tradingstatus` = s.`id` order by w.id")
    List<WoodAll> selectall();

    public int deleteMoreWood(Integer [] ids);

}