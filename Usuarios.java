/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.udb.m03.invudbjava.entidad;

import com.almacen.orm.AutoIncrement;
import com.almacen.orm.Column;
import com.almacen.orm.PrimaryKey;
import com.almacen.orm.Table;

/**
 *
 * @author fchacon
 */
@Table(name = "productos")
public class Usuarios extends Entidad {

    @PrimaryKey
    @AutoIncrement
    @Column(name = "idusuarios")
    private int idusuarios;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "clave")
    private String clave;
    @Column(name = "correo")
    private String correo;
    @Column(name = "idRol")
    private int idRol;

    public Usuarios() {
    }

    public Usuarios(int idusuarios, String nombres, String apellidos, String usuario, String clave, String correo, int idRol) {
        this.idusuarios = idusuarios;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.idRol = idRol;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

}
