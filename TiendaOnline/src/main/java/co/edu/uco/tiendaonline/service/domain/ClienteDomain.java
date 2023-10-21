package co.edu.uco.tiendaonline.service.domain;

import java.sql.Date;
import java.util.UUID;

import co.edu.uco.tiendaonline.service.domain.tipoidentificacion.TipoIdentificacion;



public class ClienteDomain {
	
	private UUID  id;
	private TipoIdentificacion tipoidentificacion;
	private NombreCompletoClienteDomain nombreCompleto;
	private CorreoElectronicoClienteDomain correoelectronico;
	private NumeroTelefonoMovilClienteDomain numeroCompleto;
	private Date fechaNacimiento;
	private String identificacion;
	
	
	
	
	
	
	
	
	public ClienteDomain(final UUID id,final  TipoIdentificacionDomain tipoidentificacion,
			final NombreCompletoClienteDomain nombreCompleto,final  CorreoElectronicoClienteDomain correoelectronico,
			final NumeroTelefonoMovilClienteDomain numeroCompleto, final Date fechaNacimiento, String identificacion) {
		super();
		this.id = id;
		this.tipoidentificacion = tipoidentificacion;
		this.nombreCompleto = nombreCompleto;
		this.correoelectronico = correoelectronico;
		this.numeroCompleto = numeroCompleto;
		this.fechaNacimiento = fechaNacimiento;
		this.identificacion = identificacion;
	}
	
	
	
	public final UUID getId() {
		return id;
	}
	public final TipoIdentificacionDomain getTipoidentificacion() {
		return tipoidentificacion;
	}
	public final NombreCompletoClienteDomain getNombreCompleto() {
		return nombreCompleto;
	}
	public final CorreoElectronicoClienteDomain getCorreoelectronico() {
		return correoelectronico;
	}
	public final NumeroTelefonoMovilClienteDomain getNumeroCompleto() {
		return numeroCompleto;
	}
	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public final String getIdentificacion() {
		return identificacion;
	}
	
	
	
	
	
	
	
	public final void setId(UUID id) {
		this.id = id;
	}
	public final ClienteDomain setTipoidentificacion(TipoIdentificacionDomain tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
		return this;
	}
	
	public final ClienteDomain setNombreCompleto(NombreCompletoClienteDomain nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}
	
	
	public final ClienteDomain setCorreoelectronico(CorreoElectronicoClienteDomain correoelectronico) {
		this.correoelectronico = correoelectronico;
		return this;
	}
	
	
	public final ClienteDomain setNumeroCompleto(NumeroTelefonoMovilClienteDomain numeroCompleto) {
		this.numeroCompleto = numeroCompleto;
		return this;
	}
	
	
	public final  ClienteDomain setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}
	
	
	public final ClienteDomain setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
		return this;
	}
	
	
	
	
	
	
	
	
	

}
