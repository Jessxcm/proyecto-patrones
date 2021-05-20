package mundo;


public class DisparoPoolEnemigo extends ObjectPool<Disparo> {
	
	private static DisparoPoolEnemigo disparoPool;
	
	
	private DisparoPoolEnemigo(int max) {
		System.out.println ("singleton disparo enemigo");
		this.setMaxPool(max);
	}
	
	
	//singleton del object pool de disparos
    public static DisparoPoolEnemigo getInstance(int max) { 
    	if (disparoPool==null){
    		disparoPool = new DisparoPoolEnemigo(max);	
        }
    	
        return disparoPool;
    }
    
    @Override
	  public void setMaxPool(int max) {
		  this.maxPool=max;
	  }
    

}