package be.banksii.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.banksii.api.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    
}