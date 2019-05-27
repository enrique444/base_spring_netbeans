/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorios;

import Entidades.DetalleAplicacionProducto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cinth
 */
@Repository
public interface DetalleAplicacionProductoRepositorio extends JpaRepository<DetalleAplicacionProducto, Long> {
    
}
