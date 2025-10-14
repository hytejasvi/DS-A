package com.learning.core_java_spring_lab.Day2;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class UserDto {

    String email;
    String firstName;
    String lastName;
    Boolean marketingConsent;

    UserDto(Builder builder) {
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }
    public static class Builder {
        private String email;
        private String firstName;
        private String lastName;
        private Boolean marketingConsent = false;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            if(!firstName.isBlank() && firstName.length() > 2) {
                this.firstName = firstName;
                return this;
            } else {
                throw new IllegalArgumentException("");
            }
        }

        public Builder lastName(String lastName) {
            if(!lastName.isBlank() && lastName.length() > 2) {
                this.lastName = lastName;
                return this;
            } else {
                throw new IllegalArgumentException("");
            }
        }

        public Builder marketingConsent(Boolean marketingConsent) {
            this.marketingConsent = marketingConsent;
            return this;
        }

        public UserDto build() {
            if (email == null || !email.contains("@"))
                throw new IllegalArgumentException("email missing or invalid");
            if (firstName != null && firstName.length() < 2)
                throw new IllegalArgumentException("firstName too short");
            if (lastName != null && lastName.length() < 2)
                throw new IllegalArgumentException("lastName too short");
            return new UserDto(this);
        }
    }
}
