package co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules;

import co.edu.uco.tiendaonline.service.domain.ValidationRule;

public class TipoIdentificacionValidationRule implements ValidationRule<TipoIdentificacionDomain> {
	
	
	
	private static final ValidationRule<TipoIdentificacionDomain> instancia = new TipoIdentificacionDomain();
	
	private TipoIdentificacionValidationRule() {
		super();
	}
	
	
	public static final void ejecutarValidacion(final TipoIdentificacionDomain dato) {
		instancia.validar(dato);
	}
	

}
