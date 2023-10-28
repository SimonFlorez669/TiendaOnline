package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.tiendaonline.service.businesslogicvalidator.Validator;
import co.edu.uco.tiendaonline.service.domain.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacion;

public final class RegistrarTipoIdentificacionValidator implements Validator<TipoIdentificacion> {

	
	private static final Validator<TipoIdentificacionDomain> instancia = new RegistrarTipoIdentificacionValidator();
	
	
	private RegistrarTipoIdentificacionValidator () {
		super();
	}
	
	
	
	public static final void ejecutar(final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}
	
	
	@Override
	public final void execute(final TipoIdentificacion data) {
		CodigoTipoIdentificacionValidationRule.ejecutarValidacion(data.getCodigo());
		NombreTipoIdentificacionValidator.ejecutarValidacion(data.getNombre());	
	}

	
	
	
	

}
