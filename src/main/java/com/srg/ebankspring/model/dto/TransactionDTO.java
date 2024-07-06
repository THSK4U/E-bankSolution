package com.srg.ebankspring.model.dto;

import com.srg.ebankspring.model.entity.Account;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class TransactionDTO {
    private Long Transactionid;
    private Date date;
    private Double amount;
    private String description;
    private String type;

}
