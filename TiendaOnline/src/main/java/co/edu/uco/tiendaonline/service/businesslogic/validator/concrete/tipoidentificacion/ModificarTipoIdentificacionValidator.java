package co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.tiendaonline.service.businesslogicvalidator.Validator;
import co.edu.uco.tiendaonline.service.domain.TipoIdentificacionDomain;

public class ModificarTipoIdentificacionValidator implements Validator <TipoIdentificacionDomain>{

	
	
	private static final Validator<TipoIdentificacionDomain> instancia = new ModificadorTipoIndetificacionValidator();

	
	@Override
	public void execute(TipoIdentificacionDomain data) {
		// TODO Auto-generated method stub
		
	}

	

	
	
	

}
