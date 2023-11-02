package co.edu.uco.tiendaonline.service.domain;

import java.sql.Date;
import java.util.UUID;


import co.edu.uco.tiendaonline.data.entity.CorreoElectronicoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.NombreCompletoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.NumeroTelefonoMovilClienteEntity;
import co.edu.uco.tiendaonline.data.entity.TipoIdentificacionEntity;
import co.edu.uco.tiendaonline.service.domain.support.CorreoElectronicoClienteDomain;
import co.edu.uco.tiendaonline.service.domain.support.NombreCompletoClienteDomain;
import co.edu.uco.tiendaonline.service.domain.support.NumeroTelefonoMovilClienteDomain;
import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacionDomain;




public class ClienteDomain {
	
	
	private UUID id;
	private TipoIdentificacionDomain tipoIdentificacion;
	private String identificacion;
	private NombreCompletoClienteDomain nombreCompleto;
	private CorreoElectronicoClienteDomain correoElectronico;
	private NumeroTelefonoMovilClienteDomain numeroTelefonoMovil;
	
	private ClienteDomain(final UUID id, final TipoIdentificacionDomain tipoIdentificacion, final String identificacion, final NombreCompletoClienteDomain nombreClienteDomain, final CorreoElectronicoClienteDomain correoClienteDomain, final NumeroTelefonoMovilClienteDomain numeroTelefonoMovilClienteDomain) {
		
		setId(id);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombreCompleto(nombreClienteDomain);
		setCorreoElectronico(correoClienteDomain);
		setNumeroTelefonoMovil(numeroTelefonoMovilClienteDomain);
		
	}
	public static final ClienteDomain crear(final UUID id, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion, final NombreCompletoClienteEntity nombreCliente,
		final CorreoElectronicoClienteEntity correoCliente, final NumeroTelefonoMovilClienteEntity numeroTelefonoMovilCliente) {
		
		return new ClienteDomain(id, null, identificacion, null, null, null);
				
	}
	private final void setId(UUID id) {
		this.id = id;
	}
	private final void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	private final void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public final void setNombreCompleto(NombreCompletoClienteDomain nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public final CorreoElectronicoClienteDomain getCorreoElectronico() {
		return correoElectronico;
	}
	private final void setCorreoElectronico(CorreoElectronicoClienteDomain correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public final NumeroTelefonoMovilClienteDomain getNumeroTelefonoMovil() {
		return numeroTelefonoMovil;
	}
	private final void setNumeroTelefonoMovil(NumeroTelefonoMovilClienteDomain numeroTelefonoMovil) {
		this.numeroTelefonoMovil = numeroTelefonoMovil;
	}
	public final UUID getId() {
		return id;
	}
	public final TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public final String getIdentificacion() {
		return identificacion;
	}
	public final NombreCompletoClienteDomain getNombreCompleto() {
		return nombreCompleto;
	}
	
	

}
