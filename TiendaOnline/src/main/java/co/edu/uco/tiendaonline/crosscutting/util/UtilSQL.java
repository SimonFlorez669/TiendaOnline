package co.edu.uco.tiendaonline.crosscutting.util;

import java.sql.Connection;
import java.sql.SQLException;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.CatalogoMensajes;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CodigoMensaje;

public class UtilSQL {

	
	
	private UtilSQL() {
		super();
	}
	
	public static final boolean conexionAbierta(final Connection conexion) {
		if(!UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000007);
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
			}
		
		try {
			return !conexion.isClosed();
		} catch (final SQLException excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000005);
			throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
			catch (final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000006);
			throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
	}
	
	public static final void cerrarConexion (final Connection conexion)  {
		if(!UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000008);
			throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
			}
		try {
			if(!conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000009);
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
				}
			conexion.close();
		}
		catch(CrossCuttingTiendaOnlineException excepcion){
			throw excepcion;
		} 
		catch(final SQLException excepcion){
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000013);
			throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
		catch( final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000014);
			throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
		}
		
		public static final void iniciarTransaccion (final Connection conexion){
			if(!UtilObjeto.esNulo(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000010);
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
				}
			try {
				if(!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000011);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
					}
				if(!conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000012);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario,mensajeTecnico);
					}
				conexion.setAutoCommit(false);
			}
			catch(CrossCuttingTiendaOnlineException excepcion){
				throw excepcion;
			}
			catch(final SQLException excepcion){
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000015);
				throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
			}
			catch( final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000016);
				throw CrossCuttingTiendaOnlineException.crear(excepcion,mensajeUsuario,mensajeTecnico);
			}
		}
		public static final void confirmarTransaccion(final Connection conexion) {

			if (UtilObjeto.esNulo(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000017);
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
			}

			try {
				if (!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000018);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
				}

				if (conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000019);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
				}

				conexion.commit();
			} catch (final CrossCuttingTiendaOnlineException excepcion) {
				throw excepcion;
			} catch (final SQLException excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000020);
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			} catch (final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000021);
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			}
		}

		public static final void cancelarTransaccion(final Connection conexion) {

			if (UtilObjeto.esNulo(conexion)) { 
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000022);
				throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
			}

			try {
				if (!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000023);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
				}

				if (conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000024);
					throw CrossCuttingTiendaOnlineException.crear(mensajeUsuario, mensajeTecnico);
				}

				conexion.rollback();
			} catch (final CrossCuttingTiendaOnlineException excepcion) {
				throw excepcion;
			} catch (final SQLException excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000025);
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			} catch (final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000026);
				throw CrossCuttingTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
			}
		}
}
