package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "account")
public class Account {

    @Id
    @SequenceGenerator(name = "acc_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "acc_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "onboarding_status_id")
    private OnBoardingStatus onBoardingStatusId;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

}