package co.edu.uco.tiendaonline.controller.tipoidentificacion.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.uco.tiendaonline.controller.support.response.Respuesta;
import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.service.dto.TipoIdentificacionDTO;
import co.edu.uco.tiendaonline.service.facade.concrete.tipoidentificacion.RegistrarTipoIdentificacionFacade;

 @tag

public interface TipoIdentificacionController {
	
	public TipoIdentificacionDTO obtenerdummy();
	
	
	@GetMapping("/(id)")
	 TipoIdentificacionDTO consultar(@RequestBody TipoIdentificacionDTO dto) {
		return dto;
	}
	
	@GetMapping
	public final UUID ConsultarPorId(@PathVariable ("id") UUID id) {
		return id;
	}
	
	
	@PostMapping
	public ResponseEntity<Respuesta<TipoIdentificacionDTO>> registrar(@RequestBody TipoIdentificacionDTO dto) {
	
	}
	
	
	public TipoIdentificacionDTO modificar(@PathVariable("id") UUID id, @RequestBody  TipoIdentificacionDTO dto) {
		
	}
	
	
	public UUID eliminar(@PathVariable("id")UUID id) {
		return id;
		
	}

}
