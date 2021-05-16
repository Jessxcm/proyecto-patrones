package mundo;


//clase abstracta de la factoria de flyweights

public abstract class IEnemigoFactory {
	abstract public  EnemigoFlyweight GetEnemy(String Enemigo, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta );
}
