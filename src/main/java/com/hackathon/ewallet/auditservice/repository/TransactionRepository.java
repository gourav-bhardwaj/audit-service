package com.hackathon.ewallet.auditservice.repository;

import com.hackathon.ewallet.auditservice.entity.Transaction;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findByDateAfter(LocalDate startDate);

}
