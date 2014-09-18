package verEasyJavaCalculator;

import java.awt.event.ActionListener;

public interface Vista {
	
	// Los "FLAGS" de los botones
	
	public static final String UNO = "1";
	public static final String DOS = "2";
	public static final String TRES = "3";
	public static final String CUATRO = "4";
	public static final String CINCO = "5";
	public static final String SEIS = "6";
	public static final String SIETE = "7";
	public static final String OCHO = "8";
	public static final String NUEVE = "9";
	public static final String CERO = "0";
	public static final String SUMAR = "+";
	public static final String RESTAR = "-";
	public static final String MULTIPLICAR = "*";
	public static final String RESULTADO = "RESULTADO";
	public static final String RESETEAR = "RESETEAR";
		
	// Referencia al controlador
		
	public void controlador(ActionListener ctr);
	
	// Metodos para actualizar la vista
	
	public void valorResultado(int valor);
	
	public void operacionActual(String texto);
	
	public void updateFaseLabel(int valor);
	

}
