package co.edu.uco.tiendaonline.controller.tipoidentificacion.controller;

import java.lang.annotation.Retention;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import co.edu.uco.tiendaonline.controller.support.response.Respuesta;
import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.service.dto.TipoIdentificacionDTO;
import co.edu.uco.tiendaonline.service.facade.concrete.tipoidentificacion.RegistrarTipoIdentificacionFacade;

@RestController
@RequestMapping("/api/v1/tipoindetificacion")
public class TipoIdentificacionControllerImpl implements TipoIdentificacionController {
	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TipoIdentificacionControllerImpl.class);
	
	
	@GetMapping("/dummy")
	public TipoIdentificacionDTO obtenerdummy() {
		LOGGER.info(" el dummi de tipo identificacion se genero exitosamente");
		return TipoIdentificacionDTO.crear();
	}
	
	@GetMapping("/(id)")
	public final TipoIdentificacionDTO consultar(@RequestBody TipoIdentificacionDTO dto) {
		return dto;
	}
	
	@GetMapping
	public final UUID ConsultarPorId(@PathVariable ("id") UUID id) {
		return id;
	}
	
	
	
	
	@PostMapping
	public ResponseEntity<Respuesta<TipoIdentificacionDTO>> registrar(@RequestBody TipoIdentificacionDTO dto) {
		
		Respuesta<TipoIdentificacionDTO> respuesta = new Respuesta<>();
		HttpStatus codigoHttp = HttpStatus.BAD_REQUEST;
		
		try {
			
			RegistrarTipoIdentificacionFacade facade = new RegistrarTipoIdentificacionFacade();
			facade.execute(dto);
			codigoHttp = HttpStatus.OK;
			respuesta.getMensajes().add("El tipo de identificacio fue registrado exitosamente");
			LOGGER.info("el tipo de idenficiacion fue registrado exitosamente");			
		} catch (final TiendaOnlineException exception) {
			
			respuesta.getMensajes().add(exception.getMensajeUsuario());
			LOGGER.error(exception.getMensajeTecnico(), exception.getExceptionRaiz());
			
		}catch (Exception excepcion) {
			codigoHttp= HttpStatus.INTERNAL_SERVER_ERROR;
			respuesta.getMensajes().add(" se ha presentado un problema inesperado tratado de registrar el tipo de identificacion deseado");
			LOGGER.error(
					"se ha presentado un problema inesperado tratado de registrar el tipo de identificacion deseado", excepcion);
		}
		
		return new ResponseEntity<>(respuesta , codigoHttp);
	}
	
	@PutMapping("/(id)")
	public TipoIdentificacionDTO modificar(@PathVariable("id") UUID id, @RequestBody  TipoIdentificacionDTO dto) {
		dto.setId(id);
		return dto;
	
	}
	
	
	@DeleteMapping("/{id}")
	public UUID eliminar(@PathVariable("id")UUID id) {
		return id;
		
	}

}
