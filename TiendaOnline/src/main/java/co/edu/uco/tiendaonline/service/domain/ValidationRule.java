package co.edu.uco.tiendaonline.service.domain;

import java.util.UUID;

import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public interface ValidationRule<T> {
	
	void validar(TipoIdentificacionDomain data);

	void validar(String dato);

	void validar(UUID dato);
	

}
