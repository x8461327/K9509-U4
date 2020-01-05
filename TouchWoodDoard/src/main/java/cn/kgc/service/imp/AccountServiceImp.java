package cn.kgc.service.imp;

import cn.kgc.domain.Account;
import cn.kgc.domain.AccountExample;
import cn.kgc.mapper.AccountMapper;
import cn.kgc.service.AccountService;
import cn.kgc.util.MD5Utils;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImp implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public List<Account> select(String username, String password) {
        List<Account> select = accountMapper.select(username, MD5Utils.md5Encrypt(password));
        return select;
    }
}
