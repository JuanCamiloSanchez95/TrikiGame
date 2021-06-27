package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.TrikiGame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class TrikiUI extends JFrame implements ActionListener
{

	//Atributos
	private TrikiGame trikiLogic;
	private PanelTitulo panelTitulo;
	private JTextField empatadasField;
	private JTextField jugadasField;
	private JTextField nombreJugador2;
	private JTextField nombreJugador1;
	private JTextField ganadasJugador1;
	private JTextField perdidasJugador1;
	private JTextField ganadasJugador2;
	private JTextField perdidasJugador2;
	private JButton botonSuperiorIzquierdo;
	private JButton botonSuperiorCentro;
	private JButton botonSuperiorDerecho;
	private JButton botonCentroIzquierdo;
	private JButton botonCentroCentro;
	private JButton botonCentroDerecho;
	private JButton botonInferiorIzquierdo;
	private JButton botonInferiorCentro;
	private JButton botonInferiorDerecho;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblPartidasFaltantes;
	private JTextField partidasFaltantes;
	
	/**
	 * Create the frame.
	 */
	public TrikiUI(String nombre1, String nombre2, String cantidad) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 876, 611);
		getContentPane().setLayout(new BorderLayout(0, 0));	
		
		panelTitulo = new PanelTitulo();
		getContentPane().add(panelTitulo, BorderLayout.NORTH);
		
		JPanel panelGrilla = new JPanel();
		getContentPane().add(panelGrilla, BorderLayout.CENTER);
		panelGrilla.setLayout(new GridLayout(3, 3, 1, 1));
		
		botonSuperiorIzquierdo = new JButton("New button");
		botonSuperiorIzquierdo.setBackground(Color.WHITE);
		botonSuperiorIzquierdo.setActionCommand("SuperiorIzquierdo");
		botonSuperiorIzquierdo.addActionListener(this);
		panelGrilla.add(botonSuperiorIzquierdo);
		
		botonSuperiorCentro = new JButton("New button");
		botonSuperiorCentro.setBackground(Color.WHITE);
		botonSuperiorCentro.setActionCommand("SuperiorCentro");
		botonSuperiorCentro.addActionListener(this);
		panelGrilla.add(botonSuperiorCentro);
		
		botonSuperiorDerecho = new JButton("New button");
		botonSuperiorDerecho.setBackground(Color.WHITE);
		botonSuperiorDerecho.setActionCommand("SuperiorDerecho");
		botonSuperiorDerecho.addActionListener(this);
		panelGrilla.add(botonSuperiorDerecho);
		
		botonCentroIzquierdo = new JButton("New button");
		botonCentroIzquierdo.setBackground(Color.WHITE);
		botonCentroIzquierdo.setActionCommand("CentroIzquierdo");
		botonCentroIzquierdo.addActionListener(this);
		panelGrilla.add(botonCentroIzquierdo);
		
		botonCentroCentro = new JButton("New button");
		botonCentroCentro.setBackground(Color.WHITE);
		botonCentroCentro.setActionCommand("CentroCentro");
		botonCentroCentro.addActionListener(this);
		panelGrilla.add(botonCentroCentro);
		
		botonCentroDerecho = new JButton("New button");
		botonCentroDerecho.setBackground(Color.WHITE);
		botonCentroDerecho.setActionCommand("CentroDerecho");
		botonCentroDerecho.addActionListener(this);
		panelGrilla.add(botonCentroDerecho);
		
		botonInferiorIzquierdo = new JButton("New button");
		botonInferiorIzquierdo.setBackground(Color.WHITE);
		botonInferiorIzquierdo.setActionCommand("InferiorIzquierdo");
		botonInferiorIzquierdo.addActionListener(this);
		panelGrilla.add(botonInferiorIzquierdo);
		
		botonInferiorCentro = new JButton("New button");
		botonInferiorCentro.setBackground(Color.WHITE);
		botonInferiorCentro.setActionCommand("InferiorCentro");
		botonInferiorCentro.addActionListener(this);
		panelGrilla.add(botonInferiorCentro);
		
		botonInferiorDerecho = new JButton("New button");
		botonInferiorDerecho.setBackground(Color.WHITE);
		botonInferiorDerecho.setActionCommand("InferiorDerecho");
		botonInferiorDerecho.addActionListener(this);
		panelGrilla.add(botonInferiorDerecho);
		
		
		
		JPanel PanelInformacionJuego = new JPanel();
		PanelInformacionJuego.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.WHITE, null, null));
		getContentPane().add(PanelInformacionJuego, BorderLayout.EAST);
		PanelInformacionJuego.setLayout(new BorderLayout(0, 0));
		
		JPanel TituloInformacion = new JPanel();
		PanelInformacionJuego.add(TituloInformacion, BorderLayout.NORTH);
		
		JLabel lblInformacionJugadores = new JLabel("Informacion Jugadores");
		TituloInformacion.add(lblInformacionJugadores);
		
		JPanel PanelBajo = new JPanel();
		PanelInformacionJuego.add(PanelBajo, BorderLayout.SOUTH);
		PanelBajo.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblEmpates = new JLabel("Empates");
		lblEmpates.setHorizontalAlignment(SwingConstants.CENTER);
		PanelBajo.add(lblEmpates);
		
		empatadasField = new JTextField();
		empatadasField.setHorizontalAlignment(SwingConstants.CENTER);
		empatadasField.setEditable(false);
		PanelBajo.add(empatadasField);
		empatadasField.setColumns(10);
		
		JLabel lblPartidasJugadas = new JLabel("Partidas jugadas");
		lblPartidasJugadas.setHorizontalAlignment(SwingConstants.CENTER);
		PanelBajo.add(lblPartidasJugadas);
		
		jugadasField = new JTextField();
		jugadasField.setHorizontalAlignment(SwingConstants.CENTER);
		jugadasField.setEditable(false);
		PanelBajo.add(jugadasField);
		jugadasField.setColumns(10);
		
		JPanel CentroInformacionJuego = new JPanel();
		CentroInformacionJuego.setBorder(new EmptyBorder(5, 5, 0, 5));
		PanelInformacionJuego.add(CentroInformacionJuego, BorderLayout.CENTER);
		CentroInformacionJuego.setLayout(new BorderLayout(0, 0));
		
		JPanel PanelNombreJugadores = new JPanel();
		PanelNombreJugadores.setForeground(Color.GRAY);
		PanelNombreJugadores.setBorder(null);
		CentroInformacionJuego.add(PanelNombreJugadores, BorderLayout.NORTH);
		PanelNombreJugadores.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblJugador = new JLabel("Jugador 1");
		lblJugador.setHorizontalAlignment(SwingConstants.CENTER);
		PanelNombreJugadores.add(lblJugador);
		
		JLabel lblJugador_1 = new JLabel("Jugador 2");
		lblJugador_1.setHorizontalAlignment(SwingConstants.CENTER);
		PanelNombreJugadores.add(lblJugador_1);
		
		nombreJugador1 = new JTextField();
		nombreJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		PanelNombreJugadores.add(nombreJugador1);
		nombreJugador1.setEditable(false);
		nombreJugador1.setColumns(10);
		
		nombreJugador2 = new JTextField();
		nombreJugador2.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador2.setEditable(false);
		PanelNombreJugadores.add(nombreJugador2);
		nombreJugador2.setColumns(10);
		
		JPanel PanelJugador1 = new JPanel();
		CentroInformacionJuego.add(PanelJugador1, BorderLayout.WEST);
		PanelJugador1.setLayout(new GridLayout(4, 1, 0, 0));
		
		panel = new JPanel();
		PanelJugador1.add(panel);
		
		JLabel lblGanadas = new JLabel("Partidas Ganadas");
		panel.add(lblGanadas);
		lblGanadas.setHorizontalAlignment(SwingConstants.CENTER);
		
		ganadasJugador1 = new JTextField();
		panel.add(ganadasJugador1);
		ganadasJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		ganadasJugador1.setEditable(false);
		ganadasJugador1.setColumns(10);
		
		panel_1 = new JPanel();
		PanelJugador1.add(panel_1);
		
		JLabel lblPerdidas = new JLabel("Partidas Perdidas");
		panel_1.add(lblPerdidas);
		lblPerdidas.setHorizontalAlignment(SwingConstants.CENTER);
		
		perdidasJugador1 = new JTextField();
		panel_1.add(perdidasJugador1);
		perdidasJugador1.setHorizontalAlignment(SwingConstants.CENTER);
		perdidasJugador1.setEditable(false);
		perdidasJugador1.setColumns(10);
		
		JPanel PanelJugador2 = new JPanel();
		CentroInformacionJuego.add(PanelJugador2, BorderLayout.EAST);
		PanelJugador2.setLayout(new GridLayout(4, 1, 0, 0));
		
		panel_2 = new JPanel();
		PanelJugador2.add(panel_2);
		
		JLabel lblPartidasGanadas = new JLabel("Partidas Ganadas");
		panel_2.add(lblPartidasGanadas);
		lblPartidasGanadas.setHorizontalAlignment(SwingConstants.CENTER);
		
		ganadasJugador2 = new JTextField();
		panel_2.add(ganadasJugador2);
		ganadasJugador2.setHorizontalAlignment(SwingConstants.CENTER);
		ganadasJugador2.setEditable(false);
		ganadasJugador2.setColumns(10);
		
		panel_3 = new JPanel();
		PanelJugador2.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("Partidas Perdidas");
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		perdidasJugador2 = new JTextField();
		panel_3.add(perdidasJugador2);
		perdidasJugador2.setHorizontalAlignment(SwingConstants.CENTER);
		perdidasJugador2.setEditable(false);
		perdidasJugador2.setColumns(10);
		
		lblPartidasFaltantes = new JLabel("Partidas faltantes");
		lblPartidasFaltantes.setHorizontalAlignment(SwingConstants.CENTER);
		PanelBajo.add(lblPartidasFaltantes);
		
		partidasFaltantes = new JTextField();
		partidasFaltantes.setHorizontalAlignment(SwingConstants.CENTER);
		partidasFaltantes.setEditable(false);
		PanelBajo.add(partidasFaltantes);
		partidasFaltantes.setColumns(10);
		
		inicializarGrilla();
		String nombrePrimer = nombre1;
		String nombreSegundo = nombre2;
		int cant= Integer.parseInt(cantidad);
		trikiLogic = new TrikiGame(nombrePrimer, nombreSegundo, cant);
		nombreJugador1.setText(trikiLogic.getJugador1().getName());
		nombreJugador2.setText(trikiLogic.getJugador2().getName());
		ganadasJugador1.setText(trikiLogic.getJugador1().getGanadas() + "");
		perdidasJugador1.setText(trikiLogic.getJugador1().getPerdidas()+"");
		perdidasJugador2.setText(trikiLogic.getJugador2().getPerdidas()+"");
		ganadasJugador2.setText(trikiLogic.getJugador2().getGanadas() + "");
		empatadasField.setText(0 + "");
		jugadasField.setText(0+"");
		partidasFaltantes.setText(trikiLogic.getCantidadPartidas()+"");
		JOptionPane.showMessageDialog(this, "El juego empieza, el turno es del jugador "+ trikiLogic.getTurno());
				
	}
	
	public void inicializarGrilla() {
		botonSuperiorIzquierdo.setText("-");
		botonSuperiorIzquierdo.setFont(new Font("Arial", Font.PLAIN, 70));
		botonSuperiorCentro.setText("-");
		botonSuperiorCentro.setFont(new Font("Arial", Font.PLAIN, 70));
		botonSuperiorDerecho.setText("-");
		botonSuperiorDerecho.setFont(new Font("Arial", Font.PLAIN, 70));
		botonCentroIzquierdo.setText("-");
		botonCentroIzquierdo.setFont(new Font("Arial", Font.PLAIN, 70));
		botonCentroCentro.setText("-");
		botonCentroCentro.setFont(new Font("Arial", Font.PLAIN, 70));
		botonCentroDerecho.setText("-");
		botonCentroDerecho.setFont(new Font("Arial", Font.PLAIN, 70));
		botonInferiorIzquierdo.setText("-");
		botonInferiorIzquierdo.setFont(new Font("Arial", Font.PLAIN, 70));
		botonInferiorCentro.setText("-");
		botonInferiorCentro.setFont(new Font("Arial", Font.PLAIN, 70));
		botonInferiorDerecho.setText("-");
		botonInferiorDerecho.setFont(new Font("Arial", Font.PLAIN, 70));
	}

	public void reiniciarDatos() {
		nombreJugador1.setText(trikiLogic.getJugador1().getName());
		nombreJugador2.setText(trikiLogic.getJugador2().getName());
		ganadasJugador1.setText(trikiLogic.getJugador1().getGanadas() + "");
		perdidasJugador1.setText(trikiLogic.getJugador1().getPerdidas()+"");
		perdidasJugador2.setText(trikiLogic.getJugador2().getPerdidas()+"");
		ganadasJugador2.setText(trikiLogic.getJugador2().getGanadas() + "");
		empatadasField.setText(0 + "");
		jugadasField.setText(0+"");
		partidasFaltantes.setText(trikiLogic.getCantidadPartidas()+"");
		JOptionPane.showMessageDialog(this, "El juego empieza, el turno es del jugador "+ trikiLogic.getTurno());
	}
	
	public void refreshDatos() {
		nombreJugador1.setText(trikiLogic.getJugador1().getName());
		nombreJugador2.setText(trikiLogic.getJugador2().getName());
		ganadasJugador1.setText(trikiLogic.getJugador1().getGanadas() + "");
		perdidasJugador1.setText(trikiLogic.getJugador1().getPerdidas()+"");
		perdidasJugador2.setText(trikiLogic.getJugador2().getPerdidas()+"");
		ganadasJugador2.setText(trikiLogic.getJugador2().getGanadas() + "");
		JOptionPane.showMessageDialog(this, "El juego empieza, el turno es del jugador "+ trikiLogic.getTurno());
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String nombreJugador1 = JOptionPane.showInputDialog("Ingrese el nombre del primer jugador");
					String nombreJugador2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador");
					String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
					TrikiUI frame = new TrikiUI(nombreJugador1, nombreJugador2, cantidadPartidas);
					frame.nombreJugador1.setText(nombreJugador1);
					frame.nombreJugador2.setText(nombreJugador2);
					frame.partidasFaltantes.setText(cantidadPartidas);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Metodo de los botones para generar acciones 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String evento= e.getActionCommand();
		if (evento.equals("SuperiorIzquierdo"))
		{
			if (trikiLogic.posicionValida(0,0)) {
				botonSuperiorIzquierdo.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(0,0);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("SuperiorCentro"))
		{
			if(trikiLogic.posicionValida(0,1)) {
				botonSuperiorCentro.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(0,1);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
				
			}else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
		}
		else if (evento.equals("SuperiorDerecho"))
		{
			if(trikiLogic.posicionValida(0,2)) {
				botonSuperiorDerecho.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(0,2);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("CentroIzquierdo"))
		{
			if(trikiLogic.posicionValida(1,0)) {
				botonCentroIzquierdo.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(1,0);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("CentroCentro"))
		{
			if(trikiLogic.posicionValida(1,1)) {
				botonCentroCentro.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(1,1);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("CentroDerecho"))
		{
			if(trikiLogic.posicionValida(1,2)) {
				botonCentroDerecho.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(1,2);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("InferiorIzquierdo"))
		{
			if(trikiLogic.posicionValida(2,0)) {
				botonInferiorIzquierdo.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(2,0);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
		}

		else if (evento.equals("InferiorCentro"))
		{
			if(trikiLogic.posicionValida(2,1)) {
				botonInferiorCentro.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(2,1);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
		else if (evento.equals("InferiorDerecho"))
		{
			if(trikiLogic.posicionValida(2, 2)) {
				botonInferiorDerecho.setText(trikiLogic.getSimboloActual());
				trikiLogic.procesarJugada(2,2);
				if(trikiLogic.getPartidaTerminada()) {
					JOptionPane.showMessageDialog(this, "El ganador de esta ronda es el jugador " + trikiLogic.getGanador().getName());
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else if(this.trikiLogic.getEmpatada()) {
					JOptionPane.showMessageDialog(this, "Esta ronda es un empate");
					int cantidad =  Integer.parseInt(partidasFaltantes.getText());
					cantidad--;
					partidasFaltantes.setText(cantidad+"");
					this.trikiLogic.setEmpates();
					this.empatadasField.setText(this.trikiLogic.getEmpates()+"");
					if(cantidad > 0) {
						int jugada = Integer.parseInt(jugadasField.getText());
						jugada++;
						jugadasField.setText(jugada+"");
						this.refreshDatos();
						this.inicializarGrilla();
						this.trikiLogic.reiniciarGame();
					}
					else if(cantidad == 0) {
						int value = JOptionPane.showConfirmDialog(this, "Las rondas se acabaron ¿desea iniciar un nuevo juego?", "Game Over", JOptionPane.YES_NO_OPTION);
						if(value == 0) {
							this.inicializarGrilla();
							String cantidadPartidas = JOptionPane.showInputDialog("Ingrese la cantidad de partidas que desea jugar");
							int cant= Integer.parseInt(cantidadPartidas);
							trikiLogic = new TrikiGame(nombreJugador1.getText(), nombreJugador2.getText(), cant);
							this.reiniciarDatos();
						}
						else if(value == 1) {
							this.dispose();
						}
					}
				}
				else {
					JOptionPane.showMessageDialog(this, "Es el turno del jugador " + trikiLogic.getTurno());
				}
			}
			else {
				JOptionPane.showMessageDialog(this, "Esta posicion no es valida intenta una nueva");
			}
			
		}
	}
}
