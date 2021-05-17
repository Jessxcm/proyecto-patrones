package mundo;


public class DisparoPool extends ObjectPool<Disparo> {
	
	private static DisparoPool disparoPool;
	
	
	private DisparoPool(int max) {
		System.out.println ("se creo nuevo singleton");
		//this.maxPool=max;
	}
	
	
	//singleton del object pool de disparos
    public static DisparoPool getInstance(int max) { 
    	if (disparoPool==null){
    		disparoPool = new DisparoPool(max);	
        }
    	
        return disparoPool;
    }
    
    

}