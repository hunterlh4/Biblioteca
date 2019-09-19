package Presentacion.Estudiante;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ComponenteLibro extends JPanel {

	/**
	 * Create the panel.
	 */
	public ComponenteLibro(String Titulo , String Autores , String Resumen) {
		setBackground(Color.GREEN);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(PnlListaLibros.class.getResource("/Imagen/portada.jpg")));
		lblNewLabel.setBackground(Color.BLUE);
		
		JLabel LblTitulo = new JLabel(Titulo);
		
		JLabel LblAutores = new JLabel(Autores);
		
		JLabel LblResumen = new JLabel(Resumen);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addGap(121)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(LblTitulo)
						.addComponent(LblResumen, GroupLayout.PREFERRED_SIZE, 390, GroupLayout.PREFERRED_SIZE)
						.addComponent(LblAutores, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(33)
							.addComponent(LblTitulo)
							.addGap(18)
							.addComponent(LblAutores)
							.addGap(37)
							.addComponent(LblResumen, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}

}
