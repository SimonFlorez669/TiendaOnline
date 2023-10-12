package co.edu.uco.tiendaonline.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.tiendaonline.crosscutting.exception.concrete.CrossCuttingTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.DataTiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.CatalogoMensajes;
import co.edu.uco.tiendaonline.crosscutting.exception.messages.enumerator.CodigoMensaje;
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
			
			try(final var resultados = sentenciaPreparada.executeQuery()){
				
				if(resultados.next()) {
					var TipoIdentifiacionEntity = TipoIdentificacionEntity.crear(UUID.fromString(resultados.getObject("id").toString()),resultados.getString("codigo"), resultados.getString("nombre"), resultados.getBoolean("estado"));
					
					resultado = Optional.of(TipoIdentifiacionEntity);
					
					
				}
			}catch (final SQLException excepcion) {
				var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
				var mensajeTecnico ="Se ha presentado un problema de tipo SQL execepcion en el metodo ";
				throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
				
				
			}catch (final DataTiendaOnlineException excepcion) {
				throw excepcion;
			}
			
		} catch (SQLException excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
			var mensajeTecnico ="Se ha presentado un problema de tipo SQL execepcion en el metodo consultar por ide en la clae TipoIdentifiacaionSQLServer tratandop de preparar la sentencia SQL de la consulta de tipp identificacion deseada ";
			throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
			
			

			
			
		}catch (final Exception excepcion) {
			var mensajeUsuario= " Se a presentado un problema tratando de consultar la informacion de tipo de identificacion por el identificador deseadp";
			var mensajeTecnico ="Se ha presentado un problema de tipo exception en el metodo consultar por ide en la clae TipoIdentifiacaionSQLServer tratandop de preparar la sentencia SQL de la consulta de tipp identificacion deseada ";
			throw DataTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
			
		}
		
		
		
		return resultado;
	}

	@Override
	public List<TipoIdentificacionEntity> consultar(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	

	
	
	
	
	
	

}
