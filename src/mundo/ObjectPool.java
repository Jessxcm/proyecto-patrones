package mundo;

import java.util.ArrayList;



public abstract class ObjectPool<T> {

	  
	  ArrayList<Disparo> available = new ArrayList<>();
	  ArrayList<Disparo> inUse = new ArrayList<>();
	  
	  int counter; //instancias activas
	  int maxPool; //cantidad maxima del pool
	   
	    
	  //sacar del pool
	  public  Disparo givetItem(int x,int y) {
		  if (available.isEmpty()) {
		      available.add(new Disparo(x,y));
		    }
		  Disparo instance = available.iterator().next();
		  available.remove(instance);
		  inUse.add(instance);
		  
		  return instance;
	  }
	  
	  
	  //devolver al pool
	  public void returnItem(Disparo instance) {
		  
		  if(available.size()<maxPool) {
			  inUse.remove(instance);
			  available.add(instance);
		  }
	  }
	  
	  
	  public void setMaxPool(int max) {
		  this.maxPool=max;
	  }
	  
	  public String getStatePool() {
		  return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
	  }
	  
	  

	}


