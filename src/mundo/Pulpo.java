package mundo;

public class Pulpo implements IEnemigo {
	
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
	
	public Pulpo(double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String rutaImage2) {
		this.velocidad = velocidad;
		this.posX = posX;
		this.posY = posY;
		this.vida = vida;
		this.ancho = ancho;
		this.alto = alto;
		this.rutaImage = rutaImage;
		this.direccion = direccion;
		this.rutaImagen2 = rutaImage2;
		
		rutaImage = ("./data/imagenes/Naves/r0.png");
		setPuntosPorMuerte(10);
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
	
	public int getPuntosPorMuerte() {
		return puntosPorMuerte;
	}

	public void setPuntosPorMuerte(int puntosPorMuerte) {
		this.puntosPorMuerte = puntosPorMuerte;
	}

	public boolean edge (){ //final del tablero ??
		return (posX > 599 || posX < 0);
	}
	
	public double getVelocidad() { //get velocidad de la nave
		return this.velocidad;
	}
	

	public void mover(int dir) {
		posX += dir*getVelocidad();
		
	}
	
	public void moverAbajo (int dir) { //los monstruos van bajando cuando recorren el mapa
		posY += dir*10;
	
	}
	
	public void speak() {
		System.out.println ("Soy un pulpo");
	}
	

}
