package mundo;


public class ObjectPoolTest {

	public static void main(String[] args) {
	    
		    DisparoPool pool = DisparoPool.getInstance();
			pool.setMaxPool(2); //pool de 3 disparos
			
			Disparo disparo1 = pool.givetItem(120,3);
			Disparo disparo2 = pool.givetItem(12,6);
			System.out.println (disparo2.getPosX());
			Disparo disparo3 = pool.givetItem(0,0);
			Disparo disparo4 = pool.givetItem(20,34);
			Disparo disparo5 = pool.givetItem(11,2);
			
			System.out.println (pool.getStatePool());
			
			pool.returnItem(disparo1);
			
			System.out.println (pool.getStatePool());
			
			pool.returnItem(disparo2);
			pool.returnItem(disparo3);
			pool.returnItem(disparo4);
			pool.returnItem(disparo5);
			
			System.out.println (pool.getStatePool());
			
			Disparo disparo6 = pool.givetItem(123,45);
			System.out.println (disparo6.getPosX());
			System.out.println (pool.getStatePool());
			
			
			
			DisparoPool pool2 = DisparoPool.getInstance();
			
	}

}
