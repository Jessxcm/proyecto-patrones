package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public abstract class Enemigo extends Nave {

	// -----------------------------------------------------------------
	// ----------------------------Constantes---------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 */
	public final static int IZQUIERDA = 0;

	/**
	 * 
	 */
	public final static int DERECHA = 1;

	// -----------------------------------------------------------------
	// ----------------------------Atributos----------------------------
	// -----------------------------------------------------------------
	
	/**
	 * 
	 */
	private int direccion; //direccion del enemigo
	
	/**
	 * 
	 */
	private String rutaImagen2; //imagen 2 del enemigo

	/**
	 * 
	 */
	private int puntosPorMuerte; //puntos que dan al ser matados
	
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
	 * @param direccion
	 * 
	 * 
	 */
	
	//constructor enemigo
	
	public Enemigo(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String rutaImage2) {
		super(velocidad, posX, posY, vida, ancho, alto, rutaImage); // ????????????????? es el de la nave???
		this.direccion = direccion;
		rutaImagen2 = rutaImage2;
	}

	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getDireccion() {
		return direccion;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getRutaImagen2() {
		return rutaImagen2;
	}

	/**
	 * 
	 * @param rutaImagen2
	 */
	public void setRutaImagen2(String rutaImagen2) {
		this.rutaImagen2 = rutaImagen2;
	}
	
	public int getPuntosPorMuerte() {
		return puntosPorMuerte;
	}

	public void setPuntosPorMuerte(int puntosPorMuerte) {
		this.puntosPorMuerte = puntosPorMuerte;
	}

	public boolean edge (){ //final del tablero ??
		return (posX > 599 || posX < 0);
	}
	
	@Override
	public void mover(int dir) {
		// TODO Auto-generated method stub
		super.mover(dir);
		
		posX += dir*getVelocidad();
		
	}
	
	public void moverAbajo (int dir) { //los monstruos van bajando cuando recorren el mapa
		posY += dir*10;
	}
	
}
