package com.perez.compras_ventas.dto.response;

import java.time.format.DateTimeFormatter;
import java.util.List;

import com.perez.compras_ventas.entity.Cliente;
import com.perez.compras_ventas.entity.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteResponse {

    private Integer id;
    private String razonSocial;
    private String nroIdentificacion;

    public static ClienteResponse fromEntity(Cliente cliente) {
        return ClienteResponse.builder()
                .id(cliente.getIdClien())
                .nroIdentificacion(cliente.getNroIdentificacion())
                .razonSocial(cliente.getRazonSocial())
                .build();
    }

}
