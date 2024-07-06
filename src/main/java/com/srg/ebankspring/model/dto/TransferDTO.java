package com.srg.ebankspring.model.dto;

import com.srg.ebankspring.model.entity.Account;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class TransferDTO {

    private Long transferId;
    private Double amount;
    private String description;
    private Account sourceAccount;
    private Account targetAccount;
}
