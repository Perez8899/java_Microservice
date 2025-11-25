package com.microservice.Notification_Service.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "notification")
public class Notification {

    @Id
    private String id;

    @Field(name = "notification_identifier")
    private String notificationIdentifier;

    private String usuario;

    private String titulo;

    private String body;

    private String category;

    private String prioridad;

    private String estado;

    private LocalDateTime readAt;

    private LocalDateTime fechaRegistro;



    public Notification() {
    }

    public Notification(String id, String notificationIdentifier, String usuario, String titulo, String body,
                        String category, String prioridad, String estado, LocalDateTime readAt, LocalDateTime fechaRegistro) {
        this.id = id;
        this.notificationIdentifier = notificationIdentifier;
        this.usuario = usuario;
        this.titulo = titulo;
        this.body = body;
        this.category = category;
        this.prioridad = prioridad;
        this.estado = estado;
        this.readAt = readAt;
        this.fechaRegistro = fechaRegistro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNotificationIdentifier() {
        return notificationIdentifier;
    }

    public void setNotificationIdentifier(String notificationIdentifier) {
        this.notificationIdentifier = notificationIdentifier;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getReadAt() {
        return readAt;
    }

    public void setReadAt(LocalDateTime readAt) {
        this.readAt = readAt;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }


}
