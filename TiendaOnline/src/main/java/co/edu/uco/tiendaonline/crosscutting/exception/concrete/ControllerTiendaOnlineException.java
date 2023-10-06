package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class ControllerTiendaOnlineException extends TiendaOnlineException {

	
	protected ControllerTiendaOnlineException(LugarException lugar, Throwable exceptionRaiz, String mensajeUsuario,
			String mensajeTecnico) {
		super(lugar, exceptionRaiz, mensajeUsuario, mensajeTecnico);
		
	}

	private static final long serialVersionUID = 1L;
	
	

}
