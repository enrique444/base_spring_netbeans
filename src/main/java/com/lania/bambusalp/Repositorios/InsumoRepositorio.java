/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lania.bambusalp.Repositorios;

import com.lania.bambusalp.Entidades.Insumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Cinth
 */
@Repository
public interface InsumoRepositorio extends JpaRepository<Insumo, Long> {
    
}
