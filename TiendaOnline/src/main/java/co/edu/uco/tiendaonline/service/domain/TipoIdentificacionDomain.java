package co.edu.uco.tiendaonline.service.domain;

import java.util.UUID;

public class TipoIdentificacionDomain {


	
		
		
		
		private UUID id;
		private String nombre;
		private String codigo;
		private boolean estado;
		
		
		
		
		
		public TipoIdentificacionDomain(final UUID id,final String nombre,final  String codigo,final boolean estado) {
	           setId(id);
	           setCodigo(codigo);
	           setEstado(estado);
	           setNombre(nombre);

		}
		
		public static final TipoIdentificacionDomain crear(final UUID id,final String nombre,final  String codigo,final boolean estado) {
			return new TipoIdentificacionDomain(id, nombre, codigo, estado);
		}
		
		
		
		
		
		
		public final UUID getId() {
			return id;
		}
		public final String getNombre() {
			return nombre;
		}
		public final String getCodigo() {
			return codigo;
		}
		public final boolean isEstado() {
			return estado;
		}
		
		
		public final TipoIdentificacionDomain setId(UUID id) {
			this.id = id;
			return this;
			
		}
		
		
		
		public final TipoIdentificacionDomain setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}
		
		
		public final TipoIdentificacionDomain setCodigo(String codigo) {
			this.codigo = codigo;
			return this;
		}
		
		
		public final TipoIdentificacionDomain setEstado(boolean estado) {
			this.estado = estado;
			return this;
		}
		
		
		
		
		
		
		
		
		

	}


