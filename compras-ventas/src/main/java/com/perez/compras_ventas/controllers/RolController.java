package com.perez.compras_ventas.controllers;

import java.util.List;

import com.perez.compras_ventas.dto.request.RolRequest;
import com.perez.compras_ventas.dto.response.RolResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.perez.compras_ventas.entity.Rol;
import com.perez.compras_ventas.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping
    public List<Rol> finAllRoles() {
        return rolService.findAllRoles();
    }

    @GetMapping("/{id}")
    public RolResponse findRolById(@PathVariable Integer id) {

        return rolService.findRolById(id);
    }

    @PostMapping()
    public Rol createRol(@RequestBody RolRequest rolRequest) {

        return rolService.createRol(rolRequest);
    }

    @PutMapping("/{id}")
    public Rol updateRol(@PathVariable Integer id, @RequestBody RolRequest rol) {
        return rolService.updateRol(id, rol);
    }


    @DeleteMapping("/{id}")
    public void deleteRol(@PathVariable Integer id){
        rolService.deleteRolById(id);
    }
}
