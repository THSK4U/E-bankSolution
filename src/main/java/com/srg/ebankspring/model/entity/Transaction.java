package com.srg.ebankspring.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Transactionid;
    private Date date;
    private Double amount;
    private String description;
    private String type;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Account", nullable = false)
    private Account account;

}
