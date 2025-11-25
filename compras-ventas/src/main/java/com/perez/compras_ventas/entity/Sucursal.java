package com.perez.compras_ventas.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_suc")
    private Integer idSuc;

    @Column(length = 100, nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String direccion;

    @Column(length = 30, nullable = false)
    private String telefono;
    
}
