package com.javastart.hellospring.controller;

import com.javastart.hellospring.controller.dto.AccountRequestDTO;
import com.javastart.hellospring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AccountController {

    private final AccountService accountService;
    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/hello")
    public String helloSpring() {
        return "Hello Spring";
    }
    @PostMapping("/account")
    public Long createAccount(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.createAccount(accountRequestDTO.getName(), accountRequestDTO.getEmail(), accountRequestDTO.getBill());
    }
}
