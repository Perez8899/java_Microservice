package com.perez.compras_ventas.repository;

import com.perez.compras_ventas.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<Producto, Integer>, JpaSpecificationExecutor<Producto> {
    // where nombre like '%value%' and description like '%valueDesc%'
}
