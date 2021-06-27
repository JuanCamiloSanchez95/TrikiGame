package Model;

import java.util.Scanner;

public class TrikiGame {

	//Jugadores
	private Player jugador1;
	private Player jugador2;
	//Caracteristicas del juego
	private int turno;
	private int empatadas;
	private int cantidadPartidas;
	private int partidasJugadas;
	//Matriz del triki
	private String[][] matrizTriki;
	//Verificador de partida
	private boolean partidaTerminada;
	private Player ganador;
	private boolean empatada;
	private int empates;
	
	public TrikiGame(String nameP1, String nameP2, int cantidadPartidas) {
		//Creacion de las instancias jugador de la partida
		jugador1 = new Player(nameP1, "X");
		jugador2 = new Player(nameP2, "Y");
		//Creacion de la matriz del juego
		matrizTriki = new String[3][3];
		IniciarTablero();
		//Inicia con el turno del jugador 1
		turno=1;
		//Cantidad de partidas que se jugaran
		partidasJugadas = 0;
		this.cantidadPartidas = cantidadPartidas;
		empatadas = 0;
		partidaTerminada = false;
		empatada = false;
		empates = 0 ;
	}
	
	
	/**
	 * Metodo encargado de rellenar la matriz con el simbolo vacio
	 */
	public void IniciarTablero() {
		for (int i = 0; i < matrizTriki.length; i++) {
			for (int j = 0; j < matrizTriki.length; j++) {
				matrizTriki[i][j]="-";
			}
		}
	}
	
	/**
	 * Obtiene la matriz que se armo
	 * @return
	 */
	public String[][] getMatriz() {
		return matrizTriki;
	}
	
	/**
	 * 
	 * @return
	 */
	public Player getJugador1() {
		return jugador1;
	}
	
	/**
	 * 
	 * @return
	 */
	public Player getJugador2() {
		return jugador2;
	}

	public int getCantidadPartidas() {
		return cantidadPartidas;
	}
	
	public String getSimboloActual() {
		if (turno == 1) {
			return "X";
		}
		else {
			return "O";
		}
	}
	
	public boolean getPartidaTerminada() {
		return partidaTerminada;
	}
	
	/**
	 * Metodo encargado de cambiar el turno al siguiente jugador por medio de una numeracion basica
	 */
	public void cambiarTurno() {
		if(turno == 1) {
			turno = 2;
		}else {
			turno = 1;
		}
	}
	
	public void reiniciarGame() {	
		empatada = false;
		partidaTerminada=false;
		IniciarTablero();
		ganador=null;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getTurno() {
		return turno;
	}
	
	public Player getGanador() {
		return ganador;
	}
	
	public boolean getEmpatada() {
		return empatada;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates() {
		empates++;
	}
	
	public void resetGanador() {
		ganador = null;
	}
	
	public boolean posicionValida(int posX, int posY) {
		boolean resp = false;
		if(matrizTriki[posX][posY].equals("-")) {
			resp = true;
		}
		return resp;
	}
	
	
	
	//METODO DE PRUEBA
	public void pintarTablero(){
		for (int i = 0; i < matrizTriki.length; i++) {
			for (int j = 0; j < matrizTriki.length; j++) {
				System.out.print(" | "+ matrizTriki[i][j]);
				
			}
			System.out.println(" | ");
		}
	}
	
	/**
	 * Procesamiento de una jugada realizada por un jugador
	 * @param posX posicion x del cuadro seleccionado por el jugador
	 * @param posY posicion y del cuadro seleccionado por el jugador
	 * @param turnoJugador numero del jugador que esta realizando la jugada
	 */
	public void procesarJugada(int posX, int posY) {
		if(posicionValida(posX, posY)) {
			pintarSimbolo(posX, posY);
			cambiarTurno();
		}
		else {
			System.out.println("Lugar no disponible");
		}
		System.out.println("Siguiente Jugada");
		pintarTablero();
	}
	
	/**
	 * Metodo que se encarga de pintar el simbolo del jugador en la matriz
	 * @param posX posicion de la fila en la que el jugador pintara su simbolo
	 * @param posY posicion de la columna en la que el jugador pintara su simbolo
	 */
	public void pintarSimbolo(int posX, int posY) {
		if(turno == 1) {
			matrizTriki[posX][posY] = "X";
			if(verificarGanador(posX, posY)) {
				System.out.println("Hubo un ganador 1");
				jugador1.setGanadas(1);
				jugador2.setPerdidas(1);
				jugador1.setPorcentajeVictoria();
				jugador2.setPorcentajeVictoria();
				ganador = jugador1;
			}
			else if(verificarLleno()) {
				System.out.println("Es un empate");
				empatadas ++;
				empatada = true;
			}
		}
		else if(turno == 2){
			matrizTriki[posX][posY] = "O";
			if(verificarGanador(posX, posY)) {
				System.out.println("Hubo un ganador 2");
				jugador2.setGanadas(1);
				jugador1.setPerdidas(1);
				jugador1.setPorcentajeVictoria();
				jugador2.setPorcentajeVictoria();
				ganador = jugador2;
			}
			else if(verificarLleno()) {
				empatadas ++;
				empatada =  true;
				System.out.println("Es un empate");
			}
		}
	}
	
	/**
	 * Verifica si hay un ganador usando una recursion sobre la posicion
	 * @return true en caso de ya haber un ganador falso en caso contrario
	 */
	public boolean verificarGanador(int posX, int posY) {
		boolean resp = false;
		if(coincidenciaColumna(posX,posY) || coincidenciaLinea(posX,posY) || coincidenciaDiagonalBajando() || coincidenciaDiabonalSubiendo()) {
			resp = true;
			partidaTerminada = true;
		}
		return resp;
	}
	
	
	
	/**
	 * Metodo que se encarga de verificar si hay una coincidencia en la fila que el jugador
	 * decidio poner su simbolo 
	 * @param posX posicion de la linea en la matriz 
	 * @param posY psoicion de la columna en la matriz
	 * @return retorna true en caso de que haya una coincidencia false en caso contrario
	 */
	public boolean coincidenciaLinea(int posX, int posY) {
		boolean resp = true;
		String simbolo = matrizTriki[posX][posY];
		for (int i = 0; i < matrizTriki[posX].length; i++) {
			if (!simbolo.equals(matrizTriki[posX][i])) {
				resp = false;
			}
		}
		return resp;
	}
	
	/**
	 * Metodo que se encarga de verificar si hay una coincidencia en la columna que el jugador
	 * decidio poner su simbolo 
	 * @param posX posicion de la fila en la matriz
	 * @param posY posicion de la columna en la matriz 
	 * @return retorna true en caso de que haya una coincidencia false en caso contrario
	 */
	public boolean coincidenciaColumna(int posX, int posY) {
		boolean resp = true;
		String simbolo = matrizTriki[posX][posY];
		for (int i = 0; i < matrizTriki[posY].length; i++) {
			if (!simbolo.equals(matrizTriki[i][posY])) {
				resp = false;
			}
		}
		return resp;
	}
	
	/**
	 * Metodo encargado de verificar si existe una coincidencia en la diagonal y=n-x de la matriz
	 * @return true en caso de haber coincdencia en algunas de las dos diagonales.
	 */
	public boolean coincidenciaDiagonalBajando() {
		boolean resp = true;
		String simbolo = matrizTriki[0][0];
		if (simbolo.equals("-")) {
			resp = false;
		}
		else if(!simbolo.equals("-")) {
			for (int i = 1; i < matrizTriki.length; i++) {
				if(!matrizTriki[i][i].equals(simbolo)) {
					resp=false;
				}
			}
		}
		return resp;
	}

	/**
	 * Metodo encargado de verficar la diagonal incremental desde la izquierda
	 * @return 
	 */
	public boolean coincidenciaDiabonalSubiendo() {
		boolean resp = true;
		String simbolo = matrizTriki[0][2];
		if (simbolo.equals("-")) {
			resp = false;
		}
		else if(!simbolo.equals("-")) {
			for (int i = 1; i < matrizTriki.length; i++) {
				if(!matrizTriki[i][2-i].equals(simbolo)) {
					resp=false;
				}
			}
		}
		return resp;
	}
	
	/**
	 * Metodo encargado de verificar si existe una coincidencia en la diagonal y=x de la matriz
	 * @return true en caso de haber coincdencia en algunas de las dos diagonales.
	 */
	public boolean verificarLleno() {
		for (int i = 0; i < matrizTriki.length; i++) {
			for (int j = 0; j < matrizTriki.length; j++) {
				if (matrizTriki[i][j].equals("-")) {
					return false;
				}
			}
		}
		return true;
	}
}
