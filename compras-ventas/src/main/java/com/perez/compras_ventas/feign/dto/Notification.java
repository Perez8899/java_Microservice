package com.perez.compras_ventas.feign.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notification {
    private String id;

    private String notificationIdentifier;

    private String usuario;

    private String titulo;

    private String body;

    private String category;

    private String prioridad;

    private String estado;

    private LocalDateTime readAt;

    private LocalDateTime fechaRegistro;
}