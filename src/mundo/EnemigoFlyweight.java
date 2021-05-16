package mundo;


//contiene toda la información del enemigo


//flyweight implementa enemigo
public class EnemigoFlyweight implements Enemigo {
	
	protected int posX;
	protected int posY;
	private int direccion; //direccion del enemigo
	Disparo disparoUno;

	
	
	private Enemigo enemigoLigero; //enemigo (calamar, cangrejo, pulpo) que tiene lo compartido entre grupo de enemigos 
	
	
	//parte compartida y no compartida
	public EnemigoFlyweight(Enemigo enemigoLigero, int x, int y,int direccion) {
		super(); //iniciar parte compartida
		//parte no compartida
		this.posX=x;
		this.posY=y;
		this.direccion=direccion;
		this.enemigoLigero=enemigoLigero;
	}

		
	//Metodos de la interfaz
	
	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
	
	public int getDireccion() {
		return direccion;
	}
	
	public String getRutaImage() { //get imagen 
		return enemigoLigero.getRutaImage();
	}

	public void setRutaImage(String rutaImage) { //set imagen 
		enemigoLigero.setRutaImage(rutaImage);
	}
	
	public String getRutaImagen2() {
		return enemigoLigero.getRutaImagen2();
	}


	public void setRutaImagen2(String rutaImagen2) {
		enemigoLigero.setRutaImagen2(rutaImagen2);
	}
	
	/**
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(double velocidad) {  //set velocidad de la nave
		enemigoLigero.setVelocidad(velocidad);
		
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
	
	public int getPuntosPorMuerte() {
		return enemigoLigero.getPuntosPorMuerte();
	}

	public void setPuntosPorMuerte(int puntosPorMuerte) {
		enemigoLigero.setPuntosPorMuerte(puntosPorMuerte);
	}

	public boolean edge (){ //final del tablero ??
		return (posX > 599 || posX < 0);
	}
	
	public double getVelocidad() { //get velocidad de la nave
		return enemigoLigero.getVelocidad();
	}
	

	public void mover(int dir) {
		posX += dir*getVelocidad();
		
	}
	
	public void moverAbajo (int dir) { //los monstruos van bajando cuando recorren el mapa
		posY += dir*10;
	
	}
	
	public int getVida() {  //get vida 
		return enemigoLigero.getAlto();
	}

	public void setVida(int vida) { //set vida 
		 enemigoLigero.setVida(vida);
	}
	
	public void golpe (int daño) {   //quitar una vida cuando la nave recibe un golpe
		enemigoLigero.golpe(daño);
	}
	

	public void setAncho(int ancho) {  //set ancho de la nave
		 enemigoLigero.setAlto(ancho);
	}

	public int getAncho() {  //get ancho de la nave
		return enemigoLigero.getAncho();
	}

	public int getAlto() {  //get alto de la nave
		return  enemigoLigero.getAlto();
	}

	public void setAlto(int alto) { //set alto de la nave
		 enemigoLigero.setAlto(alto);
	}

	public Disparo getDisparoUno() {  //get el disparo de la nave
		return disparoUno;
	}

	public void setDisparoUno(Disparo disparoUno) { //set el disparo de la nave
		this.disparoUno = disparoUno;
	}

	public boolean estaViva() { //preguntar si la nave tiene vidas
		 return enemigoLigero.estaViva();
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
