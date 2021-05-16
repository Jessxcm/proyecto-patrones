package mundo;

import excepciones.PartidaYaExisteException;

/**
 * 
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class NaveJugador extends Nave {

	// -----------------------------------------------------------------
	// ---------------------------Constantes----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //?

	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	private Partida partidaRaiz; // ?

	/**
	 * 
	 */
	private int posInicialX; //posicion inicial jugador

	/**
	 * 
	 */
	private int posIncialY;  //posicion final jugador
	
	/**
	 * 
	 */
	private String nickname; // nick del jugador ?????

	/**
	 * 
	 */
	private String nombre; // nombre del jugador ????

	/**
	 * 
	 */
	private int cantidadDisparos; //cantidad de disparos de la nave

	// -----------------------------------------------------------------
	// ---------------------------Constructor---------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 * @param pNombre
	 * @param pDirectorio
	 */
	public NaveJugador(String nombre, String nickname) {
		super(); // ??? inicializa todo en 0 ?? para que si luego se asignan??
		partidaRaiz = null; // ???? por que partidas en nave?
		this.posInicialX = 320;
		this.posIncialY = 410; //para que sirve el constructor anterior si todo se esta quemando aca?
		this.setVida(3);
		this.nombre = nombre; // por que la nave tiene el nombre y el nickname?
		this.nickname = nickname;
	}

	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 * @param agregar
	 * @throws PartidaYaExisteException
	 */
	public void agregarPartida(Partida agregar) throws PartidaYaExisteException { // por que cosas relacionadas con la partida en la nave?

		if (partidaRaiz == null) { //partida raiz es nula, se agrega partida
			partidaRaiz = agregar; //la partida pasa a ser agregar
		} else {
			partidaRaiz.agregarPartida(agregar); //si la partida raiz no es nula, se agrega la partida
		}

	}

	/**
	 * 
	 * @param nombre
	 * @throws PartidaYaExisteException
	 */
	public Partida crearPartida(String nombre) throws PartidaYaExisteException {  //la partida esta ligada a la nave ???

		Partida b = new Partida(nombre);
		agregarPartida(b);

		return b;

	}

	/**
	 * 
	 * @return
	 */
	public int getPosInicialX() { 
		return this.posInicialX;
	}

	/**
	 * 
	 * @param posInicialX
	 */
	public void setPosInicialX(int posInicialX) {
		this.posInicialX = posInicialX;
	}

	/**
	 * 
	 * @return
	 */
	public int getPosIncialY() {
		return this.posIncialY;
	}

	/**
	 * 
	 * @param posIncialY
	 */
	public void setPosIncialY(int posIncialY) {
		this.posIncialY = posIncialY;
	}
	
	/**
	 * 
	 * @return
	 */
	public Partida getPartidaRaiz() { //partida de raiz
		return partidaRaiz;
	}

	/**
	 * 
	 * @param partidaRaiz
	 */
	public void setPartidaRaiz(Partida partidaRaiz) {
		this.partidaRaiz = partidaRaiz;
	}

	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * 
	 * @param nickname
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getCantidadDisparos() { //cantidad disparos de la nave??
		return cantidadDisparos;
	}

	public void setCantidadDisparos(int cantidadDisparos) { 
		this.cantidadDisparos = cantidadDisparos;
	}

	public boolean perdio () { //saner si jugador perdio
		return getVida() == 0;
	}

	/**
	 * 
	 */
	public void iniciarPartida() {  // no se usa????

	}

	@Override
	public void mover(int dir) {
		super.mover(dir); // ?????????????????????????
		posInicialX += dir * 10.0d;
	}

	@Override
	public String toString() { //para que es?
		return nickname;
	}

	public void disparar (int posX, int posY) { //la nave dispara

		if (disparoUno == null) { //si no hay disparos
			cantidadDisparos++; //pero siempre es solo un disparo?????
			disparoUno = new Disparo(posX, posY);
		}
	}

}