package verEasyJavaCalculator;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Panel extends JPanel implements Vista {
	
	JButton botonUno, botonDos, botonTres, botonCuatro, botonCinco,
			botonSeis, botonSiete, botonOcho, botonNueve, botonCero,
			botonSumar, botonRestar, botonMultiplicar, botonResultado,
			botonResetear;
	
	JTextField campoResultado, campoOperacion;
	
	JLabel etiquetaFase;
	
	// Ahora, una vez declarados todos los elementos a agregar en el panel,
	// construimos la GUI en el constructor del Panel.
	
	public Panel(){
		
		// Especificamos el tipo de Gestor de Esquema
		JPanel guiMaestro	= new JPanel(new BorderLayout(3,3));
		JPanel guiContenido     = new JPanel(new GridLayout(0,4,3,3));
		
		// Definimos los nombres de los botones
		botonUno 	= new JButton("1");
		botonDos 	= new JButton("2");
		botonTres	= new JButton("3");
		botonCuatro     = new JButton("4");
		botonCinco	= new JButton("5");
		botonSeis	= new JButton("6");
		botonSiete	= new JButton("7");
		botonOcho	= new JButton("8");
		botonNueve	= new JButton("9");
		botonCero	= new JButton("0");
		
		botonSumar	= new JButton("+");
		botonRestar	= new JButton("-");
		botonMultiplicar = new JButton("*");
		botonResultado = new JButton("=");
		botonResetear = new JButton("C");
		
		campoResultado = new JTextField(10);
		campoOperacion = new JTextField(10);
		campoResultado.setEditable(false);
		campoOperacion.setEditable(false);
		
		etiquetaFase = new JLabel();
		
		// Metemos los botones en el panel
		add(guiMaestro);
		guiMaestro.add(campoResultado, BorderLayout.WEST);
		guiMaestro.add(campoOperacion, BorderLayout.CENTER);
		guiMaestro.add(guiContenido, BorderLayout.SOUTH);
		guiContenido.add(botonSiete);
		guiContenido.add(botonOcho);
		guiContenido.add(botonNueve);
		guiContenido.add(botonSumar);
		guiContenido.add(botonCuatro);
		guiContenido.add(botonCinco);
		guiContenido.add(botonSeis);
		guiContenido.add(botonRestar);
		guiContenido.add(botonUno);
		guiContenido.add(botonDos);
		guiContenido.add(botonTres);
		guiContenido.add(botonMultiplicar);
		guiContenido.add(botonCero);
		guiContenido.add(botonResultado);
		guiContenido.add(botonResetear);
		guiContenido.add(etiquetaFase);
		
	}
	
	public void controlador(ActionListener ctr){
		
		// 1 - Añadir controlador a cada componente
		
		botonUno.addActionListener(ctr);
		botonDos.addActionListener(ctr);
		botonTres.addActionListener(ctr);
		botonCuatro.addActionListener(ctr);
		botonCinco.addActionListener(ctr);
		botonSeis.addActionListener(ctr);
		botonSiete.addActionListener(ctr);
		botonOcho.addActionListener(ctr);
		botonNueve.addActionListener(ctr);
		botonCero.addActionListener(ctr);
		botonSumar.addActionListener(ctr);
		botonRestar.addActionListener(ctr);
		botonMultiplicar.addActionListener(ctr);
		botonResultado.addActionListener(ctr);
		botonResetear.addActionListener(ctr);
		
		// 2 - Asignar un comando para cada componente a controlar
		
		botonUno.setActionCommand(Vista.UNO);
		botonDos.setActionCommand(Vista.DOS);
		botonTres.setActionCommand(Vista.TRES);
		botonCuatro.setActionCommand(Vista.CUATRO);
		botonCinco.setActionCommand(Vista.CINCO);
		botonSeis.setActionCommand(Vista.SEIS);
		botonSiete.setActionCommand(Vista.SIETE);
		botonOcho.setActionCommand(Vista.OCHO);
		botonNueve.setActionCommand(Vista.NUEVE);
		botonCero.setActionCommand(Vista.CERO);
		botonSumar.setActionCommand(Vista.SUMAR);
		botonRestar.setActionCommand(Vista.RESTAR);
		botonMultiplicar.setActionCommand(Vista.MULTIPLICAR);
		botonResultado.setActionCommand(Vista.RESULTADO);
		botonResetear.setActionCommand(Vista.RESETEAR);
		
	}
	
	public void valorResultado(int valor){
		
		campoResultado.setText(Integer.toString(valor));
		
	}
	
	public void operacionActual(String texto){
		
		campoOperacion.setText(texto);
		
	}
	
	public void updateFaseLabel(int valor){
		
		etiquetaFase.setText(Integer.toString(valor));
		
	}
			

}
