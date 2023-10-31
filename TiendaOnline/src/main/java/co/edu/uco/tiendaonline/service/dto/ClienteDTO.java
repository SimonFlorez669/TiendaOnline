package co.edu.uco.tiendaonline.service.dto;

import java.sql.Date;
import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.util.UtilTexto;


public class ClienteDTO {
	
	
	private UUID  id;
	private TipoIdentificacionDTO tipoidentificacion;
	private NombreCompletoClienteDTO nombreCompleto;
	private CorreoElectronicoClienteDTO correoelectronico;
	private NumeroTelefonoMovilClienteDTO numeroCompleto;
	private Date fechaNacimiento;
	private String identificacion;
	
	
	
	public ClienteDTO() {
		
		setId(id); //TODO: ¿como lograr que por defecto se asigne UUID que sea todo con ceros?
		setTipoidentificacion(new TipoIdentificacionDTO());
		setIdentificacion(UtilTexto.VACIO);
		setNombreCompleto(new NombreCompletoClienteDTO());
		setCorreoelectronico(new CorreoElectronicoClienteDTO());
		setNumeroCompleto(new NumeroTelefonoMovilClienteDTO());
		setFechaNacimiento(fechaNacimiento); //TODO: ¿como lograr que por defecto se asigne una fecha por defecto, que no sea valida, y que sea facilmente de identificar?
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	public ClienteDTO(final UUID id, final TipoIdentificacionDTO tipoidentificacion, final NombreCompletoClienteDTO nombreCompleto,
			final CorreoElectronicoClienteDTO correoelectronico, final NumeroTelefonoMovilClienteDTO numeroCompleto,
			final Date fechaNacimiento, final String identificacion) {
		setCorreoelectronico(null);
		setFechaNacimiento(fechaNacimiento);
		setId(id);
		setIdentificacion(identificacion);
		setNumeroCompleto(numeroCompleto);
		setTipoidentificacion(tipoidentificacion);
		
	}









	public final UUID getId() {
		return id;
	}
	public final TipoIdentificacionDTO getTipoidentificacion() {
		return tipoidentificacion;
	}
	
	public final NombreCompletoClienteDTO getNombreCompleto() {
		return nombreCompleto;
	}
	
	public final CorreoElectronicoClienteDTO getCorreoelectronico() {
		return correoelectronico;
	}
	
	public final NumeroTelefonoMovilClienteDTO getNumeroCompleto() {
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
	public final  ClienteDTO setTipoidentificacion(final TipoIdentificacionDTO tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
		return this;
	}
	
	
	
	
	public final ClienteDTO setNombreCompleto(final NombreCompletoClienteDTO nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
		return this;
	}
	
	
	
	public final  ClienteDTO setCorreoelectronico(final CorreoElectronicoClienteDTO correoelectronico) {
		this.correoelectronico = correoelectronico;
		return this;
	}
	
	
	public final ClienteDTO setNumeroCompleto(final NumeroTelefonoMovilClienteDTO numeroCompleto) {
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
