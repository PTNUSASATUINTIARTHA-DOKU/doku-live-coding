package com.doku.live.coding.dokutest.repositories;

import com.doku.live.coding.dokutest.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
