package Utilidad;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Presentacion.FrmCatalogo;

public class UI {
	public static Color ColorPrimario = new Color(16, 38, 110);
	public static Color ColorPrimarioDark = new Color(193, 121, 0);

	public static Color ColorSecundario = new Color(255, 179, 0);
	public static Color ColorBlanco = new Color(255, 255, 255);
	public static Color ColorNegro = new Color(0, 0, 0);
	
	public static void InyectarEstilosTextBox(JTextField Txt) {
		Txt.setBackground(UI.ColorPrimario);
		Txt.setBounds(383, 128, 210, 35);
		Txt.setForeground(UI.ColorBlanco);
		Txt.setFont(new Font("Roboto",Font.PLAIN,12));
		Txt.setBorder(new LineBorder(UI.ColorSecundario,1));
	}
        
        public static void InyectarEstilosTextBoxAlex(JTextField Txt) {
		Txt.setBackground(UI.ColorPrimario);
		Txt.setBounds(383, 128, 210, 35);
		Txt.setForeground(UI.ColorBlanco);
		Txt.setFont(new Font("Roboto",Font.PLAIN,12));
		Txt.setBorder(new LineBorder(UI.ColorSecundario,1));
	}
	
	public static void InyectarEstilosTextBoxAzul(JTextField Txt) {
		Txt.setBackground(UI.ColorBlanco);
		Txt.setBounds(383, 128, 210, 35);
		Txt.setForeground(UI.ColorNegro);
		Txt.setFont(new Font("Roboto",Font.PLAIN,12));
		Txt.setBorder(new LineBorder(UI.ColorPrimario,1));
	}

	public static void InyectarEstilosBotonPrimario(JButton Btn) {
		Btn.setBackground(ColorSecundario);
		Btn.setBorder(new LineBorder(UI.ColorSecundario,1));		
	}
	
	public static void AgregarComponenteEnPanel(JPanel Frm , JPanel Panel) {
		Panel.add(Frm);
		Frm.show();
		Panel.repaint();
		Panel.revalidate();
	}
	
	
}
