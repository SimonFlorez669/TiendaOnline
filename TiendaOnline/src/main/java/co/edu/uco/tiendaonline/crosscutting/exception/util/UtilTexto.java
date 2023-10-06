package co.edu.uco.tiendaonline.crosscutting.exception.util;

public final class UtilTexto {
	
	public static final String VACIO= "";

	
	private UtilTexto() {
		super();
	}
	
	
	public static final String obtenerValorDefecto(final String valor, final String valorDefecto) {
		
		return UtilObjeto.obtenerValorDefecto(valor, valorDefecto);
		
	}
	

	
	public static final String obtenerValorDefecto( final String valor) {
		return obtenerValorDefecto(valor,VACIO);
	}
	
	
	
	public static final String aplicarTrim(final String valor) {
	
		return obtenerValorDefecto(valor).trim();
	
		}
	
	
	
	
	public static final boolean igualConTrimIgnoreCase(final String ValorUno, final String valorDos) {
	
	return aplicarTrim(ValorUno).equalsIgnoreCase (aplicarTrim(valorDos));
	
	}
	
	
	public static final boolean igualSinTrimIgnoreCase(final String ValorUno, final String valorDos) {
		
	return obtenerValorDefecto(ValorUno).equalsIgnoreCase(obtenerValorDefecto(valorDos));
	
	}

	
	
	
	public static final boolean igualConTrim(final String ValorUno, final String valorDos) {
		
	return aplicarTrim(ValorUno).equals (aplicarTrim(valorDos));
	
	}

	
	
}
