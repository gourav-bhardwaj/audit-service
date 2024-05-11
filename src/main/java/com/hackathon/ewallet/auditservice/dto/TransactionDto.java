package com.hackathon.ewallet.auditservice.dto;

import java.time.LocalDateTime;

import com.hackathon.ewallet.auditservice.entity.Account;
import com.hackathon.ewallet.auditservice.entity.TransactionStatus;
import com.hackathon.ewallet.auditservice.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class TransactionDto {


	public TransactionDto(Long id, Account accountId, Double amount) {
		super();
		this.id = id;
		this.accountId = accountId;
		this.amount = amount;
	}

	@Id
    @SequenceGenerator(name = "trans_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "trans_id_seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account accountId;

    @OneToOne
    @JoinColumn(name = "merchant_id", referencedColumnName = "user_id")
    private User merchantId;

    @Column(name = "transaction_description")
    private String transactionDesc;

    @OneToOne
    @JoinColumn(name = "transaction_status_id", referencedColumnName = "id")
    private TransactionStatus transactionStatusId;

    @Column(name = "transaction_date_time")
    private LocalDateTime transactionDateTime;

    @Column(name = "amount")
    private Double amount;

}

