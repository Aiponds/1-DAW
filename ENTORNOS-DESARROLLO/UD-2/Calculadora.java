import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calculadora {

	private JFrame frmCalculadora;
	private JTextField txtOperando1;
	private JTextField txtOperando2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 461, 272);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel etqOperando1 = new JLabel("Operando 1:");
		etqOperando1.setBounds(109, 52, 99, 15);
		frmCalculadora.getContentPane().add(etqOperando1);
		
		txtOperando1 = new JTextField();
		txtOperando1.setBounds(226, 46, 84, 27);
		frmCalculadora.getContentPane().add(txtOperando1);
		txtOperando1.setColumns(10);
		
		JLabel etqOperando2 = new JLabel("Operando 2:");
		etqOperando2.setBounds(109, 91, 99, 15);
		frmCalculadora.getContentPane().add(etqOperando2);
		
		txtOperando2 = new JTextField();
		txtOperando2.setBounds(226, 85, 84, 27);
		frmCalculadora.getContentPane().add(txtOperando2);
		txtOperando2.setColumns(10);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setBounds(119, 118, 44, 25);
		frmCalculadora.getContentPane().add(btnSumar);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setBounds(174, 118, 44, 25);
		frmCalculadora.getContentPane().add(btnRestar);
		
		JButton btnProducto = new JButton("*");
		btnProducto.setBounds(230, 118, 44, 25);
		frmCalculadora.getContentPane().add(btnProducto);
		
		JButton btnDivision = new JButton(":");
		btnDivision.setBounds(286, 118, 44, 25);
		frmCalculadora.getContentPane().add(btnDivision);
		
		JLabel etqResultado = new JLabel("0");
		etqResultado.setBounds(285, 155, 138, 38);
		frmCalculadora.getContentPane().add(etqResultado);
		
		// código a ejecutar al pulsar el botón de sumar
		btnSumar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			// Aquí tú código
			int sumando1 = Integer.parseInt(txtOperando1.getText());
			int sumando2 = Integer.parseInt(txtOperando2.getText());
			int resultado = sumando1 + sumando2;
			etqResultado.setText(String.valueOf(resultado));
			}
		});
		// fin del código
		
		// código a ejecutar al pulsar el botón de restar
		btnRestar.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		// Aquí tú código
			int minuendo = Integer.parseInt(txtOperando1.getText());
			int sustraendo = Integer.parseInt(txtOperando2.getText());
			int resultado = minuendo - sustraendo;
			etqResultado.setText(String.valueOf(resultado));
			}
		});
		// fin del código
		
		// código a ejecutar al pulsar el botón de multiplicar
		btnProducto.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
		// Aquí tú código
			int factor1 = Integer.parseInt(txtOperando1.getText());
			int factor2 = Integer.parseInt(txtOperando2.getText());
			int resultado = factor1 * factor2;
			etqResultado.setText(String.valueOf(resultado));
			}
		});
		// fin del código
		
		// código a ejecutar al pulsar el botón de dividir
		btnDivision.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			// Aquí tú código
			int dividendo = Integer.parseInt(txtOperando1.getText());
			int divisor = Integer.parseInt(txtOperando2.getText());
			int resultado;
			
			if(divisor==0) {
				etqResultado.setText("No válido");
			} 
			else {
				resultado = dividendo / divisor;
				etqResultado.setText(String.valueOf(resultado));
			}//fin else
			}
		});
		// fin del código
	}
}
