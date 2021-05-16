package mundo;

import java.util.HashMap;


public class EnemyFlyweightFactory2 {
	private static HashMap <String, EnemyFlyweight> tipo_enemigos = new HashMap<String, EnemyFlyweight>();
	
	
	public EnemyFlyweight GetEnemy(String type, double velocidad, int posX, int posY, int vida, int ancho, int alto, int direccion, String rutaImage, String ruta) {
		
		EnemyFlyweight e =null;
		
		if(tipo_enemigos.containsKey(type)) {
			e = tipo_enemigos.get(type);
		}
		else {
			switch(type) {
			case "Calamar" :
				//System.out.println("calamar creado");
				Enemigo calamar = new InvasorCalamar(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				e= new EnemyFlyweight(calamar,"calamar");
				break;
			case "Pulpo" :	
				//System.out.println("pulpo creado");
				Enemigo pulpo = new InvasorPulpo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				e= new EnemyFlyweight(pulpo,"pulpo");
				break;
			case "Cangrejo":
				//System.out.println("pulpo creado");
				Enemigo cangrejo = new InvasorCangrejo(velocidad,posX, posY,vida,ancho,alto,direccion, rutaImage, ruta);
				e= new EnemyFlyweight(cangrejo,"cangrejo");
				break;
			}
			tipo_enemigos.put(type, e);
		}
		
		return e;
	}
}
	
	

		
