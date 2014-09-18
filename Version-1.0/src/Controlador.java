package verEasyJavaCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
	
	// El controlador recibe la Vista y el Modelo
	
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo){
		
		// Inicializamos la vista y el modelo
		this.vista = vista;
		this.modelo = modelo;
		
		// Inicializamos los campos de texto
		vista.valorResultado(modelo.getResultado());
		vista.operacionActual(modelo.getOperacionActual());
		vista.updateFaseLabel(modelo.getFase());
		
	}
	
	public void actionPerformed(ActionEvent ea){
		
		if(
				ea.getActionCommand().equals(Vista.UNO) ||
				ea.getActionCommand().equals(Vista.DOS) ||
				ea.getActionCommand().equals(Vista.TRES) ||
				ea.getActionCommand().equals(Vista.CUATRO) ||
				ea.getActionCommand().equals(Vista.CINCO) ||
				ea.getActionCommand().equals(Vista.SEIS) ||
				ea.getActionCommand().equals(Vista.SIETE) ||
				ea.getActionCommand().equals(Vista.OCHO) ||
				ea.getActionCommand().equals(Vista.NUEVE) ||
				ea.getActionCommand().equals(Vista.CERO)	
		){
			
			if(modelo.getFase() >= 0 && modelo.getFase() <= 2){
				
				modelo.construirOperacion(ea.getActionCommand());
				vista.operacionActual(modelo.getOperacionActual());
				
				if(modelo.getFase() == 1){
					
					modelo.incFase();
					
				}
				
				vista.updateFaseLabel(modelo.getFase());
				
			} else {
				
				modelo.resetear();
				modelo.construirOperacion(ea.getActionCommand());
				vista.valorResultado(modelo.getResultado());
				vista.operacionActual(modelo.getOperacionActual());
				vista.updateFaseLabel(modelo.getFase());
				
			}
			
		} else if(
				ea.getActionCommand().equals(Vista.SUMAR) ||
				ea.getActionCommand().equals(Vista.RESTAR) ||
				ea.getActionCommand().equals(Vista.MULTIPLICAR)
		){
			
			if(modelo.getFase() == 0 && modelo.getOperacionActual().length() > 0){
				
				// Usamos como delimitadores los espacios para el SCANNER
				modelo.construirOperacion(" " + ea.getActionCommand() + " "); 
				modelo.incFase();
				vista.operacionActual(modelo.getOperacionActual());
				vista.updateFaseLabel(modelo.getFase());
				
			}
			
		} else if(ea.getActionCommand().equals(Vista.RESULTADO) && modelo.getFase() == 2){
			
			modelo.resolverOperacion();
			modelo.incFase();
			vista.operacionActual(modelo.getOperacionActual());
			vista.valorResultado(modelo.getResultado());
			vista.updateFaseLabel(modelo.getFase());
			
		} else if(ea.getActionCommand().equals(Vista.RESETEAR)){
			
			modelo.resetear();
			vista.operacionActual(modelo.getOperacionActual());
			vista.valorResultado(modelo.getResultado());
			vista.updateFaseLabel(modelo.getFase());
			
		}
		
	}

}
