package com.learning.core_java_spring_lab.Day4;

import java.math.BigDecimal;

public class MainApplication {
    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        AccountService service = new AccountService(repository);

        SavingsAccount sa = new SavingsAccount("S1", BigDecimal.valueOf(1000));
        CurrentAccount ca = new CurrentAccount("C1", BigDecimal.valueOf(2000));
        StudentAccount sd = new StudentAccount("student", BigDecimal.valueOf(1000));

        repository.save(sa);
        repository.save(ca);
        repository.save(sd);

        service.transfer(sa,ca,BigDecimal.valueOf(100));

        service.transfer(sd, ca, BigDecimal.valueOf(100));

        BankAccount b = repository.findById(sa.id);
        BankAccount c = repository.findById(ca.id);
        BankAccount a = repository.findById(sd.id);
        System.out.println(b.id +" : " + b.getBalance());
        System.out.println(c.id +" : " + c.getBalance());
        System.out.println(a.id +" : " + a.getBalance());
    }
}
