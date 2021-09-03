package com.itheima.service.impl;

import com.itheima.service.IAccountService;
import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;

/*
账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {
   private IAccountDao accountDao=new AccountDaoImpl();
   public AccountServiceImpl(){
       System.out.println("对象创建了");
   }
    //private int i=1;
   public void saveAccount() {
        int i=1;
        accountDao.saveAccount();
        System.out.println(i);
        i++;

    }
}
