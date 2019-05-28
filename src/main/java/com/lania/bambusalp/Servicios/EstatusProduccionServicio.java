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
import com.lania.bambusalp.Entidades.EstatusProduccion;
import com.lania.bambusalp.Repositorios.EstatusProduccionRepositorio;
@Service		
public class EstatusProduccionServicio {
	@Autowired		
	private EstatusProduccionRepositorio estatusProduccionRepositorio;
	
	public List<EstatusProduccion> obtenerTodosLosEstatus(){
		return this.estatusProduccionRepositorio.findAll();
	}
	
	public EstatusProduccion obtenerEstatusProduccionPorID(Long id_estatus_produccion) {
		Optional<EstatusProduccion> optional = this.estatusProduccionRepositorio.findById(id_estatus_produccion);
		return optional.get();
	}
	
	public EstatusProduccion crearEstatusProduccion(EstatusProduccion estatusProduccion) {
		estatusProduccion = this.estatusProduccionRepositorio.saveAndFlush(estatusProduccion);
		return estatusProduccion;
	}
	
	public EstatusProduccion editarEstatusProduccion(EstatusProduccion estConModificaciones, Long id_estatus_produccion) {
//		Optional<EstatusProduccion> optional = this.estatusProduccionRepositorio.findById(id_estatus_produccion);
//		if(optional.isPresent()) {
//			EstatusProduccion estViejo = optional.get();
//			estViejo.setNombre(estConModificaciones.getNombre());
//			estConModificaciones = this.estatusProduccionRepositorio.saveAndFlush(estViejo);
//		}
		return estConModificaciones;
	}
	
	public EstatusProduccion eliminarEstatusProduccion(Long id_estatus_produccion) {
		Optional<EstatusProduccion> optional = this.estatusProduccionRepositorio.findById(id_estatus_produccion);
		EstatusProduccion eliminado = optional.get();
		this.estatusProduccionRepositorio.deleteById(id_estatus_produccion);
		return eliminado;
	}
}

