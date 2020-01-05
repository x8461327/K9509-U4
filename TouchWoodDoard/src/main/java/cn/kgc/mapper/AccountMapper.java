package cn.kgc.mapper;

import cn.kgc.domain.Account;
import cn.kgc.domain.AccountExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKey(Account record);

    @Select("select * from account where accountname = #{name} and password = #{pass}")
    List<Account> select(@Param("name") String username, @Param("pass") String password);
}