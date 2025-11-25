package com.perez.compras_ventas.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.perez.compras_ventas.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends ListCrudRepository<Usuario, Integer> {

    Optional<Usuario> findByUserName(String userName);
}
