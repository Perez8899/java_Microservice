package com.perez.compras_ventas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RolSucursal {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_rol_suc")
    private Integer idRolSuc;

    @ManyToOne
    @JoinColumn(name = "id_usu")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_suc")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private Rol rol;
}
