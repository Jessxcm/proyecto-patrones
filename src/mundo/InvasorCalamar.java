package mundo;

/**
 *
 * @author Manuel Alejandro Coral Lozano - Juan Sebastián Quintero Yoshioka
 *         Proyecto final - Algoritmos y programación II.
 */
public class InvasorCalamar implements Enemigo {
	
	//Atributos
	private int direccion; //direccion del enemigo
	
	private String rutaImagen2; //imagen 2 del enemigo
	private int puntosPorMuerte; //puntos que dan al ser matados
	
	Disparo disparoUno;

	private double velocidad;
	protected int posX;

	protected int posY;

	private int vida;

	private int ancho;

	private int alto;

	private String rutaImage;
	
	public InvasorCalamar(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String rutaImage2) {
		this.velocidad = velocidad;
		this.posX = posX;
		this.posY = posY;
		this.vida = vida;
		this.ancho = ancho;
		this.alto = alto;
		this.rutaImage = rutaImage;
		this.direccion = direccion;
		this.rutaImagen2 = rutaImage2;
		
		rutaImage = ("./data/imagenes/Naves/s0.png");
		setPuntosPorMuerte(30);
		
		System.out.println ("Soy un calamar");
		
	}
	
	
	
	
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	public int getDireccion() {
		return direccion;
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

	public int getPosX() {  //get posicion en x de la nave
		return this.posX;
	}


	public void setPosX(int posX) {  //set posicion en x de la nave
		this.posX = posX;
	}


	public int getPosY() { //get posicion en y de la nave
		return this.posY;
	}


	public void setPosY(int posY) {  //set posicion en y de la nave
		this.posY = posY;
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
	


	public void mover(int dir) {
		posX += dir*getVelocidad();
		
	}
	
	public void moverAbajo (int dir) { //los monstruos van bajando cuando recorren el mapa
		posY += dir*10;
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

	public Disparo getDisparoUno() {  //get el disparo de la nave
		return disparoUno;
	}

	public void setDisparoUno(Disparo disparoUno) { //set el disparo de la nave
		this.disparoUno = disparoUno;
	}

	public boolean estaViva() { //preguntar si la nave tiene vidas
		return vida != 0;
	}


	public void eliminarDisparo() {  //eliminar disparo de la nave
		disparoUno = null;
	}
	

	public void disparar (int posX, int posY) { //la nave dispara
		if (disparoUno == null) { //si no tiene disparo
			disparoUno = new Disparo(posX, posY); //se le agrega un nuevo disparo en la posicion x,y
		}
		
	}
	
	
}
