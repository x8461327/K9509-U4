package cn.kgc.mapper;

import cn.kgc.domain.Status;
import cn.kgc.domain.StatusExample;
import cn.kgc.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Status record);

    int insertSelective(Status record);

    List<Status> selectByExample(StatusExample example);

    Status selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Status record);

    int updateByPrimaryKey(Status record);

    @Select("select * from status")
    List<Status> selectStatus();
}