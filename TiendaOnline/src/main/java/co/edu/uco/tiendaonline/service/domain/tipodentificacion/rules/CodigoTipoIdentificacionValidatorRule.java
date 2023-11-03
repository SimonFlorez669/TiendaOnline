package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;



import java.util.UUID;

import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;
import co.edu.uco.tiendaonline.service.domain.ValidationRule;


public final class CodigoTipoIdentificacionValidatorRule implements ValidationRule<String>{

	private static final ValidationRule<String> instancia = new CodigoTipoIdentificacionValidatorRule();
	private CodigoTipoIdentificacionValidatorRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final String dato) {
		instancia.validar(dato);
	}
	
	@Override
	public void validar(String dato) {
		validarLongitud(dato);
		validarObligatoriedad(dato);
		validarFormato(dato);
		
	}
	
	
	
	
	
	
	private final void validarLongitud(final String dato) {
		if(UtilTexto.longitudMaximaValida(dato,50)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000073);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000074);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetras(dato)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000075);
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}

	@Override
	public void validar(TipoIdentificacionDomain data) {
		// TODO Auto-generated method stub
		
	}

	public void validar(UUID dato) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
	
	
	
	

}
