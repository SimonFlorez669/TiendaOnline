package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;

import java.util.UUID;

import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.uco.tiendaonline.service.domain.ValidationRule;



public final class IdTipoIdentiticacionValidationRule implements ValidationRule<UUID> {
	
	
	
	
	private static final ValidationRule<UUID> instancia = new IdTipoIdentiticacionValidationRule();
	
	private IdTipoIdentiticacionValidationRule() {
		
	}
	
	public static final void ejecutarValidacion(final UUID dato) {
		instancia.validar(dato);
	}
	
	public void validar(final UUID dato) {
		validarObligatoriedad(dato);	
	}
	
	private final void validarObligatoriedad(final UUID dato) {
		if(UtilObjeto.esNulo(dato)) {
			var mensajeUsuario = "La longitud del codigo del tipo de identificacion es un dato de tipo obligatorio...";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	private final void validarFormato(final UUID dato) {
		if(!UtilObjeto.esNulo(dato)) {
			var mensajeUsuario = "La longitud del codigo del tipo de identificacion solo puede contener letras...";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}

	@Override
	public void validar(TipoIdentificacionDomain data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validar(String dato) {
		// TODO Auto-generated method stub
		
	}

}
