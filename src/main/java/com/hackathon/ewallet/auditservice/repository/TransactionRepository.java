package com.hackathon.ewallet.auditservice.repository;

import com.hackathon.ewallet.auditservice.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {


	@Query(value="select * from transactions t where t.account_id = :accountId and t.transaction_date_time between :from and :to", nativeQuery = true)
	List<Transaction> getTransactionForUser(@Param("from") LocalDateTime from, @Param("to") LocalDateTime to, @Param("accountId") Long accountId);

}
