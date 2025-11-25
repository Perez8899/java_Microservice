package com.perez.compras_ventas.dto.request;

import com.perez.compras_ventas.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductRequest {

    private String nombre;
    private String descripcion;
    private String marca;
    private BigDecimal precioVenta;
    private Integer categoriaId;

    public static Producto toEntity(ProductRequest productoRequest){
        return Producto.builder()
                .nombre(productoRequest.getNombre())
                .descripcion(productoRequest.getDescripcion())
                .marca(productoRequest.getMarca())
                .precioVenta(productoRequest.getPrecioVenta())
                .build();
    }
}
