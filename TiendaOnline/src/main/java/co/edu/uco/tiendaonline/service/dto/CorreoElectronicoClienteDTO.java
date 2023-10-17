package co.edu.uco.tiendaonline.service.dto;

import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;

public class CorreoElectronicoClienteDTO {
	
	public String correoElectronico;
	public boolean correoElectronicoConfirmado;
	
	
	
	public CorreoElectronicoClienteDTO() {
		setCorreoElectronico(UtilTexto.VACIO);
		setCorreoElectronicoConfirmado(false);
	}
	

	public CorreoElectronicoClienteDTO(final String correoElectronico, final boolean correoElectronicoConfirmado)
{
             setCorreoElectronico(correoElectronico);
             setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
	}


	public final String getCorreoElectronico() {
		return correoElectronico;
	}
	
	
	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}


	public final CorreoElectronicoClienteDTO setCorreoElectronico(final String correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}


	public final CorreoElectronicoClienteDTO setCorreoElectronicoConfirmado(final boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
		return this;
	}
	
	
	
	
	
	

}
