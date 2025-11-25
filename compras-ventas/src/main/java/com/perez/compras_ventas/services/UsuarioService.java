package com.perez.compras_ventas.services;

import java.util.List;

import com.perez.compras_ventas.dto.request.UsuarioRequest;
import com.perez.compras_ventas.dto.response.UsuarioResponse;

public interface UsuarioService {

    List<UsuarioResponse> findAllUsuarios();

    UsuarioResponse findUsuarioById(Integer id);

    UsuarioResponse createUsuario(UsuarioRequest usuarioRequest);

    UsuarioResponse updateUsuario(Integer id, UsuarioRequest usuarioRequest);

    void deleteUsuarioById(Integer id);
}
