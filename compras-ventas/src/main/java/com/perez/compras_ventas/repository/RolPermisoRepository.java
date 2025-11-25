package com.perez.compras_ventas.repository;

import com.perez.compras_ventas.entity.Permiso;
import com.perez.compras_ventas.entity.PermisoRol;
import com.perez.compras_ventas.entity.Rol;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface RolPermisoRepository extends ListCrudRepository<PermisoRol, Integer> {

    //List<PermisoRol> findByRol_Id(Integer id);
    List<PermisoRol> findByRol(Rol rol);
}
