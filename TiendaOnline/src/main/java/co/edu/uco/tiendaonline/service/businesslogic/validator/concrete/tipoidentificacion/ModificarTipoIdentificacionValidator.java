package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.tiendaonline.service.businesslogicvalidator.Validator;
import co.edu.uco.tiendaonline.service.domain.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.CodigoTipoIdentificacionValidatorRule;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.NombreTipoIdentificacionValidatorRule;
import co.edu.uco.tiendaonline.service.domain.tipodentificacion.rules.TipoIdentificacionValidationRule;

public class ModificarTipoIdentificacionValidator implements Validator <TipoIdentificacionDomain>{

	
	
private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();
	
	@Override
	public final void execute(final TipoIdentificacionDomain data) {
			TipoIdentificacionValidationRule.ejecutarValidacion(data);
			IdTipoIdentificacionValidationRule.ejecutarValidacion(data.getId());
			CodigoTipoIdentificacionValidatorRule.ejecutarValidacion(data.getCodigo());
			NombreTipoIdentificacionValidatorRule.ejecutarValidacion(data.getNombre());
		
		
	}
	public static final void ejecutar (final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}
	
	
	

}
