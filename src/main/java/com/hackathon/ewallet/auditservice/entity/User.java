package com.hackathon.ewallet.auditservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @SequenceGenerator(name = "user_id_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "user_id_seq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "contact")
    private String contact;

    @Column(name = "email")
    private String email;

    @Column(name = "age")
    private Integer age;

    @OneToOne
    @JoinColumn(name = "user_type_id", referencedColumnName = "id")
    private UserType userTypeId;

}