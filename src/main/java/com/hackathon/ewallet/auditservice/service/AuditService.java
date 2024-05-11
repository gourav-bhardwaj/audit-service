package com.hackathon.ewallet.auditservice.service;

import java.time.LocalDate;
import com.hackathon.ewallet.auditservice.entity.Transaction;
import java.util.List;
import java.util.Optional;


public interface AuditService {
	
	public List<Transaction> getAuditDetailsFromStartToEnd(LocalDate starttime,LocalDate endtime, long user_type_id);
	
	public List<Transaction> getAuditDetailsByDays(Integer days);
	
	public Optional<Transaction> getAuditDetailsByTransactioId(Long transaction_id);
	 
	
}
