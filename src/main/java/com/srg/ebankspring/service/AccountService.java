package com.srg.ebankspring.service;

import com.srg.ebankspring.model.dto.AccountDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService implements IAccountService {

    private List<AccountDTO> accounts = new ArrayList<>();


    @Override
    public AccountDTO createAccount(AccountDTO account) {
        accounts.add(account);
        return account;
    }

    @Override
    public void deleteAccount(AccountDTO account) {
        accounts.remove(account);
    }

    @Override
    public List<AccountDTO> GetAllAccounts() {
        return new ArrayList<>(accounts);
    }

}
