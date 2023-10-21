package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class ServiceTiendaOnlineException extends TiendaOnlineException{
	
	
	
	
	protected ServiceTiendaOnlineException(LugarException lugar, Throwable exceptionRaiz, String mensajeUsuario,
			String mensajeTecnico) {
		    super(lugar, exceptionRaiz, mensajeUsuario, mensajeTecnico);
		   // TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	public static Exception crear(Exception excepcion, String mensajeUsuario, String mensajeTecnico) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
