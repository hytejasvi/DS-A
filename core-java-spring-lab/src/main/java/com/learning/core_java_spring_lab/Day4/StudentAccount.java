package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public class StudentAccount extends BankAccount {


    public StudentAccount(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    BigDecimal calculateFee(BigDecimal amount) {
        return BigDecimal.ZERO;
    }

    @Override
    BigDecimal setBalance(BigDecimal balance) {
        this.balance = balance;
        return this.balance;
    }

    @Override
    BigDecimal getBalance() {
        return balance;
    }
}
