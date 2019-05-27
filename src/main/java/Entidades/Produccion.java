/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.math.BigDecimal;
import java.util.Date;
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
@Table(name= "producciones")
public class Produccion {
    @Id
    @GeneratedValue
    @Column(name="id_produccion")
    private Long  idProduccion;
    @Column(nullable= false, name="fecha_creacion")
    private Date fechaCreacion;
    @Column(nullable= false, name = "fecha_produccion")
    private Date fechaProduccion;
    @Column(nullable= false, name="cantidad_producto_final")
    private BigDecimal cantidadProductofinal;
    @Column(nullable= false, name="cantidad_leche")
    private BigDecimal cantidadLeche;
    @Column(nullable= false, name="cantidad_yogurt")
    private BigDecimal cantidadYogurt;
    @Column(name="cantidad_suero")
    private BigDecimal cantidadSuero;
    @ManyToOne
    @JoinColumn(nullable=false,name= "id_producto", referencedColumnName="id_producto")
    private Producto producto;
    @ManyToOne
    @JoinColumn(nullable=false, name="id_estatus_produccion", referencedColumnName="id_estatus_produccion")
    private EstatusProduccion estatusProduccion;
    @ManyToOne
    @JoinColumn(nullable=false, name="id_persona", referencedColumnName="id_persona")
    private Persona persona;

    public Long getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Long idProduccion) {
        this.idProduccion = idProduccion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(Date fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public BigDecimal getCantidadProductofinal() {
        return cantidadProductofinal;
    }

    public void setCantidadProductofinal(BigDecimal cantidadProductofinal) {
        this.cantidadProductofinal = cantidadProductofinal;
    }

    public BigDecimal getCantidadLeche() {
        return cantidadLeche;
    }

    public void setCantidadLeche(BigDecimal cantidadLeche) {
        this.cantidadLeche = cantidadLeche;
    }

    public BigDecimal getCantidadYogurt() {
        return cantidadYogurt;
    }

    public void setCantidadYogurt(BigDecimal cantidadYogurt) {
        this.cantidadYogurt = cantidadYogurt;
    }

    public BigDecimal getCantidadSuero() {
        return cantidadSuero;
    }

    public void setCantidadSuero(BigDecimal cantidadSuero) {
        this.cantidadSuero = cantidadSuero;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public EstatusProduccion getEstatusProduccion() {
        return estatusProduccion;
    }

    public void setEstatusProduccion(EstatusProduccion estatusProduccion) {
        this.estatusProduccion = estatusProduccion;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


    

    
    
    
    
}
