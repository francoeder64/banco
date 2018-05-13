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
import java.util.Date;

/**
 *
 * @author fchacon
 */
@Table(name = "productos")
public class Transacciones  extends Entidad{

    @PrimaryKey
    @AutoIncrement
    @Column(name = "idtransaccion")
    private int idtransaccion;
    @Column(name = "tipoTransaccion")
    private char tipoTransaccion;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "idProducto")
    private int idProducto;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "idProvClient")
    private int idProvClient;
    @Column(name = "fechaVencimiento")
    private Date fechaVencimiento;

    public Transacciones() {
    }

    public Transacciones(int idtransaccion, char tipoTransaccion, Date fecha, int idProducto, int cantidad, int idProvClient, Date fechaVencimiento) {
        this.idtransaccion = idtransaccion;
        this.tipoTransaccion = tipoTransaccion;
        this.fecha = fecha;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.idProvClient = idProvClient;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getIdtransaccion() {
        return idtransaccion;
    }

    public void setIdtransaccion(int idtransaccion) {
        this.idtransaccion = idtransaccion;
    }

    public char getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(char tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProvClient() {
        return idProvClient;
    }

    public void setIdProvClient(int idProvClient) {
        this.idProvClient = idProvClient;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

}
