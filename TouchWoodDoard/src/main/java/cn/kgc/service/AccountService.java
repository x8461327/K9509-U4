package cn.kgc.service;

import cn.kgc.domain.Account;
import cn.kgc.domain.AccountExample;

import java.util.List;

public interface AccountService {

    List<Account> select(String username,String password);
}
