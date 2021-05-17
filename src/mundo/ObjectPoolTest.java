package mundo;


public class ObjectPoolTest {

	public static void main(String[] args) {
	    
		    DisparoPoolEnemigo pool = DisparoPoolEnemigo.getInstance(3);


	
			Disparo disparo1 = pool.givetItem(120,3);
			Disparo disparo2 = pool.givetItem(30,6); 
			Disparo disparo3 = pool.givetItem(0,0);
			pool.returnItem(disparo1);
			Disparo disparo4 = pool.givetItem(4,4);
			Disparo disparo5 = pool.givetItem(5,5);
			pool.returnItem(disparo2);
			pool.returnItem(disparo3);
			pool.returnItem(disparo4);
			
			
			
			
	}

}
