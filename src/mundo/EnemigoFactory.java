package mundo;

import java.util.HashMap;

//Factoria de flyweights
//se crea un enemigo con un estado extrinseco y un estado intrinseco

public class EnemigoFactory extends IEnemigoFactory {
	private static HashMap <String, Enemigo> tipo_enemigos = new HashMap<String, Enemigo>();
	
	
	public EnemigoFlyweight GetEnemy(String type, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		
		EnemigoFlyweight e = null; //enemigo completo
		Enemigo t = null; //tipo de enemigo
		
		if(tipo_enemigos.containsKey(type)) {
			t = tipo_enemigos.get(type);
			e = new EnemigoFlyweight(t,posX,posY,direccion);
		}
		else {
			switch(type) {
			case "Calamar" :
				t = new InvasorCalamar(velocidad,vida,ancho,alto, rutaImage, ruta);
				break;
			case "Pulpo" :	
				t = new InvasorPulpo(velocidad,vida,ancho,alto, rutaImage, ruta);
				break;
			case "Cangrejo":
				t = new InvasorCangrejo(velocidad,vida,ancho,alto, rutaImage, ruta);
				break;
			}
			
			tipo_enemigos.put(type, t);
			e = new EnemigoFlyweight(t,posX,posY,direccion);
			
		}
		
		return e;
	}
}
	
	

		
