package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;

public class FrmHistorialPrestamo extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FrmHistorialPrestamo() {
		
		JLabel lblHistorialDePrestamos = new JLabel("Historial de Prestamos");
		
		table = new JTable();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(293)
					.addComponent(lblHistorialDePrestamos)
					.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(97, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 538, GroupLayout.PREFERRED_SIZE)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(lblHistorialDePrestamos)
					.addGap(45)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 340, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
