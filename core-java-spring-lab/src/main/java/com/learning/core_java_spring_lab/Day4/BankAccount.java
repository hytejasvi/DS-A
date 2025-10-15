package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public abstract class BankAccount {
    protected String id;
    protected BigDecimal balance;

    abstract BigDecimal calculateFee(BigDecimal amount);

    abstract BigDecimal setBalance(BigDecimal balance);

    abstract BigDecimal getBalance();
}
