package mundo;


public class DisparoPool extends ObjectPool<Disparo> {
	
	private static DisparoPool disparoPool;
	
	//singleton del object pool de disparos
    public static DisparoPool getInstance() { 
    	if (disparoPool==null){
    		disparoPool = new DisparoPool();
        }
        return disparoPool;
    }

}