package com.kozyrev.testboot.service;


import com.kozyrev.testboot.dao.AccountDAO;
import com.kozyrev.testboot.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    final private AccountDAO accountDAO;

    @Autowired
    public AccountServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void save(Account account) {
        accountDAO.save(account);
    }
}
