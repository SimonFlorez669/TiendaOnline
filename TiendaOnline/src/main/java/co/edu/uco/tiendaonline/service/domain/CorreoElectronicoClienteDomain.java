package co.edu.uco.tiendaonline.service.domain;

import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;

public class CorreoElectronicoClienteDomain {
	
	
	public String correoElectronico;
	public boolean correoElectronicoConfirmado;
	
	
	
	
	public CorreoElectronicoClienteDomain() {
		setCorreoElectronico(UtilTexto.VACIO);
		setCorreoElectronicoConfirmado(false);
	}
	
	
	
	
	
	public CorreoElectronicoClienteDomain(final String correoElectronico,final  boolean correoElectronicoConfirmado) {
		setCorreoElectronico(correoElectronico);
		setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
	}


	public final String getCorreoElectronico() {
		return correoElectronico;
	}
	
	
	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}


	
	public final CorreoElectronicoClienteDomain setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}
	
	


	public final CorreoElectronicoClienteDomain setCorreoElectronicoConfirmado(boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	

}
