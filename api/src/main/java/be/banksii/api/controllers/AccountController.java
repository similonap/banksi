package be.banksii.api.controllers;

import be.banksii.api.model.Account;
import be.banksii.api.model.User;
import be.banksii.api.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    private AccountRepository repository;

    @GetMapping("")
    public List<Account> account(@AuthenticationPrincipal User userDetails) {
        List<Account> accounts = repository.findAll();


        return accounts;
    }


}