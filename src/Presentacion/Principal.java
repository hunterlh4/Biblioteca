package Presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;

import Presentacion.Estudiante.ComponenteLibro;
import Presentacion.Estudiante.PnlListaLibros;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(50, 50, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane PanelContenedor = new JDesktopPane();
		PanelContenedor.setBackground(Color.WHITE);
		GroupLayout gl_PanelContenedor = new GroupLayout(PanelContenedor);
		gl_PanelContenedor.setHorizontalGroup(
			gl_PanelContenedor.createParallelGroup(Alignment.LEADING)
				.addGap(0, 595, Short.MAX_VALUE)
		);
		gl_PanelContenedor.setVerticalGroup(
			gl_PanelContenedor.createParallelGroup(Alignment.LEADING)
				.addGap(0, 470, Short.MAX_VALUE)
		);
		PanelContenedor.setLayout(gl_PanelContenedor);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JButton btnprestamo = new JButton("Prestamo");
		btnprestamo.setIcon(new ImageIcon("C:\\Users\\dvans\\Desktop\\biblioteca\\1.png"));
		btnprestamo.setBackground(new Color(0, 255, 255));
		btnprestamo.setBounds(10, 123, 187, 44);
		
		panel.add(btnprestamo);
		
		JButton BtnListadoLibros = new JButton("Prestamo");
		BtnListadoLibros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PnlListaLibros Frm = new PnlListaLibros();
				
				//componente libro
				ComponenteLibro Componente = new ComponenteLibro("Titulo mega archi largoutiadfbgfok sdmflds ","Diego layme valeriano","lorem  ipsum ipsum ipsum ipsum ipsum ipsumipsum .");
				ComponenteLibro Panel2 = new ComponenteLibro("Titulo mega archi largoutiadfbgfok sdmflds ","Diego layme valeriano","lorem  ipsum ipsum ipsum ipsum ipsum ipsumipsum .");
				Componente.setSize(1200, 300);
				Panel2.setSize(1200, 300);
				
				Frm.ContenedorListado.setSize(1200, 850);
				Frm.setSize(1200, 850);
				Frm.revalidate();
				Frm.repaint();
				Frm.ContenedorListado.add(Componente);
				Frm.ContenedorListado.add(Panel2);
				Frm.setSize(1300, 750);
				PanelContenedor.add(Frm);
				
			}
		});
		BtnListadoLibros.setBounds(10, 181, 187, 44);
		panel.add(BtnListadoLibros);
		
		JButton button_1 = new JButton("Prestamo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ComponenteLibro Panel = new ComponenteLibro("Titulo mega archi largoutiadfbgfok sdmflds ","Diego layme valeriano","lorem  ipsum ipsum ipsum ipsum ipsum ipsumipsum .");
				Panel.setSize(800, 200);
				PanelContenedor.add(Panel);
				Panel.revalidate();
				Panel.repaint();
				Panel.setVisible(true);
				Panel.show();
			}
		});
		button_1.setBounds(10, 240, 187, 44);
		panel.add(button_1);
		
		Label label = new Label("New label");
		label.setBounds(32, 43, 92, 32);
		panel.add(label);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(PanelContenedor, GroupLayout.PREFERRED_SIZE, 944, GroupLayout.PREFERRED_SIZE)
					.addGap(103))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 521, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(PanelContenedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(160))
		);
		frame.getContentPane().setLayout(groupLayout);
		btnprestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Compra frm = new Compra();
			PanelContenedor.add(frm);
			frm.show();
				
			}
		});
	}
}
