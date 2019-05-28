/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lania.bambusalp.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Cinth
 */
@Entity
@Table(name="estatus_produccion")
public class EstatusProduccion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_estatus_produccion")
    private Long idEstatusProduccion;
    @Column(name="nombre")
    private String nombre;

    public Long getIdEstatusProduccion() {
        return idEstatusProduccion;
    }

    public void setIdEstatusProduccion(Long idEstatusProduccion) {
        this.idEstatusProduccion = idEstatusProduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
