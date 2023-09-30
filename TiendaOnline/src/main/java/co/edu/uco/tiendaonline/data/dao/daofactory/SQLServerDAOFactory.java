package co.edu.uco.tiendaonline.data.dao.daofactory;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;

public final class SQLServerDAOFactory extends DAOFactory{

		@Override
		protected void abrirConexion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void cerrarConexion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void iniciarTransaccion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void confirmarTransaccion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void cancelarTransaccion() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ClienteDAO obtenerClienteDAO() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TipoIdentificacionDAO obtenerTipoIdentifiacionDAO() {
			// TODO Auto-generated method stub
			return null;
		}
}
