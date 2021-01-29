package com.doku.live.coding.dokutest.repositories;

import com.doku.live.coding.dokutest.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
