package com.hackathon.ewallet.auditservice.controller;

import com.hackathon.ewallet.auditservice.dto.TransactionDto;
import com.hackathon.ewallet.auditservice.entity.Transaction;
import com.hackathon.ewallet.auditservice.service.AuditService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auditDetails")
public class AuditServiceController {

    private AuditService auditService;

    public AuditServiceController(AuditService auditService) {
        this.auditService = auditService;
    }


	@Operation(description = "Get a single transaction by ID")
	@GetMapping("/transactions/{id}")
    public ResponseEntity<TransactionDto> getSingleTransaction(@PathVariable Long id) {
        TransactionDto singleTransaction = auditService.getAuditDetailsByTransactioId(id);
        if (singleTransaction!=null) {
            return new ResponseEntity<>(singleTransaction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Operation(description = "Get user transactions based on given from and to date")
    @ApiResponse(responseCode = "200", description = "Provide user details based on from and to date successfully!!")
    @GetMapping("/users/{accountId}")
    public ResponseEntity<List<Transaction>> getAuditDetailsFromStartToEnd(@RequestParam("from") String from, @RequestParam("to") String to, @PathVariable Long accountId) {
        List<Transaction> transactionList = auditService.getAuditDetailsFromStartToEnd(from, to, accountId);
        return ResponseEntity.ok(transactionList);
    }

}
