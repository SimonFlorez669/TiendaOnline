package co.edu.uco.tiendaonline.crosscutting.exception.messages;

import java.util.HashMap;
import java.util.Map;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CategoriaMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CodigoMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.TipoMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilObjeto;

public class CatalogoMensajes {
	
	
	private static final Map<CodigoMensaje, Mensaje> MENSAJES = new HashMap<>();
	
	static {
		cargarMensajes();
	}
	
	private CatalogoMensajes() {
		super();
	}
	
	private static final void cargarMensajes() {
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000001, TipoMensaje.TECNICO, CategoriaMensaje.FATAL  ,"No se recibio el codigo el codigo del mensaje que se queria crear. No es posible continuar con el proceso. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000002, TipoMensaje.TECNICO, CategoriaMensaje.FATAL , "No existe un mensaje con el coddigo indicado. No es posible continuar con el proceso. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000003, TipoMensaje.TECNICO, CategoriaMensaje.FATAL , "No es posible obtener un mensaje con un codigo vacio o nulo. No es posible continuar con el proceso. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000004, TipoMensaje.USUARIO, CategoriaMensaje.FATAL , "se ha presentado un problema inesperada tratando de llevar a cabo la operacion deseada. Intente de nuevo y si el problema persiste contacte al administrador de la aplicacion. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000005, TipoMensaje.TECNICO, CategoriaMensaje.ERROR , "se ha presentado un problema inesperada tratando de validar si la conexion SQL esta abierta. Se presento una exepcion SQLExeption, por favor verifique la traza completa del error presentado, para asi poder diagnsosticar. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M000006, TipoMensaje.TECNICO, CategoriaMensaje.ERROR , "se ha presentado un problema inesperada tratando de validar si la conexion SQL esta abierta. Se presento una exepcion generica de tipo Exception . por favor verifique la traza completa del error presentado, para asi poder diagnsosticar. "));
agregarMensaje(Mensaje.crear(null, null, null, null));
	}
	
	private static final void agregarMensaje (final Mensaje mensaje) {
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}

	
	public static final Mensaje obtenerMensaje (final CodigoMensaje codigo) {
		if (UtilObjeto.esNulo(codigo)) {
			String mensajeUsuario= obtenerMensaje(CodigoMensaje.M000004).getContenido();
			String mensajeTecnico = obtenerMensaje(CodigoMensaje.M000003).getContenido();
			
			throw CrossCuttingTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		}
		if (!MENSAJES.containsKey(codigo)) {
			var mensajeUsuario= obtenerMensaje(CodigoMensaje.M000004).getContenido();
			var mensajeTecnico = obtenerMensaje(CodigoMensaje.M000003).getContenido();
			throw CrossCuttingTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		}
		
		return MENSAJES.get(codigo);
		
		
	}
	
	public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}
}


