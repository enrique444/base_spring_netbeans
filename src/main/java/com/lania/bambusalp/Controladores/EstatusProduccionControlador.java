/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lania.bambusalp.Controladores;

/**
 *
 * @author Fernanda Zurita
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Entidades.EstatusProduccion;
import com.lania.bambusalp.Servicios.EstatusProduccionServicio;
					// http://localhost:8080/
@RestController		//<<--- Esta clase es un controlador
@RequestMapping(path = "/estatusProduccion")		// <-----http://localhost:8080/estatusProduccion
public class EstatusProduccionControlador {
	@Autowired
	private EstatusProduccionServicio estatusProduccionServicio;
	
	@GetMapping("/list")		//<<-- Este es un servicio GET  http://localhost:8080/estatusProduccion/list
	public List<EstatusProduccion> obtenerListaDeEstatusProduccion(){
		return estatusProduccionServicio.obtenerTodosLosEstatus();
	}
	
	@GetMapping("/{id_estatus_produccion}")	//<<-- Este es un servicio GET	http://localhost:8080/estatusProduccion/5
	public EstatusProduccion obtenerEstatusProduccion(@PathVariable("id_estatus_produccion") Long id_estatus_produccion) {
		return estatusProduccionServicio.obtenerEstatusProduccionPorID(id_estatus_produccion);
	}
	
	@PostMapping("/create")
	public EstatusProduccion crearEstatusProduccion(@RequestBody EstatusProduccion estNuevo) {
		return estatusProduccionServicio.crearEstatusProduccion(estNuevo);
	}
	
	@PutMapping("/edit/{id_estatus_produccion}")
	public EstatusProduccion editarEstatusProduccion(@RequestBody  EstatusProduccion estConModificaciones, @PathVariable("id_estatus_produccion") Long id_estatus_produccion) {
		return estatusProduccionServicio.editarEstatusProduccion(estConModificaciones, id_estatus_produccion);
	}
	
	@DeleteMapping("/delete/{id_estatus_produccion}")
	public EstatusProduccion eliminarEstatusProduccion(@PathVariable("id_estatus_produccion") Long id_estatus_produccion) {
		return estatusProduccionServicio.eliminarEstatusProduccion(id_estatus_produccion);
	}
}

