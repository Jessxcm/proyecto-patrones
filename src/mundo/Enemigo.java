package mundo;

import java.io.Serializable;

public interface Enemigo extends Serializable{
	
	
	public final static int IZQUIERDA = 0;

	public final static int DERECHA = 1;



	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------
	
	public String getRutaImage();
	public void setRutaImage(String rutaImage);
	public String getRutaImagen2();
	public void setRutaImagen2(String rutaImagen2);
	public double getVelocidad();
	public void setVelocidad(double velocidad);
	public int getPuntosPorMuerte();
	public void setPuntosPorMuerte(int puntosPorMuerte);
	public int getVida();
	public void setVida(int vida);

	public void golpe (int daño);
	public void setAncho(int ancho);
	public int getAncho();
	public int getAlto();

	public void setAlto(int alto);

	public boolean estaViva();

}
