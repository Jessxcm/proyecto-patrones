package mundo;


public abstract class IEnemyFactory {

	abstract public  IEnemigo GetEnemyType(String Enemigo, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta );
}
