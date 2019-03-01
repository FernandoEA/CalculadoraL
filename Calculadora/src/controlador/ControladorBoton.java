package controlador;

import interfaz.CalculadoraGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Calculadora;
import modelo.Operaciones;

public class ControladorBoton implements ActionListener {

	private CalculadoraGUI vista;
	
	public ControladorBoton(CalculadoraGUI vista){
		this.vista=vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String comando=e.getActionCommand();
		
		Calculadora c = new Calculadora();
		c.setOperacion(Operaciones.valueOf(comando));
		double ope1= Double.parseDouble(vista.txtOperador1.getText());
		double ope2= Double.parseDouble(vista.txtOperador1.getText());
		vista.txtResultado.setText(String.valueOf(c.resultado(ope1, ope2)));
	}

}
