package mundo;

import java.io.Serializable;

public interface Enemigo extends Serializable{
	
	
	public final static int IZQUIERDA = 0;

	public final static int DERECHA = 1;



	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------
	
	public int getPosX();

	public void setPosX(int posX);

	public int getPosY();

	public void setPosY(int posY);

	public void setDireccion(int direccion);
	
	public int getDireccion();
	
	public String getRutaImage();

	public void setRutaImage(String rutaImage);
	
	public String getRutaImagen2();

	public void setRutaImagen2(String rutaImagen2);
	
	public int getPuntosPorMuerte();

	public void setPuntosPorMuerte(int puntosPorMuerte);

	public boolean edge ();
	
	public double getVelocidad();
	
	public void mover(int dir);
	
	public void moverAbajo (int dir);
	
	public int getVida();

	public void setVida(int vida);
	
	public void golpe (int daño);
	

	public void setAncho(int ancho);
	public int getAncho();

	public int getAlto();

	public void setAlto(int alto);
	public Disparo getDisparoUno();

	public void setDisparoUno(Disparo disparoUno);

	public boolean estaViva();

	public void eliminarDisparo();
	

	public void disparar (int posX, int posY);
	
	public void speak();

}
