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
public class Roles  extends Entidad{

    @PrimaryKey
    @AutoIncrement
    @Column(name = "idrol")
    private int idrol;
    @Column(name = "nombre")
    private String nombre;

    public Roles() {
    }

    public Roles(int idrol, String nombre) {
        this.idrol = idrol;
        this.nombre = nombre;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
