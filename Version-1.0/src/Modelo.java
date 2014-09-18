package verEasyJavaCalculator;

import java.util.Scanner;

public class Modelo {
	
	private int resultado;
	private StringBuilder datosRecibidos;
	private int fase;
	
	public Modelo(){
		
		resetear();
		
	}
	
	public void resetear(){
		
		resultado = 0;
		datosRecibidos = new StringBuilder(0);
		fase = 0;
		
	}
	
	public void sumar(int valor1, int valor2){
		
		resultado = valor1 + valor2;
		
	}
	
	public void restar(int valor1, int valor2){
		
		resultado = valor1 - valor2;
		
	}
	
	public void multiplicar(int valor1, int valor2){
		
		resultado = valor1 * valor2;
		
	}
	
	public void incFase(){
		
		fase++;
		
	}
	
	public int getFase(){
		
		return fase;
		
	}
	
	public void resolverOperacion(){
		
		Scanner sc = new Scanner(getOperacionActual());
		
		int valor1 = sc.nextInt();
		String operacion = sc.next();
		int valor2 = sc.nextInt();
		
		if(operacion.equals("+")){
			
			sumar(valor1,valor2);
			
		} else if (operacion.equals("-")){
			
			restar(valor1,valor2);
			
		} else if (operacion.equals("*")){
			
			multiplicar(valor1,valor2);
			
		}
		
	}
	
	public void construirOperacion(String dato){
		
		datosRecibidos.append(dato);
		
	}
	
	public String getOperacionActual(){
		
		return datosRecibidos.toString();
		
	}
	
	public int getResultado(){
		
		return resultado;
		
	}

}
