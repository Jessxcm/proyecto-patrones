package mundo;

import java.util.HashMap;

public class EnemigoFlyweightFactory {
	
	private static HashMap <String, Enemigo> tipo_enemigos =
            new HashMap<String, Enemigo>();
	
	public Enemigo GetEnemy(String type, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		Enemigo e =null;
		
		if(tipo_enemigos.containsKey(type)) {
			e = tipo_enemigos.get(type);
		}
		else {
			switch(type) {
			case "Calamar" :
				System.out.println("calamar creado");
				e= new InvasorCalamar(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				break;
			case "Pulpo" :	
				System.out.println("pulpo creado");
				e= new InvasorPulpo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				break;
			case "Cangrejo":
				System.out.println("pulpo creado");
				e= new InvasorCangrejo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				break;
			}
			tipo_enemigos.put(type, e);
		}
		
		return e;
	}

}
