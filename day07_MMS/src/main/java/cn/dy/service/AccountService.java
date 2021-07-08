package cn.dy.service;

import cn.dy.pojo.Account;

import java.util.List;

public interface AccountService {
    /*查询所有用户信息*/
    List<Account> findAll();
}
