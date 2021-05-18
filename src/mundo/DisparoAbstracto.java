package mundo;

import java.io.Serializable;

public abstract class DisparoAbstracto implements Serializable {
	


	public abstract void setImpacto(boolean impacto);

	public abstract int getPosX();

	public abstract void setPosX(int posX);

	public abstract int getPosY();

	public abstract void setPosY(int posY);

	public abstract void shoot();

	public abstract void shoot1();

	public abstract boolean hitsEnemigo(EnemigoFlyweight a);

	public abstract boolean hitsJugador(NaveJugador a);
	
	public abstract boolean isNil();
	
}
