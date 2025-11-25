// package com.perez.compras_ventas.entity;

// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import lombok.AllArgsConstructor;
// import lombok.Getter;
// import lombok.NoArgsConstructor;
// import lombok.Setter;

// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @Entity
// public class UsuarioRol {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// @Column(name = "id_usu_rol")
// private Integer idUsuRol;

// @ManyToOne
// @JoinColumn(name = "id_usu")
// private Usuario usuario;

// @ManyToOne
// @JoinColumn(name = "id_rol")
// private Rol rol;
// }
