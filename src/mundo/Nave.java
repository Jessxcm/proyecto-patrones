package mundo;

import java.io.Serializable;

/**
 * 
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public abstract class Nave implements Serializable {

	// -----------------------------------------------------------------
	// ---------------------------Asociaciones--------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	Disparo disparoUno;

	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	private double velocidad;

	/**
	 * 
	 */
	protected int posX;

	/**
	 * 
	 */
	protected int posY;

	/**
	 * 
	 */
	private int vida;

	/**
	 * 
	 */
	private int ancho;

	/**
	 * 
	 */
	private int alto;

	/**
	 * 
	 */
	private String rutaImage;

	// -----------------------------------------------------------------
	// ---------------------------Constructor---------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 * @param velocidad
	 * @param posX
	 * @param posY
	 * @param vida
	 * @param ancho
	 * @param alto
	 */
	public Nave() {  //constructor con todo 0, es necesario?
		this.velocidad = 0;
		this.posX = 0;
		this.posY = 0;
		this.vida = 0;
		this.ancho = 0;
		this.alto = 0;
	}

	public Nave(double velocidad, int posX, int posY, int vida, int ancho, int alto, String ruta) {  //constructor que recibe datos
		this.velocidad = velocidad;
		this.posX = posX;
		this.posY = posY;
		this.vida = vida;
		this.ancho = ancho;
		this.alto = alto;
		rutaImage = ruta;
	}

	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	public String getRutaImage() { //get imagen de la nave
		return rutaImage;
	}

	public void setRutaImage(String rutaImage) { //set imagen de la nave
		this.rutaImage = rutaImage;
	}

	/**
	 * 
	 * @return
	 */
	public double getVelocidad() { //get velocidad de la nave
		return this.velocidad;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(double velocidad) {  //set velocidad de la nave
		this.velocidad = velocidad;
	}

	/**
	 * 
	 * @return
	 */
	public int getPosX() {  //get posicion en x de la nave
		return this.posX;
	}

	/**
	 * 
	 * @param posX
	 */
	public void setPosX(int posX) {  //set posicion en x de la nave
		this.posX = posX;
	}

	/**
	 * 
	 * @return
	 */
	public int getPosY() { //get posicion en y de la nave
		return this.posY;
	}

	/**
	 * 
	 * @param posY
	 */
	public void setPosY(int posY) {  //set posicion en y de la nave
		this.posY = posY;
	}

	/**
	 * 
	 * @return
	 */
	public int getVida() {  //get vida de la nave
		return this.vida;
	}

	/**
	 * 
	 * @param vidas
	 */
	public void setVida(int vida) { //set vida de la nave
		this.vida = vida;
	}

	/**
	 * 
	 * @param daño
	 */
	public void golpe (int daño) {   //quitar una vida cuando la nave recibe un golpe
		this.vida = this.vida - daño;
	}
	
	/**
	 * 
	 * @param ancho
	 */
	public void setAncho(int ancho) {  //set ancho de la nave
		this.ancho = ancho;
	}

	/**
	 * 
	 * @return
	 */
	public int getAncho() {  //get ancho de la nave
		return this.ancho;
	}

	/**
	 * 
	 * @return
	 */
	public int getAlto() {  //get alto de la nave
		return this.alto;
	}

	/**
	 * 
	 * @param alto
	 */
	public void setAlto(int alto) { //set alto de la nave
		this.alto = alto;
	}

	/**
	 * 
	 * @return
	 */
	public Disparo getDisparoUno() {  //get el disparo de la nave
		return disparoUno;
	}

	/**
	 * 
	 * @param disparoUno
	 */
	public void setDisparoUno(Disparo disparoUno) { //set el disparo de la nave
		this.disparoUno = disparoUno;
	}

	/**
	 * 
	 * @return
	 */
	public boolean estaViva() { //preguntar si la nave tiene vidas
		return vida != 0;
	}

	/**
	 * 
	 */
	public void mover(int dir) {   //???
	}

	/**
	 * 
	 */
	public void resetear() {  //????
	}
	
	/**
	 * 
	 */
	public void eliminarDisparo() {  //eliminar disparo de la nave
		disparoUno = null;
	}
	
	/**
	 * 
	 * @param posX
	 * @param posY
	 */
	public void disparar (int posX, int posY) { //la nave dispara
		
		if (disparoUno == null) { //si no tiene disparo
			disparoUno = new Disparo(posX, posY); //se le agrega un nuevo disparo en la posicion x,y
		}
		
	}

}