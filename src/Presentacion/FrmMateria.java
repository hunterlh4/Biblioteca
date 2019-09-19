package Presentacion;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Entidad.EMateria;
import Negocio.NMateria;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class FrmMateria extends JPanel {
	private JTextField txtnombre;
	private JTable table;

	/**
	 * Create the panel.
	 */
	int id;
	 String codigo;
	    int registro;
	
	 void ListarGrilla() {
         String Titulos[] = {"id", "nombre"};

        NMateria materias = new NMateria();
        List<EMateria> materia = materias.Listar();
        Iterator iterator = materia.iterator(); 
        DefaultTableModel dtm = new DefaultTableModel(null, Titulos);

        String campo[] = new String[2];
        while (iterator.hasNext()) {
            EMateria objUsuario = new EMateria();
            objUsuario = (EMateria) iterator.next();

            campo[0] = String.valueOf(objUsuario.getId()) ;
            campo[1] = objUsuario.getNombre();
         

         
            
            dtm.addRow(campo);
        }

        table.setModel(dtm);
    }
	  void seleccionarFilaGrilla(){
		     DefaultTableModel dtm = new DefaultTableModel();
		     
		     registro = table.getSelectedRow();
		         if (registro ==-1) {
		             JOptionPane.showMessageDialog(null, "se debe de seleccionar algun registro");
		         }
		         else {
		             dtm=(DefaultTableModel) table.getModel();
		             id = ((int) dtm.getValueAt(registro, 0));
		           
		             
		             txtnombre.setText((String) dtm.getValueAt(registro, 1));
		            
		         }
		     
		     
		     }
	 
	 
	 
	public FrmMateria() {
		
		JLabel lblRegistroDeMaterias = new JLabel("REGISTRO DE MATERIAS");
		lblRegistroDeMaterias.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 38));
		
		txtnombre = new JTextField();
		txtnombre.setColumns(10);
		
		JButton button = new JButton("ELIMINAR");
		button.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		
		JButton button_1 = new JButton("MODIFICAR");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				EMateria materia = new EMateria();
				NMateria controlmateria = new NMateria();
				
				materia.setId(id);
				controlmateria.Modificar(materia);
			}
		});
		button_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		
		JButton button_2 = new JButton("BUSCAR");
		button_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		
		JButton button_3 = new JButton("REGISTRAR");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EMateria materia = new EMateria();
				NMateria controlmateria = new NMateria();
				
				materia.setNombre(txtnombre.getText());
				controlmateria.Agregar(materia);
				
			}
		});
		button_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 28));
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 28));
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 seleccionarFilaGrilla();
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(287)
					.addComponent(lblRegistroDeMaterias, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(204)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(106)
							.addComponent(txtnombre, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(116)
					.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(220)
					.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(53)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(34)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 756, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblRegistroDeMaterias, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtnombre, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE))
		);
		setLayout(groupLayout);
		
		
	
	}

}
