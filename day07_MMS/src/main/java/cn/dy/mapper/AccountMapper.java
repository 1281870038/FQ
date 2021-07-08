package cn.dy.mapper;

import cn.dy.pojo.Account;

import java.util.List;

public interface AccountMapper {
    /*查询所有用户信息*/
    List<Account>  findAll();
}
