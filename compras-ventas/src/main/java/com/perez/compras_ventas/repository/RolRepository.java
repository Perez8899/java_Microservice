package com.perez.compras_ventas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;

import com.perez.compras_ventas.entity.Rol;


public interface RolRepository extends ListCrudRepository<Rol, Integer> {

//Query Metodo
    List<Rol> findByNombre(String nombre);

//peticion a la BD query nativa
    @Query(value = "select * from rol", nativeQuery = true) 
    List<Rol> finAllRoles();

     @Query(value = "select * from rol where nombre like '?1' ", nativeQuery = true) 
    List<Rol> getRolByNombre(String nombre);

//peticion a la BD JPQL
    @Query(value = "select Rol from Rol")                  
    List<Rol> finAllRolesJpql();

}
