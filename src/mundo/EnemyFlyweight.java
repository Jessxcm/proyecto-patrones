package mundo;


//contiene toda la información del enemigo


//flyweight implementa enemigo
public class EnemyFlyweight implements Flyweight {
	
	private String tipo;
	
	
	
	private Enemigo enemigoLigero; //enemigo (calamar, cangrejo, pulpo) que tiene lo compartido entre grupo de enemigos 
	
	
	
	public EnemyFlyweight(Enemigo enemigoLigero, String tipo) {
		super();
		this.tipo= tipo;
	}

	
	public int getPosX() {  //get posicion en x de la nave
		return enemigoLigero.getAlto();
	}

	/**
	 * 
	 * @param posX
	 */
	public void setPosX(int posX) {  //set posicion en x de la nave
		enemigoLigero.setPosX(posX);
	}

}
