package com.hackathon.ewallet.auditservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hackathon.ewallet.auditservice.dto.LocalDateTimeSerializer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transactions")
@NoArgsConstructor
public class Transaction {

	@Id
    @SequenceGenerator(name = "trans_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "trans_id_seq",strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JsonProperty(value = "account")
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account accountId;

    @ManyToOne
    @JsonProperty(value = "merchant")
    @JoinColumn(name = "merchant_id", referencedColumnName = "user_id")
    private User merchantId;

    @Column(name = "transaction_description")
    private String transactionDesc;

    @ManyToOne
    @JoinColumn(name = "transaction_status_id", referencedColumnName = "id")
    private TransactionStatus transactionStatusId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @Column(name = "transaction_date_time")
    private LocalDateTime transactionDateTime;

    @Column(name = "amount")
    private Double amount;


    public Transaction(Long id, Account accountId, Double amount) {
        this.id = id;
        this.accountId = accountId;
        this.amount = amount;
    }
}