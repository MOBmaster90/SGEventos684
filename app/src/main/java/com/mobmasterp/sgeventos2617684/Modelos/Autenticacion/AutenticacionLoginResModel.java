package com.mobmasterp.sgeventos2617684.Modelos.Autenticacion;

import java.util.List;

public class AutenticacionLoginResModel {
    private String id;
    private String documento;
    private String nombre;
    private String apellido;
    private String correo;
    private AutenticacionContratoModel contrato;
    private List<String> programas;
    private String centro;
    private List<String> roles;
    private String access_token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public AutenticacionContratoModel getContrato() {
        return contrato;
    }

    public void setContrato(AutenticacionContratoModel contrato) {
        this.contrato = contrato;
    }

    public List<String> getProgramas() {
        return programas;
    }

    public void setProgramas(List<String> programas) {
        this.programas = programas;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
