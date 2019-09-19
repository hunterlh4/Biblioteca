package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class Biblioteca extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTable panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Biblioteca frame = new Biblioteca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Biblioteca() {
		setBounds(100, 100, 891, 363);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(64, 52, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero");
		lblNewLabel_1.setBounds(64, 89, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Facultad");
		lblNewLabel_2.setBounds(64, 132, 106, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fecha de Creacion");
		lblNewLabel_3.setBounds(64, 175, 106, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(158, 49, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 86, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 172, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(158, 129, 86, 17);
		getContentPane().add(comboBox);
		
		panel = new JTable();
		panel.setBounds(417, 35, 448, 242);
		getContentPane().add(panel);
		
		JButton btnguardar = new JButton("Guardar");
		btnguardar.setBounds(64, 280, 89, 23);
		getContentPane().add(btnguardar);
		
		JButton btnmodificar = new JButton("Modificar");
		btnmodificar.setBounds(178, 236, 89, 23);
		getContentPane().add(btnmodificar);
		
		JButton btnarriba = new JButton("Arriba");
		btnarriba.setBounds(338, 85, 68, 23);
		getContentPane().add(btnarriba);
		
		JButton btnabajo = new JButton("Abajo");
		btnabajo.setBounds(338, 128, 65, 23);
		getContentPane().add(btnabajo);
		
		JButton btnnuevo = new JButton("Nuevo");
		btnnuevo.setBounds(64, 236, 89, 23);
		getContentPane().add(btnnuevo);
		
		JButton btnborrar = new JButton("Borrar");
		btnborrar.setBounds(178, 280, 89, 23);
		getContentPane().add(btnborrar);
		
		JButton btnPrimero = new JButton("Primero");
		btnPrimero.setBounds(339, 48, 68, 23);
		getContentPane().add(btnPrimero);
		
		JButton btnultimo = new JButton("Ultimo");
		btnultimo.setBounds(339, 171, 68, 23);
		getContentPane().add(btnultimo);

	}
}
