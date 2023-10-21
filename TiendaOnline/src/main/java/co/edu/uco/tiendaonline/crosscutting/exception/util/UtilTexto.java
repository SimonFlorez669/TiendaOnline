package co.edu.uco.tiendaonline.crosscutting.exception.util;

public final class UtilTexto {
	
	public static final String VACIO= "";
	private static final String PATTERN_SOLO_LETRAS = "[A-Za-záéíóú ]+$";
	private static final String PATTERN_SOLO_LETRAS_DIGITOS_ESPACIOS ="[0-9A-Za-záéíóú ]+$";

	
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
	
	public static final boolean estaNulo(final String valor) {
	
		return UtilObjeto.esNulo(valor);
		
		}
	
	public static final boolean estaVacio(final String valor) {
		return igualConTrim(valor, VACIO);
		
	}
	
	
	public static final boolean longitudMinimaValida(final String valor,  final int longitud) {
		
		return aplicarTrim(valor).length() >= longitud;
		
	}
	
	
	
	public static final boolean longitudMaximaValida(final String valor, final int longitud) {
		
		return aplicarTrim(valor).length() <= longitud;
		
	}
	
	
	
	
	
	public static final boolean longitudValida(final String valor, final int longitudMinima, final int longitudMaxima) {
		
		return longitudMinimaValida(valor, longitudMaxima) && longitudMaximaValida(valor, longitudMaxima);
	}
	
	public static final boolean contieneSoloLetras(final String valor) {
		
		return obtenerValorDefecto(valor).matches(PATTERN_SOLO_LETRAS);
	}

	
	
}



