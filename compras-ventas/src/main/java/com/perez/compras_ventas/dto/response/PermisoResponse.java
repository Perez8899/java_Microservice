package com.perez.compras_ventas.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermisoResponse { // OUTPUT Data

    private Integer id;
    private String nombre;
    private String descripcion;
    private String recurso;
    private String accion;
}
