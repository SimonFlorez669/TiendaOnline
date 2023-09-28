package co.edu.uco.tiendaonline.data.entity;

import java.sql.Date;
import java.util.UUID;

public class ClienteEntity {
	
	private UUID  id;
	private TipoIdentificacion tipoidentificacion;
	private NombreCompletoClienteEntity nombreCompleto;
	private CorreoElectronicoClienteEntity correoelectronico;
	private NumeroTelefonoMovilClienteEntity numeroCompleto;
	private Date fechaNacimiento;
	
	
	
	private ClienteEntity(final UUID id,final TipoIdentificacion tipoidentificacion,
			final CorreoElectronicoClienteEntity correoElectronico,final Date fechaNacimiento,final NumeroTelefonoMovilClienteEntity numeroCompleto,final NombreCompletoClienteEntity nombreCompleto) {
		super();
	
		setId(null);
		setTipoidentificacion(tipoidentificacion);
	    setCorreoelectronico(correoElectronico);
        setNumeroCompleto(numeroCompleto);
	    setFechaNacimiento(fechaNacimiento);
	    setNombreCompleto(nombreCompleto);
		
	}
	
	public static final ClienteEntity crear(final UUID id,final TipoIdentificacion tipoidentificacion,
			final CorreoElectronicoClienteEntity correoelectronico,final NumeroTelefonoMovilClienteEntity numeroCompleto,final NombreCompletoClienteEntity nombreCompleto,
			final Date fechaNacimiento) {
		return new ClienteEntity(id,tipoidentificacion,correoelectronico,fechaNacimiento, numeroCompleto,nombreCompleto);
	}



	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}
	
	
	private final void setNombreCompleto(NombreCompletoClienteEntity nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	

	private final CorreoElectronicoClienteEntity getCorreoelectronico() {
		return correoelectronico;
	}
	

	private final void setCorreoelectronico(CorreoElectronicoClienteEntity correoelectronico) {
		this.correoelectronico = correoelectronico;
	}
	

	private final void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	



	
	public final UUID getId() {
		return id;
	}



	public final TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}


	private final NombreCompletoClienteEntity getNombreCompleto() {
		return nombreCompleto;
	}

	public final String getCorreoElectronico() {
		return correoelectronico.correoElectronico;
	}



	public final boolean isCorreoElectronicoConfirmado() {
		return correoelectronico.correoElectronicoConfirmado;
	}



	

	private final NumeroTelefonoMovilClienteEntity getNumeroCompleto() {
		return numeroCompleto;
	}
	
	
	

	private final void setNumeroCompleto(NumeroTelefonoMovilClienteEntity numeroCompleto) {
		this.numeroCompleto = numeroCompleto;
	}

	private final Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	
	
	
	
	
}
