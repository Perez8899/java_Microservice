package com.perez.compras_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perez.compras_ventas.entity.Permiso;

public interface PermisoRepository extends JpaRepository<Permiso, Integer>{
    
}
