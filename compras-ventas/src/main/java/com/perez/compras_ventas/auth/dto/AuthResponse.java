package com.perez.compras_ventas.auth.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AuthResponse {

    private String token;

    private String refreshToken;

    private Integer identifier;

    private Long expiration;
}
