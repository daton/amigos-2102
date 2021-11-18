package com.unitec.amigos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {
    private String nombre;

    @Id
    private  String email;

    private  String nickname;

    private ArrayList<Localizacion> localizacion;

    public ArrayList<Localizacion> getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(ArrayList<Localizacion> localizacion) {
        this.localizacion = localizacion;
    }

    public Usuario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}