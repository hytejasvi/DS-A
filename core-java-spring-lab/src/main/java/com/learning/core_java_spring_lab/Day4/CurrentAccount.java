package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(String id, BigDecimal balance) {
        this.id = id;
        this.balance = balance;
    }

    @Override
    BigDecimal calculateFee(BigDecimal amount) {
        //return amount.multiply(BigDecimal.valueOf(0.01)).add(BigDecimal.TEN);
        return amount.multiply(BigDecimal.valueOf(( 50 /100)))
                .add(amount.multiply(BigDecimal.valueOf(.1)));
    }

    @Override
    BigDecimal setBalance(BigDecimal balance) {
        this.balance = balance;
        return balance;
    }

    @Override
    BigDecimal getBalance() {
        return balance;
    }
}
