package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.TiendaOnline.service.businesslogic.validator.concrete.tipoidentificacion.ModificarTipoIdentificacionValidator;
import co.edu.uco.tiendaonline.service.businesslogic.validator.Validator;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.CodigoTipoIdentificacionValidatorRule;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.NombreTipoIdentificacionValidatorRule;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.TipoIdentificacionValidationRule;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public class ModificarTipoIdentificacionValidator implements Validator <TipoIdentificacionDomain>{


	private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();
	
	@Override
	public final void execute(final TipoIdentificacionDomain data) {
			TipoIdentificacionValidationRule.ejecutarValidacion(data);
			IdTipoIdentificacionValidationRule.ejecutarValidacion(data.getId());
			CodigoTipoIdentificacionValidationRule.ejecutarValidacion(data.getCodigo());
			NombreTipoIdentificacionValidationRule.ejecutarValidacion(data.getNombre());
		
		
	}
	public static final void ejecutar (final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}

	
}