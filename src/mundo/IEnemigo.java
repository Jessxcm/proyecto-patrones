package mundo;

public interface IEnemigo {
	
	
	public final static int IZQUIERDA = 0;

	public final static int DERECHA = 1;



	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

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
	
	
	public void speak();

}
