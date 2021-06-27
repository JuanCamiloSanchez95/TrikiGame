package Model;

public class Player 
{
	//Nombre e identificador del jugador
	private String name;
	//Cantidad de partidas ganadas
	private int ganadas;
	//Cantidad de partidas perdidas
	private int perdidas;
	//Porcentaje de victoria del jugador
	private double porcentajeVictoria;
	//Simbolo del jugador
	private String simboloJugador;
	
	/**
	 * Metodo constructor para el jugador
	 * @param nName nombre del jugador
	 * @param nGanadas partidas ganadas
	 * @param nPerdidas partidas perdidas
	 * @param nPorcentaje porcentaje de victorias
	 */
	public Player(String nName, String simbolo){
		this.name = nName;
		this.simboloJugador =  simbolo;
		this.ganadas = 0;
		this.perdidas = 0;
		this.porcentajeVictoria = 0;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the ganadas
	 */
	public int getGanadas() {
		return ganadas;
	}
	/**
	 * @return the perdidas
	 */
	public int getPerdidas() {
		return perdidas;
	}
	/**
	 * @return the porcentajeVictoria
	 */
	public double getPorcentajeVictoria() {
		return porcentajeVictoria;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param ganadas the ganadas to set
	 */
	public void setGanadas(int ganadas) {
		this.ganadas += ganadas;
	}
	/**
	 * @param perdidas the perdidas to set
	 */
	public void setPerdidas(int perdidas) {
		this.perdidas += perdidas;
	}
	/**
	 * @param porcentajeVictoria the porcentajeVictoria to set
	 */
	public void setPorcentajeVictoria() {
		this.porcentajeVictoria = ganadas/(ganadas+perdidas);
	}

	
}
