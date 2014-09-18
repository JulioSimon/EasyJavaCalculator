package verCalculadoraSimple;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Aplicacion {
	
	public static void main (String[] args){
		
		// Creamos la Vista
		Vista panel = new Panel();
		
		// Creamos el Modelo
		Modelo modelo = new Modelo();
		
		// Creamos el Controlador y le pasamos la Vista y el Modelo
		Controlador ctrl = new Controlador(panel,modelo);
		
		// Le decimos a la Vista que Controlador va a controlar los eventos.
		panel.controlador(ctrl);
		
		//Creamos el Frame principal de la aplicacion
		JFrame ventana = new JFrame("EasyJavaCalculator V1.0 - JJSG");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setContentPane((JPanel)panel);
		ventana.pack();
		ventana.setVisible(true);
		
	}

}
