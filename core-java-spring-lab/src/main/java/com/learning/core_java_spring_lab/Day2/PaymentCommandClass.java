package com.learning.core_java_spring_lab.Day2;

import java.math.BigDecimal;

public class PaymentCommandClass {
    String id;
    BigDecimal amount;
    String currency;

    PaymentCommandClass(String id, BigDecimal amount, String currency) {
        if(amount.signum() < 0) {
            throw new IllegalArgumentException("amount should be greater than 0");
        }
        if(currency.length() != 3 || !currency.matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid Currency entered");
        }
        this.id = id;
        this.amount = amount;
        this.currency = currency;
    }
}
