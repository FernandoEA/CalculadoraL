package interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorBoton;
import modelo.Calculadora;
import modelo.Operaciones;

public class CalculadoraGUI extends JFrame {
	
	public JTextField txtOperador1;
	public JTextField txtOperador2;
	public JTextField txtResultado;
	
	public CalculadoraGUI(){
		setTitle("Mi primera Calculadora");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds( 100, 100, 400, 300 );
		
		JPanel pnlPrincipal= new JPanel();
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(new BorderLayout());
		
		JPanel pnlCentro = new JPanel();
		pnlPrincipal.add(pnlCentro,BorderLayout.CENTER);
		pnlCentro.setLayout(new GridLayout(3,2));
		
		JLabel lblOperador1 = new JLabel("Operador1: ");
		pnlCentro.add(lblOperador1);
		txtOperador1 = new JTextField();
		pnlCentro.add(txtOperador1);
		
		JLabel lblOperador2 = new JLabel("Operador2: ");
		pnlCentro.add(lblOperador2);
		txtOperador2 = new JTextField();
		pnlCentro.add(txtOperador2);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		pnlCentro.add(lblResultado);
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		pnlCentro.add(txtResultado);
		
		JPanel pnlSur = new JPanel();
		pnlPrincipal.add(pnlSur,BorderLayout.SOUTH);
		pnlSur.setLayout(new FlowLayout());
		
		JButton btnSuma = new JButton ("Suma");
		pnlSur.add(btnSuma);
		btnSuma.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e){
						Calculadora c = new Calculadora();
						c.setOperacion(Operaciones.SUMA);
						double ope1= Double.parseDouble(txtOperador1.getText());
						double ope2= Double.parseDouble(txtOperador1.getText());
						txtResultado.setText(String.valueOf(c.resultado(ope1, ope2)));
						}
				}
				);
		
		ControladorBoton controlador = new ControladorBoton(this);
				
		
		JButton btnResta = new JButton ("Resta");
		pnlSur.add(btnResta);
		btnResta.setActionCommand("RESTA");
		btnResta.addActionListener(controlador);
		
		JButton btnMultiplicar = new JButton ("Multiplicar");
		pnlSur.add(btnMultiplicar);
		btnMultiplicar.setActionCommand("MULTIPLICACION");
		btnMultiplicar.addActionListener(controlador);
		
		JButton btnDividir = new JButton ("Dividir");
		pnlSur.add(btnDividir);
		btnDividir.setActionCommand("DIVISION");
		btnDividir.addActionListener(controlador);
		
		setContentPane(pnlPrincipal);
	}

}
