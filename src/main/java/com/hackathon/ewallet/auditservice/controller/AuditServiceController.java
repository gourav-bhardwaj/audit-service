package com.hackathon.ewallet.auditservice.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;
import com.hackathon.ewallet.auditservice.serviceImpl.AuditServiceImpl;

import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/auditDetails")
public class AuditServiceController {
	
	AuditServiceImpl serviceInstance;
	
	@ApiOperation(value = "Get a single transaction by ID")
	@GetMapping("/transactions/{id}")
    public ResponseEntity<TransactionDto> getSingleTransaction(@PathVariable Long id) {
        TransactionDto singleTransaction = serviceInstance.getAuditDetailsByTransactioId(id);
        if (singleTransaction!=null) {
            return new ResponseEntity<>(singleTransaction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	
}
