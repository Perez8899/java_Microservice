package com.perez.compras_ventas.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PermisoRequest { // input data

    @NotBlank(message = "El nombre es obligatorio") // ""
    @Size(max = 50)
    private String nombre;

    @NotBlank
    @Size(max = 100, message = "La descripccion dedbe tener maximo 100 caracteres")
    private String descripcion;

    @NotBlank
    @Size(max = 100, message = "Recurso debe tener maximo 100 caracteres")
    private String recurso;

    @NotBlank
    @Size(max = 100, message = "Accion tener maximo 100 caracteres")
    private String accion;
}
