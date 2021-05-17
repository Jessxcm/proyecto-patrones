package mundo;

public class DisparoPoolJugador extends ObjectPool<Disparo> {
	
	private static DisparoPoolJugador disparoPool;
	
	
	private DisparoPoolJugador(int max) {
		System.out.println ("se creo nuevo singleton");
		this.setMaxPool(max);
	}
	
	
	//singleton del object pool de disparos
    public static DisparoPoolJugador getInstance(int max) { 
    	if (disparoPool==null){
    		disparoPool = new DisparoPoolJugador(max);	
        }
    	
        return disparoPool;
    }
    
    @Override
	  public void setMaxPool(int max) {
		  this.maxPool=max;
	  }
    

}