package co.edu.uco.tiendaonline.data.dao.concrete.sqlserver;

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.CatalogoMensajes;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CodigoMensaje;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilObjeto;
import co.edu.uco.tiendaonline.crosscutting.exception.util.UtilTexto;
import co.edu.uco.tiendaonline.data.dao.TipoIdentificacionDAO;
import co.edu.uco.tiendaonline.data.entity.TipoIdentificacionEntity;

public final class TipoIdentificacionSQLServerDAO extends SQLDAO implements TipoIdentificacionDAO{

	protected TipoIdentificacionSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoIdentificacionEntity entity) {
		final var sentencia = new StringBuilder();
		
		sentencia.append("INSERT INTO TipoIdentificacion(id,codigo, nombre,estado) ");
		sentencia.append("VALUES (?, ?, ?, ?)");
		
		
		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())) {
			sentenciaPreparada.setObject(1, entity.getId());
			sentenciaPreparada.setString(2, entity.getCodigo());
			sentenciaPreparada.setString(3, entity.getNombre());
			sentenciaPreparada.setBoolean(4, entity.isEstado());
			
			
			sentenciaPreparada.executeUpdate();
			
			
		} catch (final SQLException excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de registrar la informacion del nuevo Tipo de identificacion";
			var mensajeTecnico ="Se ha presentado un problema de SQL execepcion en el metodo crear de la class TipoIdentificacion la traza completa del problema presentado para asi poder identificar que sucedio ";
			throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		} catch (final Exception excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de registrar la informacion del nuevo Tipo de identificacion";
			var mensajeTecnico ="Se ha presentado un problema inesperado de tipo execepcion en el metodo crear de la class TipoIdentificacion la traza completa del problema presentado para asi poder identificar que sucedio ";
			throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
			
		}
		
	}
	
	
	
	
	
	
	
	
	

	@Override
	public void modificar(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public Optional<TipoIdentificacionEntity> consultarPorId(UUID id) {
           final var sentencia = new StringBuilder();
		
		sentencia.append("SELECT id,codigo, nombre,estado) ");
		sentencia.append("FROM TipoIdentificacion");
		sentencia.append(" WHERE id = ?");
		
		
		Optional<TipoIdentificacionEntity> resultado = Optional.empty();
		
		try(final var sentenciaPreparada = getConexion().prepareStatement(sentencia.toString())){
			
			sentenciaPreparada.setObject(1, id);
			resultado = ejecutarConsultaPorId(sentenciaPreparada);
			
			try(final var resultados = sentenciaPreparada.executeQuery()){
				
				if(resultados.next()) {
					var TipoIdentifiacionEntity = TipoIdentificacionEntity.crear(UUID.fromString(resultados.getObject("id").toString()),resultados.getString("codigo"), resultados.getString("nombre"), resultados.getBoolean("estado"));
					
					resultado = Optional.of(TipoIdentifiacionEntity);
					
					
				}
			}catch (final SQLException excepcion) {
				var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
				var mensajeTecnico ="Se ha presentado un problema de tipo SQL execepcion en el metodo ";
				throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
				
				
			}catch (final DataTiendaOnlineException excepcion) {
				throw excepcion;
				
			}
			
		}catch (SQLException excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
			var mensajeTecnico ="Se ha presentado un problema de tipo SQL execepcion en el metodo consultar por ide en la clae TipoIdentifiacaionSQLServer tratandop de preparar la sentencia SQL de la consulta de tipp identificacion deseada ";
			throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
			
			

			
			
		}catch (final Exception excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
			var mensajeTecnico ="Se ha presentado un problema de tipo exception en el metodo consultar por ide en la clae TipoIdentifiacaionSQLServer tratandop de preparar la sentencia SQL de la consulta de tipp identificacion deseada ";
			throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
			
		}
		
		
		
		return resultado;
	}

	@Override
	public List<TipoIdentificacionEntity> consultar(TipoIdentificacionEntity entity) {
		
		final var parametros = new ArrayList<Object>();
		
		
		final String sentencia = formarSentenciaConsulta(entity, parametros);
		
		return null;
		
		
		
		
		
		
	
 
	}
	
	private final String formarSentenciaConsulta(final TipoIdentificacionEntity entity, final List<Object> parametros) {
		
		final StringBuilder sentencia = new StringBuilder();
		String  operadorCondicional = "WHERE";
		
		
		sentencia.append(" SELECT id, codigo, nombre , estado ");
		sentencia.append("FROM TipoIdentificacion ");
		
		if(!UtilObjeto.esNulo(entity)) {
			if(UtilObjeto.esNulo(entity.getId())) {
				sentencia.append(operadorCondicional).append(" id = ?");
				operadorCondicional = "AND";
				parametros.add(entity.getId());
				
				
			}
			
			if(!UtilTexto.estaVacio(entity.getCodigo())) {
				sentencia.append(operadorCondicional).append(" codigo = ?");
				operadorCondicional = "AND";
				parametros.add(entity.getCodigo());
				
			}
			if(!UtilTexto.estaVacio(entity.getCodigo())) {
				sentencia.append(operadorCondicional).append(" nombre = ?");
				operadorCondicional = "AND";
				parametros.add(entity.getNombre());
			
	
		}
			if(!UtilObjeto.esNulo(entity.isEstado())){
				sentencia.append(operadorCondicional).append(" estado = ?");
				parametros.add(entity.isEstado());
			}
	}
		sentencia.append(" ORDER BY codigo ASC ");
		return sentencia.toString();
		
	}
	
	private final List<TipoIdentificacionEntity> prepararEjecutarSentenciaConsulta(final TipoIdentificacionEntity entity) {
		
		
		final var parametros = new ArrayList<Object>();
		final String sentencia = formarSentenciaConsulta(entity, parametros);
		
		try (final var sentenciaPreparada = getConexion().prepareStatement(sentencia)){
			
			colocarParametrosConsulta(sentenciaPreparada, parametros);
			return ejecutarConsulta( sentenciaPreparada);
			
 
			
		}catch (final DataTiendaOnlineException excepcion){
		
			throw excepcion;
			
		}catch(final SQLException excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de llevar a cabo la consulta de los Tipos de indentificacion";
			var mensajeTecnico ="Se ha presentado un problema en el metodo consultar parametros consulta en la clase tipo identificacion sql server dao, tratando de preparar la sentencia sql. ";
			throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
			
			
		}catch(final Exception excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de llevar a cabo la consulta de los Tipos de indentificacion";
			var mensajeTecnico ="Se ha presentado un problema en el metodo consultar parametros consulta en la clase tipo excepcion sql server dao, tratando de colocar los parametros de la consulta sql. ";
			throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
		}
	
		
		
	
		
	
	}
	
	private final void colocarParametrosConsulta (final PreparedStatement sentenciaPreparada, final List<Object>parametros) {
		
		try {
			  for(int indice = 0; indice <parametros.size(); indice++) {
				  sentenciaPreparada.setObject(indice + 1, parametros.get(indice));
				  
				  
			  }
			  
			  
		}catch (SQLException excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de llevar a cabo la consulta de los Tipos de indentificacion";
			var mensajeTecnico ="Se ha presentado un problema en el metodo consultar parametros consulta en la clase tipo identificacion sql server dao, tratando de colocar los parametros de la consulta sql. ";
			throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
			
		}catch(final Exception excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de llevar a cabo la consulta de los Tipos de indentificacion";
			var mensajeTecnico ="Se ha presentado un problema inesperado de tipo excepcion en el metodo consultar parametros consulta en la clase tipo identificacion sql server dao, tratando de colocar los parametros de la consulta sql. ";
			throw DataTiendaOnlineException.crear(excepcion,mensajeTecnico, mensajeUsuario);
			
		}
		
		
	}
	
	
	private final List<TipoIdentificacionEntity> ejecutarConsulta( final PreparedStatement sentenciaPreparada){
		
		
		return null;
		
	
		
		
	}
	
	
	
		
			
	

	
	
	
	
	
	

	
	
	
	
	
	

}
