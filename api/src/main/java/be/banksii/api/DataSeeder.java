package be.banksii.api;

import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

import be.banksii.api.model.Account;
import be.banksii.api.model.Transaction;
import be.banksii.api.repository.AccountRepository;
import jakarta.annotation.PostConstruct;

@Component
public class DataSeeder {

    private final AccountRepository repository;

    public DataSeeder(AccountRepository repository) {
        this.repository = repository;
    }

    // Method to seed data, annotated with @PostConstruct to run after injection
    @PostConstruct
    public void seedData() {



    }
}