package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "on_boarding_statuses")
public class OnBoardingStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "on_boarding_status_seq")
    @SequenceGenerator(name = "on_boarding_status_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "onboarding_status")
    private String onboardingStatus;

}