package co.edu.uco.tiendaonline.data.dao.daofactory;

import javax.management.RuntimeErrorException;

import co.edu.uco.tiendaonline.data.dao.ClienteDAO;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;

public abstract class DAOFactory {
	
	
public static final DAOFactory obtenerDAOFactory( final TipoDAOFactory factoria) {
	switch (factoria) {
	case SQLSERVER: {
		return new SQLServerDAOFactory();
	}
	
	case POSTGRESQL: {
		throw new RuntimeException(" factoria no soportada");
	}
	
	case MYSQL:{
	       throw new RuntimeException(" factoria no soportada");
	          
	}
	
	case ORACLE:{
		throw new RuntimeException(" factoria no soportada");
	}
	


}
	    	
	       
	


protected abstract void abrirConexion();

public abstract void cerrarConexion();

public abstract void iniciarTransaccion();

public abstract void confirmarTransaccion();


public abstract void cancelarTransaccion();



public abstract ClienteDAO obtenerClienteDAO();

public abstract TipoIdentificacionDAO obtenerTipoIdentifiacionDAO();



}

