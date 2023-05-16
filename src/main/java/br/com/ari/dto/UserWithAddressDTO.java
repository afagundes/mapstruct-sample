package br.com.ari.dto;

public record UserWithAddressDTO(String name, String username, String email, String phone, BasicAddress address) {}
