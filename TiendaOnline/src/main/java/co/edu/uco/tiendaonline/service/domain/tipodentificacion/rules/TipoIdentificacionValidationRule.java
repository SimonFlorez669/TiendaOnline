package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.util.UtilObjeto;
import co.edu.uco.tiendaonline.service.businesslogic.validator.Validator;
import co.edu.uco.tiendaonline.service.domain.ValidationRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public class TipoIdentificacionValidationRule implements ValidationRule<TipoIdentificacionDomain> {
	
	
	

	
	private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();

	private TipoIdentificacionValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final TipoIdentificacionDomain dato) {
		instancia.execute(dato);
		
	}
	@Override
	public final void validar (final TipoIdentificacionDomain dato) {
		if (UtilObjeto.esNulo(dato)) {
			var mensajeUsuario= " No es posible llevar a cablo la operacion deseada con el Tipo de Identificacion";
			throw ServiceTiendaOnlineException.crear(mensajeUsuario);
		}
	}
	
}
