package com.kozyrev.testboot.dao;

import com.kozyrev.testboot.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountDAO extends JpaRepository<Account,Integer> {

}
