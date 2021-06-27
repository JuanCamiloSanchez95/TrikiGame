package UI;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelGrillaTriki extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//Atributos
	private JButton[][] grillaTriki;
	private TrikiUI principal;
	
	public PanelGrillaTriki(TrikiUI principal) {
		this.principal = principal;
		setLayout(new GridLayout(3, 3));
		grillaTriki = new JButton[3][3];
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	}
	

}
