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
import Entidades.DetalleAplicacionProducto;
import com.lania.bambusalp.Servicios.DetalleAplicacionProductoServicio;
					// http://localhost:8080/
@RestController		//<<--- Esta clase es un controlador
@RequestMapping(path = "/detalleAplicacionProducto")		// <-----http://localhost:8080/detalleAplicacionProducto
public class DetalleAplicacionProductoControlador {
	@Autowired
	private DetalleAplicacionProductoServicio detalleAplicacionProductoServicio;
	
	@GetMapping("/list")		//<<-- Este es un servicio GET  http://localhost:8080/detalleAplicacionProducto/list
	public List<DetalleAplicacionProducto> obtenerListaDeDetalleAplicacionProductoes(){
		return detalleAplicacionProductoServicio.obtenerTodosLosDetallesAplicacionProducto();
	}
	
	@GetMapping("/{id_detalle_aplicacion_producto}")	//<<-- Este es un servicio GET	http://localhost:8080/detalleAplicacionProductoServicio/5
	public DetalleAplicacionProducto obtenerDetalleAplicacionProducto(@PathVariable("id_detalle_aplicacion_producto") Long id_detalle_aplicacion_producto) {
		return detalleAplicacionProductoServicio.obtenerDetalleAplicacionProductoPorID(id_detalle_aplicacion_producto);
	}
	

	@PostMapping("/create")
	public DetalleAplicacionProducto crearDetalleAplicacionProducto(@RequestBody DetalleAplicacionProducto detNuevo) {
		return detalleAplicacionProductoServicio.crearDetalleAplicacionProducto(detNuevo);
	}
	
	@PutMapping("/edit/{id_detalle_aplicacion_producto}")
	public DetalleAplicacionProducto editarDetalleAplicacionProducto(@RequestBody  DetalleAplicacionProducto detConModificaciones, @PathVariable("id_detalle_aplicacion_producto") Long id_detalle_aplicacion_producto) {
		return detalleAplicacionProductoServicio.editarDetalleAplicacionProducto(detConModificaciones, id_detalle_aplicacion_producto);
	}
	
	@DeleteMapping("/delete/{id_detalle_aplicacion_producto}")
	public DetalleAplicacionProducto eliminarDetalleAplicacionProducto(@PathVariable("id_detalle_aplicacion_producto") Long id_detalle_aplicacion_producto) {
		return detalleAplicacionProductoServicio.eliminarDetalleAplicacionProducto(id_detalle_aplicacion_producto);
	}
}
