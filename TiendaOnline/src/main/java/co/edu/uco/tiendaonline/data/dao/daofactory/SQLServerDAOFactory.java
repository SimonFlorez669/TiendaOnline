package co.edu.uco.tiendaonline.data.dao.daofactory;

import java.sql.Connection;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;

public final class SQLServerDAOFactory extends DAOFactory{
	
	
	private Connection conexion;
	
	public SQLServerDAOFactory() {
		abrirConexion();
	}

		@Override
		protected final void abrirConexion() {
			// TODO; your homework will be to obtain connection with SQL Server database 
			conexion = null;
			
		}

		@Override
		public final void cerrarConexion() {
			// TODO: your homework will be to close connection;
			
			
		}

		@Override
		public final void iniciarTransaccion() {
			// TODO your homework to init transaction;
			
		}

		@Override
		public final void confirmarTransaccion() {
			// TODO your homework will be to commit transaction;
			
		}

		@Override
		public final  void cancelarTransaccion() {
			// TODO your homework will be to rollback transaction;
			
		}

		@Override
		public ClienteDAO obtenerClienteDAO() {
			return new ClienteSQLServerDAO(conexion);
			
		}

		@Override
		public TipoIdentificacionDAO obtenerTipoIdentifiacionDAO() {
			return new TipoIdentificacionSQLServerDAO(conexion);
		}
}
