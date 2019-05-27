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
import Entidades.DetalleAplicacionProducto;
import Repositorios.DetalleAplicacionProductoRepositorio;
@Service		
public class DetalleAplicacionProductoServicio {
	@Autowired		
	private DetalleAplicacionProductoRepositorio detalleAplicacionProductoRepositorio;
	
	public List<DetalleAplicacionProducto> obtenerTodosLosDetallesAplicacionProducto(){
		return this.detalleAplicacionProductoRepositorio.findAll();
	}
	
	public DetalleAplicacionProducto obtenerDetalleAplicacionProductoPorID(Long id_detalle_aplicacion_producto) {
		Optional<DetalleAplicacionProducto> optional = this.detalleAplicacionProductoRepositorio.findById(id_detalle_aplicacion_producto);
		return optional.get();
	}
	
	public DetalleAplicacionProducto crearDetalleAplicacionProducto(DetalleAplicacionProducto detalle) {
		detalle = this.detalleAplicacionProductoRepositorio.saveAndFlush(detalle);
		return detalle;
	}
	
	public DetalleAplicacionProducto editarDetalleAplicacionProducto(DetalleAplicacionProducto detConModificaciones, Long id_detalle_aplicacion_producto) {
//		Optional<DetalleAplicacionProducto> optional = this.detalleAplicacionProductoRepositorio.findById(id_detalle_aplicacion_producto);
//		if(optional.isPresent()) {
//			DetalleAplicacionProducto detViejo = optional.get();
//			detViejo.setNombre(detConModificaciones.getNombre());
//			detConModificaciones = this.detalleAplicacionProductoRepositorio.saveAndFlush(detViejo);
//		}
		return detConModificaciones;
	}
	
	public DetalleAplicacionProducto eliminarDetalleAplicacionProducto(Long id_detalle_aplicacion_producto) {
		Optional<DetalleAplicacionProducto> optional = this.detalleAplicacionProductoRepositorio.findById(id_detalle_aplicacion_producto);
		DetalleAplicacionProducto eliminado = optional.get();
		this.detalleAplicacionProductoRepositorio.deleteById(id_detalle_aplicacion_producto);
		return eliminado;
	}
    
}
