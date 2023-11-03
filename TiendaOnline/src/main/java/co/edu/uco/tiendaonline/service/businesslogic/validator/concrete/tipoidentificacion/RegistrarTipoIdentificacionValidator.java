package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.tiendaonline.service.businesslogic.validator.Validator;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.CodigoTipoIdentificacionValidatorRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public final class RegistrarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain> {

	
	private static final Validator<TipoIdentificacionDomain> instancia = new RegistrarTipoIdentificacionValidator();
	
	
	private RegistrarTipoIdentificacionValidator () {
		super();
	}
	
	
	
	public static final void ejecutar(final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}
	
	
	@Override
	public final void execute(final TipoIdentificacionDomain data) {
		CodigoTipoIdentificacionValidatorRule.ejecutarValidacion(data.getCodigo());
		NombreTipoIdentificacionValidator.ejecutarValidacion(data.getNombre());	
	}


	
	
	

}
