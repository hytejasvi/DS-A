package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount{


    public SavingsAccount(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    BigDecimal calculateFee(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(0.005));
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public BigDecimal setBalance(BigDecimal balance) {
        this.balance = balance;
        return balance;
    }


}
