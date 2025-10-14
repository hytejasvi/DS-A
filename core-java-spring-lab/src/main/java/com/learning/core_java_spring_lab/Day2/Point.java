package com.learning.core_java_spring_lab.Day2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Point {
    public static void main(String[] args) throws JsonProcessingException {
        String json = """
        {"id":"PAY-123","amount":19.99,"currency":"EUR"}
        """;

        PaymentCommand cmd = dtoToPaymentCommand(json);
     
        System.out.println(cmd);

        UserDto dto = new UserDto.Builder().email("test@email.com").marketingConsent(true).firstName("F123").lastName("L123").build();
        System.out.println(dto.email);
        System.out.println(dto.marketingConsent);
    }

    private static PaymentCommand dtoToPaymentCommand(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        PaymentCommand cmd = objectMapper.readValue(json, PaymentCommand.class);
        if(cmd.amount().signum() < 0) {
            throw new IllegalArgumentException("amount should be greater than 0");
        }
        if(cmd.currency().length() != 3 && !cmd.currency().matches("[A-Z]{3}")) {
            throw new IllegalArgumentException("Invalid Currency entered");
        }
        return cmd;
    }
}
