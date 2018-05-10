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
@Table(name = "clientes_proveedores")
public class ClientesProveedores  extends Entidad{

    @PrimaryKey
    @AutoIncrement
    @Column(name = "idprovclient")
    private int idprovclient;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "DUI")
    private String DUI;
    @Column(name = "correo")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "tipo")
    private char tipo;

    public ClientesProveedores() {
    }

	/// una modificacionklklkl
	
	
    public ClientesProveedores(int idprovclient, String nombres, String apellidos, String DUI, String correo, String telefono, char tipo) {
        this.idprovclient = idprovclient;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.DUI = DUI;
        this.correo = correo;
        this.telefono = telefono;
        this.tipo = tipo;
    }

    public int getIdprovclient() {
        return idprovclient;
    }

    public void setIdprovclient(int idprovclient) {
        this.idprovclient = idprovclient;
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

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

}
