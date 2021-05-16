package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class InvasorCalamar implements Enemigo {
	
	//Atributos
	

	//estado instrinseco (propio de calamar)
	private String rutaImage;
	private int puntosPorMuerte; //puntos que dan al ser matados
	private String rutaImagen2; //imagen 2 del enemigo
	private int vida;
	private double velocidad;
	private int ancho;
	private int alto;
	
	
	public InvasorCalamar(double velocidad, int vida, int ancho, int alto, String rutaImage, String rutaImage2) {
		this.velocidad = velocidad;
		this.vida = vida;
		this.ancho = ancho;
		this.alto = alto;
		this.rutaImage = rutaImage;
		this.rutaImagen2 = rutaImage2;
		
		rutaImage = ("./data/imagenes/Naves/s0.png");
		setPuntosPorMuerte(30);
		
		System.out.println ("Soy un calamar");
		
	}
	
	
	public String getRutaImage() { //get imagen de la nave
		return rutaImage;
	}

	public void setRutaImage(String rutaImage) { //set imagen de la nave
		this.rutaImage = rutaImage;
	}
	
	public String getRutaImagen2() {
		return rutaImagen2;
	}


	public void setRutaImagen2(String rutaImagen2) {
		this.rutaImagen2 = rutaImagen2;
	}
	
	
	public double getVelocidad() { //get velocidad de la nave
		return this.velocidad;
	}


	public void setVelocidad(double velocidad) {  //set velocidad de la nave
		this.velocidad = velocidad;
	}

	
	public int getPuntosPorMuerte() {
		return puntosPorMuerte;
	}

	public void setPuntosPorMuerte(int puntosPorMuerte) {
		this.puntosPorMuerte = puntosPorMuerte;
	}


	public int getVida() {  //get vida de la nave
		return this.vida;
	}

	public void setVida(int vida) { //set vida de la nave
		this.vida = vida;
	}
	
	public void golpe (int daño) {   //quitar una vida cuando la nave recibe un golpe
		this.vida = this.vida - daño;
	}
	

	public void setAncho(int ancho) {  //set ancho de la nave
		this.ancho = ancho;
	}

	public int getAncho() {  //get ancho de la nave
		return this.ancho;
	}

	public int getAlto() {  //get alto de la nave
		return this.alto;
	}

	public void setAlto(int alto) { //set alto de la nave
		this.alto = alto;
	}

	public boolean estaViva() { //preguntar si la nave tiene vidas
		return vida != 0;
	}

	
	
}
