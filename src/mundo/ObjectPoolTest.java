package mundo;


public class ObjectPoolTest {

	public static void main(String[] args) {
	    
		    DisparoPool pool = DisparoPool.getInstance(3);
			
			Disparo disparo1 = pool.givetItem(120,3);
			System.out.println ("posxDisparo 1: " + disparo1.getPosX()); 
			Disparo disparo2 = pool.givetItem(30,6);
			System.out.println ("posxDisparo 2: " + disparo2.getPosX()); 
			Disparo disparo3 = pool.givetItem(0,0);
			System.out.println ("posxDisparo 3: " + disparo3.getPosX()); 
			
			pool.returnItem(disparo1);
			Disparo disparo4 = pool.givetItem(4,4);
			System.out.println ("posxDisparo 4: " + disparo4.getPosX()); 
			System.out.println ("posyDisparo 4: " + disparo4.getPosY());
			
			Disparo disparo5 = pool.givetItem(5,5);
			
			
			
			
	}

}
