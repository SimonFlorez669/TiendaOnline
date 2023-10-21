package co.edu.uco.tiendaonline.service.domain.tipoidentificacion;

import java.util.UUID;

public class TipoIdentificacion {
	
	private UUID id;
	private String nombre;
	private String codigo;
	private boolean estado;
	
	
	
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
	
	
	public final TipoIdentificacion setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	public final TipoIdentificacion setNombre(final String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	
	public final TipoIdentificacion setCodigo(final String codigo) {
		this.codigo = codigo;
		return this;
	}
	
	
	public final TipoIdentificacion setEstado(final boolean estado) {
		this.estado = estado;
		return this;
	}
	
	
	
	
	

}
