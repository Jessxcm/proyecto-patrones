package mundo;



public class EnemyFactory extends IEnemyFactory{
	
	public IEnemigo GetEnemy(String Enemigo, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta ) {

		if(Enemigo.equalsIgnoreCase("Calamar")){
			return new Calamar(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
		} else if(Enemigo.equalsIgnoreCase("pulpo")) {
			return new Pulpo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
		} 
		else {
			return new Cangrejo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
		}
	}

}
