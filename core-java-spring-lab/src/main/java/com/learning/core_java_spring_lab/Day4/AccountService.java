package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public void transfer(BankAccount debitor, BankAccount creditor, BigDecimal amount) {
        BigDecimal fee = debitor.calculateFee(amount);
        BigDecimal totalDebit = amount.add(fee);

        BankAccount debitAcc = repository.findById(debitor.id);
        BankAccount creditAcc = repository.findById(creditor.id);
        debitAcc.setBalance(debitAcc.getBalance().subtract(totalDebit));
        creditAcc.setBalance(creditAcc.getBalance().add(totalDebit));
        repository.save(debitAcc);
        repository.save(creditAcc);
    }
}
