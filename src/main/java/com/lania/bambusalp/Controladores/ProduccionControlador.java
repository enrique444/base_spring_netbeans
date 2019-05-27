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
import Entidades.Produccion;
import com.lania.bambusalp.Servicios.ProduccionServicio;
					// http://localhost:8080/
@RestController		//<<--- Esta clase es un controlador
@RequestMapping(path = "/produccion")		// <-----http://localhost:8080/produccion
public class ProduccionControlador {
	@Autowired
	private ProduccionServicio produccionServicio;
	
	@GetMapping("/list")		//<<-- Este es un servicio GET  http://localhost:8080/produccion/list
	public List<Produccion> obtenerListaDeProducciones(){
		return produccionServicio.obtenerTodasLasProducciones();
	}
	
	@GetMapping("/{id_produccion}")	//<<-- Este es un servicio GET	http://localhost:8080/produccion/5
	public Produccion obtenerProduccion(@PathVariable("id_produccion") Long id_produccion) {
		return produccionServicio.obtenerProduccionPorID(id_produccion);
	}
	
	@PostMapping("/create")
	public Produccion crearProduccion(@RequestBody Produccion prodNueva) {
		return produccionServicio.crearProduccion(prodNueva);
	}
	
	@PutMapping("/edit/{id_produccion}")
	public Produccion editarProduccion(@RequestBody Produccion prodConModificaciones, @PathVariable("id_produccion") Long id_produccion) {
		return produccionServicio.editarProduccion(prodConModificaciones, id_produccion);
	}
	
	@DeleteMapping("/delete/{id_produccion}")
	public Produccion eliminarProduccion(@PathVariable("id_produccion") Long id_produccion) {
		return produccionServicio.eliminarProduccion(id_produccion);
	}
}
