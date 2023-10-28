package co.edu.uco.tiendaonline.controller.tipoidentificacion;

import java.lang.annotation.Retention;
import java.util.UUID;

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
public class TipoIdentificacionController {
	
	@GetMapping("/dummy")
	public TipoIdentificacionDTO obtenerdummy() {
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
			
		} catch (final TiendaOnlineException exception) {
			
			respuesta.getMensajes().add(exception.getMensajeUsuario());
			System.err.print(exception.getMensajeTecnico());
			System.err.print(exception.getLugar());
			exception.getExceptionRaiz().printStackTrace();
			
			//TODO : HACER LOGGIN DE LA EXCEPCION PRESENTADA
			
		}catch (Exception excepcion) {
			
			respuesta.getMensajes().add(" se ha presentado un problema inesperado tratado de registrar el tipo de identificacion deseado");
			//TODO : HACER LOGGIN DE LA EXCEPCION PRESENTADA
			
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
