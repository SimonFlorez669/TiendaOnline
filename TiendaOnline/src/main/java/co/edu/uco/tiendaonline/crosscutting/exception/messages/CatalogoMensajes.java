
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
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000001, TipoMensaje.TECNICO, CategoriaMensaje.FATAL,
				"No se recibió el código del mensaje que se quería crear. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000002, TipoMensaje.TECNICO, CategoriaMensaje.FATAL,
				"No existe un mensaje con el código indicado. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000003, TipoMensaje.TECNICO, CategoriaMensaje.FATAL,
				"No es posible obtener un mensaje con un código vacío o nulo. No es posible continuar con el proceso..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000004, TipoMensaje.USUARIO, CategoriaMensaje.FATAL,
				"Se ha presentado un problema inesperado tratando de llevar a cabo la operación deseada. Por favor intente de nuevo y si el problema persiste, contacte al administrador de la aplicación..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000005, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de validar si la conexión SQL estaba abierta. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000006, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de validar si la conexión SQL estaba abierta. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000007, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible validar si una conexión está abierta cuando es nula..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000008, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible cerrar una conexión que ya fue cerrada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000009, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de cerrar una conexión SQL. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000010, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de cerrar la conexión. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000011, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible iniciar una transacción con una conexión que está nula..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000012, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible iniciar una transacción con una conexión cerrada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000013, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible iniciar una transacción que ya ha sido iniciada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000014, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de iniciar la transacción de una conexión SQL. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000015, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de iniciar la transacción de una conexión. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000016, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible confirmar una transacción con una conexión que está nula..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000017, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible confirmar una transacción con una conexión cerrada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000018, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible confirmar una transacción que no fue iniciada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000019, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de confirmar la transacción de una conexión SQL. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000020, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de confirmar la transacción de una conexión. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000021, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible cancelar una transacción con una conexión que está nula..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000022, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible cancelar una transacción con una conexión cerrada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000023, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible cancelar una transacción que no fue iniciada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000024, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de cancelar la transacción de una conexión SQL. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000025, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado cancelar de confirmar la transacción de una conexión. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000026, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"No es posible cerrar una conexión que está nula..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000027, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de obtener la conexión con SQL Server. Se presentó una excepción de tipo SQLException. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000028, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema inesperado tratando de obtener la conexión con SQL Server. Se presentó una excepción genérica de tipo Exception. Por favor verifique la traza completa del error presentado, para así poder diagnosticar con mayor certeza qué sucedió..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000029, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"La Factorìa de datos para PostgreSQL no se encuentra implementada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000030, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"La Factorìa de datos para MySQL no se encuentra implementada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000031, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"La Factorìa de datos para Oracle no se encuentra implementada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000032, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"La Factorìa de datos deseada no se encuentra implementada..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000033, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de obtener el DAO de ClienteSQLServerDAO debido a que la conexiòn actualmente està cerrada, por lo que no hay una conexiòn vàlida disponible..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000034, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de obtener el DAO de TipoIdentificacionSQLServerDAO debido a que la conexiòn actualmente està cerrada, por lo que no hay una conexiòn vàlida disponible..."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000035, TipoMensaje.TECNICO, CategoriaMensaje.ERROR,
				"Se ha presentado un problema tratando de crear el DAO deseado, debido a que la conexiòn actualmente està cerrada, por lo que no hay una conexiòn vàlida disponible..."));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000036, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de registrar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000037, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema de tipo SQLExcepcion en el metodo crear de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo el registro del nuevo Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000038, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de registrar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000039, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo Excepcion en el metodo crear de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo el registro del nuevo Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000040, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de consultar la informacion del Tipo de Identificacion por el identificador deseado. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000041, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo SQLExcepcion en el metodo consultarPorID de la clase TipoIdentifiacionSQLServer tratando de recuperar los datos de la consulta del tipo de identificacion deseado. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000042, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo SQLExcepcion en el metodo consultarPorID de la clase TipoIdentifiacionSQLServer tratando de preparar la sentencia SQL  de la consulta del tipo de identificacion deseado. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio.se a presentado un problema inesperado de tipo SQLExcepcion en el metodo consultarPorID de la clase TipoIdentifiacionSQLServer tratando de preparar la sentencia SQL  de la consulta del tipo de identificacion deseado. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000043, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo SQLExcepcion en el metodo consultarPorID de la clase TipoIdentifiacionSQLServer tratando de preparar la sentencia SQL  de la consulta del tipo de identificacion deseado. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio."));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000044, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de modificar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000045, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema de tipo SQLExcepcion en el metodo modificar de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo la modificacion del registroen en el  Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000046, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de modificar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000047, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo Excepcion en el metodo modificar de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo la modificacion del registro en el Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio."));
		
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000048, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de eliminar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000049, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema de tipo SQLExcepcion en el metodo eliminar de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo la eliminacion del registro en en el  Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio. "));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000050, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"Se a presentado un problema tratando de eliminar la informacion del nuevo Tipo de Identificacion...."));
		agregarMensaje(Mensaje.crear(CodigoMensaje.M0000000051, TipoMensaje.TECNICO, CategoriaMensaje.FATAL, 
				"se a presentado un problema inesperado de tipo Excepcion en el metodo eliminar de la clase TipoIdentifiacionSQLServer tratando de llevar a cabo la eliminacion del registro en el Tipo de Identificacion. Por favor revise la traza completa del problema presentado para asi poder identificar que sucedio."));
		
		
	}
	
	private static final void agregarMensaje (final Mensaje mensaje) {
		MENSAJES.put(mensaje.getCodigo(), mensaje);
	}

	
	public static final Mensaje obtenerMensaje (final CodigoMensaje codigo) {
		if (UtilObjeto.esNulo(codigo)) {
			String mensajeUsuario= obtenerMensaje(CodigoMensaje.M0000000004).getContenido();
			String mensajeTecnico = obtenerMensaje(CodigoMensaje.M0000000003).getContenido();
			
			throw CrossCuttingTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		}
		if (!MENSAJES.containsKey(codigo)) {
			var mensajeUsuario= obtenerMensaje(CodigoMensaje.M0000000004).getContenido();
			var mensajeTecnico = obtenerMensaje(CodigoMensaje.M0000000003).getContenido();
			throw CrossCuttingTiendaOnlineException.crear(mensajeTecnico, mensajeUsuario);
		}
		
		return MENSAJES.get(codigo);
		
		
	}
	
	public static final String obtenerContenidoMensaje(final CodigoMensaje codigo) {
		return obtenerMensaje(codigo).getContenido();
	}
}