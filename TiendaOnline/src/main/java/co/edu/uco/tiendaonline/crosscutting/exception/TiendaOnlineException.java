package co.edu.uco.tiendaonline.crosscutting.exception;

import co.edu.uco.tiendaonline.crosscutting.exception.enumerator.LugarException;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilObjeto;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;

public class TiendaOnlineException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	private Throwable exceptionRaiz;
	private String mensajeUsuario;
	private String mensajeTecnico;
	private LugarException lugar;
	private boolean tieneExepcionRaiz;
	
	
	
	
	protected TiendaOnlineException( final LugarException lugar, final Throwable exceptionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
	
		setLugar(lugar);
		setExceptionRaiz(exceptionRaiz);
		setMensajeTecnico(mensajeTecnico);
		setMensajeUsuario(mensajeUsuario);
		
	}
	
	
	
	private final void setLugar(final LugarException lugar) {
		this.lugar = UtilObjeto.obtenerValorDefecto(lugar, LugarException.GENERAL);
	}
	
	
	
	private final void setExceptionRaiz(final Throwable exceptionRaiz) {
		setTieneExepcionRaiz(!UtilObjeto.esNulo(exceptionRaiz));
		this.exceptionRaiz = UtilObjeto.obtenerValorDefecto(exceptionRaiz, new Exception());
	}
	
	
	private final void setMensajeUsuario(final String mensajeUsuario) {
		
		this.mensajeUsuario = UtilTexto.aplicarTrim(mensajeUsuario);
	}
	
	
	private final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = UtilTexto.aplicarTrim(mensajeTecnico);
	}
	
	
	private final void setTieneExepcionRaiz(final boolean tieneExepcionRaiz) {
		this.tieneExepcionRaiz = tieneExepcionRaiz;
	}
	
	
	
	
	
	public static final long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public final LugarException getLugar() {
		return lugar;
	}
	
	
	public final Throwable getExceptionRaiz() {
		return exceptionRaiz;
	}
	
	
	
	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}
	
	
	public final String getMensajeTecnico() {
		return mensajeTecnico;
	}
	
	
	public final boolean isTieneExepcionRaiz() {
		return tieneExepcionRaiz;
	}
	
	
	

}
