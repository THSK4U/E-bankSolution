package com.srg.ebankspring.service;

import com.srg.ebankspring.model.dto.TransferDTO;
import com.srg.ebankspring.model.entity.Transfer;
import com.srg.ebankspring.model.mapper.TransactionMapper;
import com.srg.ebankspring.model.mapper.TransferMapper;
import com.srg.ebankspring.repository.AccountRepository;
import com.srg.ebankspring.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService implements ITransferService {

    @Autowired
    private TransferMapper transferMapper;

    @Autowired
    private TransferRepository transferRepository;


    @Override
    public TransferDTO createUser(TransferDTO transferDTO) {
        Transfer transfer = transferMapper.toEntity(transferDTO);
        TransferDTO transferdto = transferMapper.toDTO(transferRepository.save(transfer));
        return transferdto;
    }

    @Override
    public void deleteUser(Long transferId) {

    }

    @Override
    public List<TransferDTO> GetAllUser() {
        return List.of();
    }
}
