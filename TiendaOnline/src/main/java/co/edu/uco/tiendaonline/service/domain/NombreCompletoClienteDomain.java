package co.edu.uco.tiendaonline.service.domain;

import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;

public class NombreCompletoClienteDomain {
	
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	
	
	
	public NombreCompletoClienteDomain() {
		setPrimerApellido(UtilTexto.VACIO);
		setSegundoApellido(UtilTexto.VACIO);
		setPrimerNombre(UtilTexto.VACIO);
		setSegundoNombre(UtilTexto.VACIO);
		
	}
	
	
	
	public NombreCompletoClienteDomain(final String primerNombre,final String segundoNombre,final String primerApellido,
			final String segundoApellido) {

             setPrimerNombre(primerNombre);
             setSegundoNombre(segundoNombre);
             setPrimerApellido(primerApellido);
             setSegundoApellido(segundoApellido);
	}


	public final String getPrimerNombre() {
		return primerNombre;
	}
	
	
	public final String getSegundoNombre() {
		return segundoNombre;
	}
	
	
	public final String getPrimerApellido() {
		return primerApellido;
	}
	
	
	public final String getSegundoApellido() {
		return segundoApellido;
	}

	
	

	public final NombreCompletoClienteDomain setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
		return this;
	}


	public final NombreCompletoClienteDomain setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
		return this;
	}


	public final NombreCompletoClienteDomain setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
		return this;
	}


	public final NombreCompletoClienteDomain setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
		return this;
	}
	
	
	

	
	
	
	
	
	
	
	
}
