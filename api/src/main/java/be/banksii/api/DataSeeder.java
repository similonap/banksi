package be.banksii.api;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

import be.banksii.api.model.Account;
import be.banksii.api.model.Transaction;
import be.banksii.api.model.dto.RegisterUserDto;
import be.banksii.api.repository.AccountRepository;
import be.banksii.api.repository.UserRepository;
import be.banksii.api.services.AuthenticationService;
import jakarta.annotation.PostConstruct;

@Component
public class DataSeeder {

    private final AccountRepository accountRepository;
    private final UserRepository userRepository;
    private final AuthenticationService authenticationService;

    public DataSeeder(AccountRepository accountRepository, UserRepository userRepository, AuthenticationService authenticationService) {
        this.accountRepository = accountRepository;
        this.userRepository = userRepository;
        this.authenticationService = authenticationService;
    }

    // Method to seed data, annotated with @PostConstruct to run after injection
    @PostConstruct
    public void seedData() {        
        if (userRepository.count() == 0) {
            authenticationService.signup(new RegisterUserDto("slimmii", "test", "Andie Similon"));
        }

    }
}