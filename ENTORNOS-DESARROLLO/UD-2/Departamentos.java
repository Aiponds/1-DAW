import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;

public class Departamentos {

	private JFrame frmPruebaDeVentanas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departamentos window = new Departamentos();
					window.frmPruebaDeVentanas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Departamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaDeVentanas = new JFrame();
		frmPruebaDeVentanas.setTitle("PRUEBA DE VENTANAS");
		frmPruebaDeVentanas.setBounds(100, 100, 693, 436);
		frmPruebaDeVentanas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaDeVentanas.getContentPane().setLayout(null);
		
		JLabel lblCdigoDepartamento = new JLabel("Código Departamento");
		lblCdigoDepartamento.setBounds(129, 109, 156, 15);
		frmPruebaDeVentanas.getContentPane().add(lblCdigoDepartamento);
		
		JLabel lblNombreDepartamento = new JLabel("Nombre Departamento");
		lblNombreDepartamento.setBounds(128, 152, 184, 15);
		frmPruebaDeVentanas.getContentPane().add(lblNombreDepartamento);
		
		JLabel lblLocalidadDepartamento = new JLabel("Localidad Departamento");
		lblLocalidadDepartamento.setBounds(128, 199, 191, 15);
		frmPruebaDeVentanas.getContentPane().add(lblLocalidadDepartamento);
		
		textField = new JTextField();
		textField.setBounds(393, 150, 161, 19);
		frmPruebaDeVentanas.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(393, 106, 79, 19);
		frmPruebaDeVentanas.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(393, 195, 161, 19);
		frmPruebaDeVentanas.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDatosDeDepartamentos = new JLabel("DATOS DE DEPARTAMENTOS");
		lblDatosDeDepartamentos.setBounds(243, 22, 207, 15);
		frmPruebaDeVentanas.getContentPane().add(lblDatosDeDepartamentos);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBackground(new Color(249, 255, 0));
		panel.setBounds(111, 64, 453, 197);
		frmPruebaDeVentanas.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(0, 273, 694, 55);
		frmPruebaDeVentanas.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnInsertarDatos = new JButton("Insertar Datos");
		btnInsertarDatos.setBounds(137, 12, 137, 25);
		panel_1.add(btnInsertarDatos);
		
		JButton btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.setBounds(365, 12, 139, 25);
		panel_1.add(btnLimpiarDatos);
	}
}
