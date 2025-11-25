package com.perez.compras_ventas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductAlmacenRequest {
    private Integer almacenId;
    private Integer productoId;
    private Integer stock;
}
