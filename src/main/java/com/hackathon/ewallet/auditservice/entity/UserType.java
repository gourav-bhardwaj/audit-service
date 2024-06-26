package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_types")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_type_seq")
    @SequenceGenerator(name = "user_type_seq", initialValue = 1, allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_type")
    private String userType;

}