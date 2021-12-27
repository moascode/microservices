package com.moascode.customer;

public record CustomerRegistrationRequest(String firstName,
        String lastName,
        String email) {
}
