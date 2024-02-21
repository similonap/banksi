package be.banksii.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.banksii.api.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
    
}