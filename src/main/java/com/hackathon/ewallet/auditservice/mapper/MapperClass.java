package com.hackathon.ewallet.auditservice.mapper;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;
import com.hackathon.ewallet.auditservice.entity.Transaction;

public class MapperClass {
	
	public static Transaction mapToAccount(TransactionDto accountDto)
	{
		Transaction account = new Transaction (
				
				accountDto.getId(),
				accountDto.getAccountId(),
				accountDto.getAmount()
				);
		
		return account;
	}
	
	public static TransactionDto mapToAcountDto(Transaction account)
	{
		TransactionDto accountDto = new TransactionDto(
				
				account.getId(),
				account.getAccountId(),
				account.getAmount()
		
				);
		
		return accountDto;
	}

}
