package com.perez.compras_ventas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perez.compras_ventas.services.StatusService;

@RestController
public class StatusController {

    // @Autowired
    // private StatusService statusService;

    private final StatusService statusService;

    // ------------------------Constructor Injection-----------------------------------------------------------------------------------------------------
    public StatusController(StatusService statusService) {
        this.statusService = statusService;
    }

    //------------------------------------------METHOD-----------------------------------------------------------------------------------------------------
    @GetMapping("/status")
    public String statusApp() {
        return statusService.statusMessage();
    }

    @GetMapping("/")
    public String statusHome() {
        return statusService.statusHome();
    }
}