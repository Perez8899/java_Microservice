package com.perez.compras_ventas.services;

import org.springframework.stereotype.Service;

@Service
public class StatusService { // business logic

    public String statusMessage() {
        String statusMessage = "¡Hola desde Spring Boot con Java 21! ";
        return statusMessage;
    }

    public String statusHome(){
        String statusHome = "Sistema de Compras-Ventas funcionando";
        return statusHome;
    }
}
