package com.perez.compras_ventas.dto.response;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoFilterCriteria {

    private String nombre;
    private String descripcion;
    private String codigoBarra;
    private String marca;
    private Integer almacenId;
    private String nombreCategoria;
}
