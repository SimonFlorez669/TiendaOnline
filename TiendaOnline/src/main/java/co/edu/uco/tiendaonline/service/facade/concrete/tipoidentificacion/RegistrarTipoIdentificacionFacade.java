package co.edu.uco.tiendaonline.service.facade.concrete.tipoidentificacion;

import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;
import co.edu.uco.tiendaonline.data.dao.daofactory.DAOFactory;
import co.edu.uco.tiendaonline.data.dao.daofactory.TipoDAOFactory;
import co.edu.uco.tiendaonline.service.businesslogic.concrete.tipoidentificacion.RegistrarTipoIdentificacionUseCase;
import co.edu.uco.tiendaonline.service.businesslogic.validator.concrete.tipoidentificacion.RegistrarTipoIdentificacionValidator;
import co.edu.uco.tiendaonline.service.domain.TipoIdentificacionDomain;
import co.edu.uco.tiendaonline.service.dto.TipoIdentificacionDTO;
import co.edu.uco.tiendaonline.service.facade.Facade;

public final class RegistrarTipoIdentificacionFacade implements Facade<TipoIdentificacionDTO>{

	@Override
	public final void execute(final TipoIdentificacionDTO dto) {
		final TipoIdentificacionDomain domain = null; //Desde el dto con u
		RegistrarTipoIdentificacionValidator.ejecutar(domain);
		
		
		DAOFactory daoFactory = DAOFactory.obtenerDAOFactory(TipoDAOFactory.SQLSERVER);
		
		
		
		try {
			daoFactory.iniciarTransaccion();
			var UseCase = new RegistrarTipoIdentificacionUseCase(daoFactory);
			UseCase.execute(domain);
			
			
			
			
			
		
			daoFactory.confirmarTransaccion();
		}catch (final TiendaOnlineException excepcion) {
			daoFactory.cancelarTransaccion();
			throw excepcion;
		}catch (final Exception excepcion) {
			daoFactory.cancelarTransaccion();
			
			var mensajeUsuario = "";
			var mensajeTecnico = "";
			throw ServiceTiendaOnlineException.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}finally {
			
			daoFactory.cerrarConexion();
		}
		
}
	
	
	
	
	
	

}
