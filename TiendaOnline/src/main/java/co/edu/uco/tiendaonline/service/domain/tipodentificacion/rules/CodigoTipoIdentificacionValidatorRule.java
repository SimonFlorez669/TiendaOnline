package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;
import co.edu.uco.tiendaonline.service.domain.ValidationRule;

public final class CodigoTipoIdentificacionValidatorRule implements ValidationRule<String>{
	
	private static final ValidationRule<String> instancia = new CodigoTipoIdentificacionValidationRule();
	
	
	
	private CodigoTipoIdentificacionValidatorRule() {
		super();
	}
		
	
	public static final void ejecutarValidacion(final String dato) {
		
		instancia.validar(dato);
	}
		
		
	
	

	@Override
	public final void validar(final UUID dato) {
		validarLongitud(dato);
		validarObligatoriedad(dato);
		validarFormato(dato);
		
		
	}
	
	
	
	
	
	private final void validarObligatoriedad( final UUID dato) {
		
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = " La longitud del codigo del tipo de identificacion es un dato obligatorio";
	    	throw ServiceTiendaOnlineException.crear(mensajeUsuario);}

			
		}
		
	
	
	
	
	private final void validarFormato(final String dato) {
		if(UtilTexto.contieneSoloLetras(dato)){
			var mensajeUsuario = " La longitud del codigo del tipo de identificacion solo puede contener letras";
    	    throw ServiceTiendaOnlineException.crear(mensajeUsuario);}
	}
		
		
	}
	
	
	

}
