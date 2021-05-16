package mundo;

public interface Flyweight {
	
	public final static int IZQUIERDA = 0;

	public final static int DERECHA = 1;



	// -----------------------------------------------------------------
	// -----------------------------Métodos-----------------------------
	// -----------------------------------------------------------------

	
	public void setDireccion(int direccion);
	public int getDireccion();
	public int getPosX();
	public void setPosX(int posX);
	public int getPosY();
	public void setPosY(int posY);
	public Disparo getDisparoUno();
	public void setDisparoUno(Disparo disparoUno);
	public void eliminarDisparo();
	public void disparar (int posX, int posY);

	
}
