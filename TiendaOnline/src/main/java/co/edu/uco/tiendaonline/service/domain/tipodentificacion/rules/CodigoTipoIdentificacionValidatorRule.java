package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;

import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.uco.tiendaonline.service.domain.ValidationRule;


public final class CodigoTipoIdentificacionValidatorRule implements ValidationRule<String>{

	@Override
	public void validar(String dato) {
		// TODO Auto-generated method stub
		
	}
	
	private final void validarLongitud(final String dato) {
		if(UtilTexto.longitudMaximaValida(dato,50)) {
			var mensajeUsuario = "La longitud del codigo del tipo de identificacion no es valida. la longitud Maxima son 50 caracteres";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = "La longitud del codigo del tipo de identificacion es un dato de tipo obligatorio...";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetras(dato)) {
			var mensajeUsuario = "La longitud del codigo del tipo de identificacion solo puede contener letras...";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
	
	
	
	
	
	
	
	

}
