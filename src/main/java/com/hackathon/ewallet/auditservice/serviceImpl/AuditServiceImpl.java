package com.hackathon.ewallet.auditservice.serviceImpl;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;
import com.hackathon.ewallet.auditservice.entity.Transaction;
import com.hackathon.ewallet.auditservice.mapper.MapperClass;
import com.hackathon.ewallet.auditservice.repository.TransactionRepository;
import com.hackathon.ewallet.auditservice.service.AuditService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class AuditServiceImpl implements AuditService{
	
	
	TransactionRepository transactRepo;

	public AuditServiceImpl(TransactionRepository transactRepo) {
		super();
		this.transactRepo = transactRepo;
	}

	@Override
	public List<Transaction> getAuditDetailsFromStartToEnd(String starttime, String endtime, Long accountId) {
		LocalDate fromDate = LocalDate.parse(starttime, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		LocalDate toDate = LocalDate.parse(endtime, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		return transactRepo.getTransactionForUser(fromDate.atStartOfDay(), toDate.atStartOfDay(), accountId);
	}

	@Override
	public List<TransactionDto> getAuditDetailsByDays(Integer days) {
		
		return null;
	}

	@Override
	public TransactionDto getAuditDetailsByTransactioId(Long transaction_id) {
		Transaction transaction = 
				Optional.ofNullable(transactRepo.findById(transaction_id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Transaction ID not found!"))).get();
		return MapperClass.mapToAcountDto(transaction);
	}

}
