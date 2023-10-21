package co.edu.uco.tiendaonline.service.mapper.entity.concrete;

import ch.qos.logback.core.joran.conditional.IfAction;
import co.edu.uco.tiendaonline.data.entity.TipoIdentificacionEntity;
import co.edu.uco.tiendaonline.service.domain.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.mapper.entity.EntityMapper;

public class TipoIdenfiticacionEntityMapper implements EntityMapper<TipoIdentificacionEntity, TipoIdentificacionDomain> {

	
	
	if(UtilObjeto.esNulo(entity)) {
		
	}
	
	
	@Override
	public TipoIdentificacionDomain toDomain(final TipoIdentificacionEntity entity) {
		TipoIdentificacionDomain resultado = new TipoIdentificacionDomain
		return null;
	}

	@Override
	public TipoIdentificacionEntity toEntity(final TipoIdentificacionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionEntity toEntity(
			co.edu.uco.tiendaonline.service.mapper.entity.concrete.TipoIdentificacionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
