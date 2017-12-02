package com.kozyrev.testboot.controller;

import com.kozyrev.testboot.model.Account;
import com.kozyrev.testboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HomeController {

    private final AccountService accountService;

    @Autowired
    public HomeController(AccountService accountService) {
        this.accountService = accountService;
    }


    @GetMapping({"/home","/"})
    public String account(Model model) {
        model.addAttribute("account",new Account());
        return "home";
    }

    @PostMapping({"/home","/"})
    public String account(@ModelAttribute("account") Account account) {
        System.out.println(account);
        accountService.save(account);
        sendSomewhere(account);
        return "redirect:home";
    }
    
    private void sendSomewhere(Account account) {
    }
}
