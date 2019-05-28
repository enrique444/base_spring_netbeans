/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lania.bambusalp.Servicios;

/**
 *
 * @author Fernanda Zurita
 */
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lania.bambusalp.Entidades.Produccion;
import com.lania.bambusalp.Repositorios.ProduccionRepositorio;
@Service		
public class ProduccionServicio {
	@Autowired		
	private ProduccionRepositorio produccionRepositorio;
	
	public List<Produccion> obtenerTodasLasProducciones(){
		return this.produccionRepositorio.findAll();
	}
	
	public Produccion obtenerProduccionPorID(Long id_produccion) {
		Optional<Produccion> optional = this.produccionRepositorio.findById(id_produccion);
		return optional.get();
	}
	
	public Produccion crearProduccion(Produccion produccion) {
		produccion = this.produccionRepositorio.saveAndFlush(produccion);
		return produccion;
	}
	
	
	public Produccion editarProduccion(Produccion prodConModificaciones, Long id_produccion) {
		//Optional<Produccion> optional = this.produccionRepositorio.save();
		//if(optional.isPresent()) {
			//Produccion prodViejo = optional.get();
			//prodViejo.setIdProduccion(prodConModificaciones.getIdProduccion());
			//prodConModificaciones = this.produccionRepositorio.saveAndFlush(prodViejo);
		//}
		return prodConModificaciones;
	}
	
	public Produccion eliminarProduccion(Long id_produccion) {
		Optional<Produccion> optional = this.produccionRepositorio.findById(id_produccion);
		Produccion eliminado = optional.get();
		this.produccionRepositorio.deleteById(id_produccion);
		return eliminado;
	}
}
