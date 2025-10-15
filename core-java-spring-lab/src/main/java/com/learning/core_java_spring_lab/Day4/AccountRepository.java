package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class AccountRepository {
    Map<String,BankAccount> mm = new HashMap<>();

    public void save(BankAccount account) {
        mm.put(account.id, account);
    }

    public BankAccount findById(String accountId) {
        return mm.get(accountId);
    }

    public void updateBalance(String id, BigDecimal newBalance) {
        BankAccount ba = findById(id);
        ba.balance = newBalance;
        mm.put(id, ba);
    }

    @Override
    public String toString() {
        return "AccountRepository{" +
                "mm=" + mm +
                '}';
    }
}
