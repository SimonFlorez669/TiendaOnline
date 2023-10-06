package co.edu.uco.tiendaonline.crosscutting.exception.util;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.CatalogoMensajes;

public class UtilSQL {

	
	
	private UtilSQL() {
		super();
	}
	
	
	
		
		public static final boolean conexionAbierta(final Connection conexion ) {
			try {
				return UtilObjeto.esNulo(conexion)&& !conexion.isClosed();
				
			} catch (final SQLException exception) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenidoMensaje();
				var mensajeTecnico = "M";
				throw CrossCuttingTiendaOnlineException.crear(exception, null,null);
			}
		
	}
		
		public static final void cerrarConexion( final Connection conexion) {
			
			if(UtilObjeto.esNulo(conexion)) {
				// 
			}
			if (!conexionAbierta(conexion)) {
				
				// lanzar excepcion 
			}
			
		}
}
