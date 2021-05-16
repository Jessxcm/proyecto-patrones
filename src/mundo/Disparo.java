package mundo;

import java.io.Serializable;

public class Disparo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean impacto; //saber si la bala impacto

	private int posX; //posicion x de la bala

	private int posY; //posicion y de la bala

	public Disparo(int posX, int posY) { //constructor
		// TODO Auto-generated constructor stub

		this.posX = posX;
		this.posY = posY;
		impacto = false;

	}

	public boolean getImpacto() { //get si impacto
		return this.impacto;
	}
 
	public void setImpacto(boolean impacto) { //set impacto
		this.impacto = impacto;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void shoot() { //shot que cosa?
		this.posY = this.posY - 1;
	}

	public void shoot1() { //shot que cosa?
		this.posY = this.posY + 5;
	}

	public boolean hitsEnemigo(Enemigo a) { //saber si el disparo choco un enemigo
		boolean salida = false; 
		int r = 8; // ?
		if (a != null) {
			double cateto = this.posX - a.getPosX(); //posicion x del disparo - posicion x del enemigo
			double cateto2 = this.posY - a.getPosY(); // posicion y del disparo - posicion y del enemigo
			double d = Math.sqrt((cateto * cateto) + (cateto2 * cateto2));  // raiz cuadrada de (( x0-x1) + (y0-y1 )) formula distancia

			if (d < (r + a.getAncho())) { //si la distancia es menor que r + ancho del enemigo
				salida = true; //choco
			}
		}
		return salida;
	}

	public boolean hitsJugador(NaveJugador a) { //saber si el disparo choco un jugador

		boolean salida = false;

		if (a != null) { //jugador no es nulo

			double cateto = posX - a.getPosInicialX();
			double cateto2 = posY - a.getPosIncialY();
			double d = Math.sqrt((cateto * cateto) + (cateto2 * cateto2)); //formula distancia entre dos puntos

			if (d < a.getAncho() + 8 && posY == a.getPosIncialY() //distancia es menor que r + ancho del jugador y la posicion en y de la bala es la misma posicion y del jugador
					&& (posX < a.getPosInicialX() + 35 && posX > a.getPosInicialX() - 10)) { // y posicion x de la bala es menor que la posicion x del jugador +35 y la posicion x de la bala es mayor que la posicion en x del jugador -10
				salida = true; //choco
			}
		}

		return salida;
	}

}
