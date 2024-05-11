package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {

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