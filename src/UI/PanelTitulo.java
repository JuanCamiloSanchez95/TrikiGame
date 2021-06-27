package UI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTitulo extends JPanel
{
	//ATRIBUTOS
	private JLabel tituloLabel;
	
	//CONSTRUCTOR
	public PanelTitulo() {
		setLayout(new BorderLayout());
		tituloLabel =  new JLabel("TRIKI GAME", JLabel.CENTER);
		add(tituloLabel ,BorderLayout.CENTER);
		
		
	}

}