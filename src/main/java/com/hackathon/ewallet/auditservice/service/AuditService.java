package com.hackathon.ewallet.auditservice.service;

import java.time.LocalDate;
//import com.hackathon.ewallet.auditservice.entity.Transaction;
import java.util.List;
import java.util.Optional;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;


public interface AuditService {
	
	public List<TransactionDto> getAuditDetailsFromStartToEnd(LocalDate starttime,LocalDate endtime, long user_type_id);
	
	public List<TransactionDto> getAuditDetailsByDays(Integer days);
	
	public TransactionDto getAuditDetailsByTransactioId(Long transaction_id);
	 
	
}
