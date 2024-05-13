package com.hackathon.ewallet.auditservice.service;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;
import com.hackathon.ewallet.auditservice.entity.Transaction;

import java.util.List;


public interface AuditService {

	public List<Transaction> getAuditDetailsFromStartToEnd(String starttime, String endtime, Long accountId);
	
	public List<TransactionDto> getAuditDetailsByDays(Integer days);
	
	public TransactionDto getAuditDetailsByTransactioId(Long transaction_id);
	 
	
}
