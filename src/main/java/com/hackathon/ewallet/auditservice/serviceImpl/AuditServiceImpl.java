package com.hackathon.ewallet.auditservice.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.hackathon.ewallet.auditservice.entity.Transaction;
import com.hackathon.ewallet.auditservice.repository.TransactionRepository;
import com.hackathon.ewallet.auditservice.service.AuditService;

@Service
public class AuditServiceImpl implements AuditService{
	
	
	TransactionRepository transactRepo;

	public AuditServiceImpl(TransactionRepository transactRepo) {
		super();
		this.transactRepo = transactRepo;
	}

	@Override
	public List<Transaction> getAuditDetailsFromStartToEnd(LocalDate starttime, LocalDate endtime, long user_type_id) {
		
		return null;
	}

	@Override
	public List<Transaction> getAuditDetailsByDays(Integer days) {
		
        LocalDate startDate = LocalDate.now().minusDays(days);
    
        List<Transaction> auditDetailsByDays = transactRepo.findByDateAfter(startDate);
        
        return auditDetailsByDays;
	}

	@Override
	public Optional<Transaction> getAuditDetailsByTransactioId(Long transaction_id) {
		Optional<Transaction> singleDataAudit = 
				Optional.ofNullable(transactRepo.findById(transaction_id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Transaction ID not found!")));
		return singleDataAudit;
	}

}
