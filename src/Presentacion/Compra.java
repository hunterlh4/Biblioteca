package Presentacion;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class Compra extends JInternalFrame {
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compra frame = new Compra();
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
	public Compra() {
		setBounds(100, 100, 997, 674);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Id");
		label.setBounds(32, 43, 46, 14);
		getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(126, 40, 86, 20);
		getContentPane().add(textField);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(32, 80, 46, 14);
		getContentPane().add(lblUsuario);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(32, 123, 106, 14);
		getContentPane().add(lblFecha);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(126, 79, 86, 17);
		getContentPane().add(comboBox);
		
		JLabel lblLibro = new JLabel("Libro");
		lblLibro.setBounds(32, 262, 46, 14);
		getContentPane().add(lblLibro);
		
		JButton button = new JButton("Nuevo");
		button.setBounds(32, 416, 89, 23);
		getContentPane().add(button);
		
		JButton btnAnular = new JButton("Anular");
		btnAnular.setBounds(257, 416, 89, 23);
		getContentPane().add(btnAnular);
		
		JButton button_2 = new JButton("Guardar");
		button_2.setBounds(146, 416, 89, 23);
		getContentPane().add(button_2);
		
		JButton button_3 = new JButton("Borrar");
		button_3.setBounds(377, 416, 89, 23);
		getContentPane().add(button_3);
		
		table = new JTable();
		table.setBounds(31, 458, 764, 175);
		getContentPane().add(table);
		
		JLabel lblNewLabel = new JLabel("FECHA HOY");
		lblNewLabel.setBounds(128, 123, 84, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblO = new JLabel("");
		lblO.setBounds(32, 221, 46, 14);
		getContentPane().add(lblO);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(126, 262, 86, 17);
		getContentPane().add(comboBox_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 314, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(126, 345, 86, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(394, 314, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(32, 317, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(32, 348, 59, 14);
		getContentPane().add(lblCantidad);

	}
}
