package com.srg.ebankspring.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountDTO {

    private Long accountId;
    private String accountType;
    private String balance;
    private LocalDateTime creationDate;
    private UserDTO user;
}
