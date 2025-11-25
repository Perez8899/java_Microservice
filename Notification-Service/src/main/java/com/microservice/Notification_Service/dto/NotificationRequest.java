package com.microservice.Notification_Service.dto;

public class NotificationRequest {

    private String usuario;

    private String titulo;

    private String body;

    private String category;

    private String prioridad;


    public NotificationRequest() {
    }

    public NotificationRequest(String usuario, String titulo, String body, String category, String prioridad) {
        this.usuario = usuario;
        this.titulo = titulo;
        this.body = body;
        this.category = category;
        this.prioridad = prioridad;
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


}
