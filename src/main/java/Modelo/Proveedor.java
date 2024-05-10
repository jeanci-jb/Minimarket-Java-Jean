/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Proveedor {
    private Long id;
    private String nombre;
    private String ruc;
    private String descripcion;
    private String telefono;
    private String correo;
    private String direccion;
    private int idEstado;

    public Proveedor(String nombre, String ruc, String descripcion, String telefono, String correo, String direccion, int idEstado) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.idEstado = idEstado;
    }

    public Proveedor(Long id, String nombre, String ruc, String descripcion, String telefono, String correo, String direccion, int idEstado) {
        this.id = id;
        this.nombre = nombre;
        this.ruc = ruc;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.idEstado = idEstado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }
}