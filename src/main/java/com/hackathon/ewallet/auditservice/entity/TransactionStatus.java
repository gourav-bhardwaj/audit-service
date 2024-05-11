package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "transaction_statuses")
public class TransactionStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_status_seq")
    @SequenceGenerator(name = "transaction_status_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "transaction_status", nullable = false)
    private String transactionStatus;

}