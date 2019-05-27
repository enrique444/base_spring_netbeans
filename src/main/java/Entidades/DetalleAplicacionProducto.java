/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    @Column(name="id_detalle_aplicacion_producto")
    private Long idDetalleAplicacionProducto;
    @Column(nullable=false, name="cantidad")
    private BigDecimal cantidad;
    @Column(nullable=false, name="es_variable")
    private boolean esVariable;
    @ManyToOne
    @JoinColumn(nullable = false, name="id_insumo", referencedColumnName="id_insumo")
    private Insumo insumos;
    @ManyToOne
    @JoinColumn(nullable= false, name= "id_producto", referencedColumnName="id_producto")
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

    public Insumo getInsumos() {
        return insumos;
    }

    public void setInsumos(Insumo insumos) {
        this.insumos = insumos;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
}
