/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lania.bambusalp.Entidades;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Cinth
 */
@Entity
@Table(name="detalles_aplicacion_producto")
public class DetalleAplicacionProducto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_detalle_aplicacion_producto")
    private Long idDetalleAplicacionProducto;
    @Column(nullable=false, name="cantidad")
    private BigDecimal cantidad;
    @Column(nullable=false, name="es_variable")
    private boolean esVariable;
    @ManyToOne
    @JoinColumn(nullable = false, name="id_insumo")
    private Insumo insumo;
    @ManyToOne
    @JoinColumn(nullable= false, name= "id_producto")
    private Producto producto;

    public Long getIdDetalleAplicacionProducto() {
        return idDetalleAplicacionProducto;
    }

    public void setIdDetalleAplicacionProducto(Long idDetalleAplicacionProducto) {
        this.idDetalleAplicacionProducto = idDetalleAplicacionProducto;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEsVariable() {
        return esVariable;
    }

    public void setEsVariable(boolean esVariable) {
        this.esVariable = esVariable;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
}
