package com.srg.ebankspring.service;

import com.srg.ebankspring.model.dto.TransferDTO;

import java.util.List;

public interface ITransferService {
    public TransferDTO createUser(TransferDTO transfer);
    public void deleteUser(Long transferId);
    public List<TransferDTO> GetAllUser();
}
