package co.edu.uco.tiendaonline.data.dao.concrete.sqlserver;

import java.net.ConnectException;
import java.sql.Connection;

public  class SQLDAO {
	
	private Connection conexion;
	
	protected SQLDAO( final Connection conexion) {
		setConexion(getConexion());
		
		
	}

	protected final Connection getConexion() {
		return conexion;
	}

	private final void setConexion(Connection conexion) {
		//TODO: Controlar que la conexion no sea nula o que no este cerrada o que ya no se haya confirmado una transaccion

		this.conexion = conexion;
	}
	

	
	
	
	
}
