package mundo;

public class DisparoNull extends DisparoAbstracto{

	
	private static final long serialVersionUID = 1L;

	private boolean impacto;

	private int posX;

	private int posY;
	
	
	public DisparoNull(int posX, int posY) {
		

	}

	public boolean getImpacto() {
		return false;
	}

	public void setImpacto(boolean impacto) {
	}

	public int getPosX() {
		return 0;
	}

	public void setPosX(int posX) {
	}

	public int getPosY() {
		return 0;
	}

	public void setPosY(int posY) {
	}

	public void shoot() {
	}

	public void shoot1() {
	}

	public boolean hitsEnemigo(EnemigoFlyweight a) {
		return false;
	}

	public boolean hitsJugador(NaveJugador a) {

		return false;
	}
	
	   @Override
	   public boolean isNil() {
	      return true;
	   }
}
