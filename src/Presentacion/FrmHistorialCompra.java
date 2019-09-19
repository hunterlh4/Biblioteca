package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;

public class FrmHistorialCompra extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public FrmHistorialCompra() {
		
		JLabel lblHistorialCompra = new JLabel("Historial Compra");
		
		table = new JTable();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(60, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(263)
					.addComponent(lblHistorialCompra)
					.addContainerGap(291, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(lblHistorialCompra)
					.addGap(30)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(47, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
