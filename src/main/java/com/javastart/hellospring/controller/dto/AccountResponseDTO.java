package com.javastart.hellospring.controller.dto;

import com.javastart.hellospring.entity.Account;

public class AccountResponseDTO {

    private Long accountID;

    private String name;

    private String email;

    private Integer bill;

    public AccountResponseDTO(Long id, String name, String email, Integer bill) {
        this.accountID = id;
        this.name = name;
        this.email = email;
        this.bill = bill;

    }
    public AccountResponseDTO(Account account) {
        accountID = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long id) {
        this.accountID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}
