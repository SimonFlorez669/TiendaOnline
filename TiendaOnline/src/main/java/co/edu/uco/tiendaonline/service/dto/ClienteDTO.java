package co.edu.uco.tiendaonline.service.dto;

import java.sql.Date;
import java.util.UUID;

import ch.qos.logback.core.net.server.Client;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;
import co.edu.uco.tiendaonline.data.entity.CorreoElectronicoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.NombreCompletoClienteEntity;
import co.edu.uco.tiendaonline.data.entity.NumeroTelefonoMovilClienteEntity;
import co.edu.uco.tiendaonline.data.entity.TipoIdentificacionEntity;

public class ClienteDTO {
	
	
	private UUID  id;
	private TipoIdentificacionEntity tipoidentificacion;
	private NombreCompletoClienteEntity nombreCompleto;
	private CorreoElectronicoClienteEntity correoelectronico;
	private NumeroTelefonoMovilClienteEntity numeroCompleto;
	private Date fechaNacimiento;
	private String identificacion;
	
	
	
	public ClienteDTO() {
		
		setId(id); //TODO: ¿como lograr que por defecto se asigne UUID que sea todo con ceros?
		setTipoidentificacion(new TipoIdentificacionDTO());
		setIdentificacion(UtilTexto.VACIO);
		setNombreCompleto(new NombreCompletoClienteDTO());
		setCorreoelectronico(new CorreoElectronicoClienteDTO());
		setNumeroCompleto(new NumeroCompletoClienteDTO());
		setFechaNacimiento(fechaNacimiento); //TODO: ¿como lograr que por defecto se asigne una fecha por defecto, que no sea valida, y que sea facilmente de identificar?
		
		
		
		
	}
	
	
	
	
	
	
	public ClienteDTO(final UUID id, final TipoIdentificacionEntity tipoidentificacion, final NombreCompletoClienteEntity nombreCompleto,
			final CorreoElectronicoClienteEntity correoelectronico, final NumeroTelefonoMovilClienteEntity numeroCompleto,
			final Date fechaNacimiento, final String identificacion) {
		
		
		setId(id);
		setTipoidentificacion(tipoidentificacion);
		setNombreCompleto(nombreCompleto);
		setCorreoelectronico(correoelectronico);
		setNumeroCompleto(numeroCompleto);
		setFechaNacimiento(fechaNacimiento);
	}
	
	public final UUID getId() {
		return id;
	}
	public final TipoIdentificacionEntity getTipoidentificacion() {
		return tipoidentificacion;
	}
	
	public final NombreCompletoClienteEntity getNombreCompleto() {
		return nombreCompleto;
	}
	
	public final CorreoElectronicoClienteEntity getCorreoelectronico() {
		return correoelectronico;
	}
	
	public final NumeroTelefonoMovilClienteEntity getNumeroCompleto() {
		return numeroCompleto;
	}
	
	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
	
	public final String getIdentificacion() {
		return identificacion;
	}






	public final void setId(final UUID id) {
		this.id = id;
	}
	public final  ClienteDTO setTipoidentificacion(final TipoIdentificacionEntity tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
		return this;
	}
	
	
	
	
	public final ClienteDTO setNombreCompleto(final NombreCompletoClienteEntity nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}
	
	
	
	public final  ClienteDTO setCorreoelectronico(final CorreoElectronicoClienteEntity correoelectronico) {
		this.correoelectronico = correoelectronico;
		return this;
	}
	
	
	public final ClienteDTO setNumeroCompleto(final NumeroTelefonoMovilClienteEntity numeroCompleto) {
		this.numeroCompleto = numeroCompleto;
		return this;
	}
	
	
	
	public final ClienteDTO setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	}






	public final ClienteDTO setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
