package co.edu.uco.tiendaonline.crosscutting.exception.concrete;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;

public class DataTiendaOnlineException extends TiendaOnlineException{

private static final long serialVersionUID = -2727036418055792587L;
	
	protected DataTiendaOnlineException(final Throwable excepcionRaiz, final String mensajeUsuario,
			final String mensajeTecnico) {
		super(LugarException.DATA, excepcionRaiz, mensajeUsuario, mensajeTecnico);

	}
	
	public static final TiendaOnlineException crear(final String mensajeUsuario) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeUsuario);
	}
	
	
	
	public static final TiendaOnlineException crear (final String mensajeUsuario, final String mensajeTecnico) {
		return new DataTiendaOnlineException(null, mensajeUsuario, mensajeTecnico);
	}
	
	
	
	
	public static final TiendaOnlineException crear (final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new DataTiendaOnlineException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}
	
	

}