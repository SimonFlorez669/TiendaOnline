package co.edu.uco.tiendaonline.crosscutting.exception.messages;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CategoriaMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CodigoMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.TipoMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilObjeto;

public class Mensaje {
	
	
	private CodigoMensaje codigo;
	private TipoMensaje tipo;
	private CategoriaMensaje categoria;
	private String contenido;
	
	
	
	private Mensaje(final CodigoMensaje codigo,final TipoMensaje tipo, final CategoriaMensaje categoria, final String contenido) {
		
		setCodigo(codigo);
		setTipo(tipo);
		setCategoria(categoria);
		setContenido(contenido);
		
	}
	
	public static final Mensaje crear(final CodigoMensaje codigo,final TipoMensaje tipo, final CategoriaMensaje categoria, final String contenido) {
		return new Mensaje(codigo, tipo, categoria, contenido);	
		}



	private final void setCodigo(final CodigoMensaje codigo) {
		
		if (UtilObjeto.esNulo(codigo)) {
			var mensajeUsuario=CatalogoMensajes.obtenerMensaje(CodigoMensaje.M000004).getContenido();
			var mensajeTecnico =CatalogoMensajes.obtenerMensaje(CodigoMensaje.M000003).getContenido();
			throw CrossCuttingTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		}
		this.codigo = UtilObjeto.obtenerValorDefecto(codigo, null);
	}



	private final void setTipo( final TipoMensaje tipo) {
		this.tipo = UtilObjeto.obtenerValorDefecto(tipo, TipoMensaje.USUARIO);
	}



	private final void setCategoria( final CategoriaMensaje categoria) {
		this.categoria = UtilObjeto.obtenerValorDefecto(categoria, CategoriaMensaje.FATAL);
	}



	private final void setContenido(final String contenido) {
		this.contenido = Utiltexto.aplicarTrim(contenido);
	}

	public final CodigoMensaje getCodigo() {
		return codigo;
	}

	public final TipoMensaje getTipo() {
		return tipo;
	}

	public final CategoriaMensaje getCategoria() {
		return categoria;
	}

	public final String getContenido() {
		return contenido;
	}



	
	
	
	
	
	
	
	
}

}
