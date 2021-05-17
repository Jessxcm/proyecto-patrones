package mundo;

import java.util.ArrayList;
import java.io.Serializable;


public abstract class ObjectPool<T> implements Serializable {

	  
	  ArrayList<Disparo> available = new ArrayList<>();
	  ArrayList<Disparo> inUse = new ArrayList<>();
	  
	  int counter=0; //instancias activas
	  int maxPool; //cantidad maxima del pool
	   
	    
	  //sacar del pool
	  public  Disparo givetItem(int x,int y) {
		  if (available.isEmpty() ) {
		      available.add(new Disparo(x,y));
		    }
		  Disparo instance = available.iterator().next();
		  //limpiar la instancia
		  instance.setPosX(x);
		  instance.setPosY(y);
		  instance.setImpacto(false);

		  available.remove(instance);
		  inUse.add(instance);
		  
		  System.out.println (this.getStatePool());
		  return instance;
	  }
	  
	  
	  
	  
	  
	  //devolver al pool
	  public void returnItem(Disparo instance) {
		  
		  if(available.size()<50) {
			  inUse.remove(instance);
			  available.add(instance);
		  }

		  System.out.println (this.getStatePool());
	  }
	  
	  
	  public void setMaxPool(int max) {
		  this.maxPool=max;
	  }
	  
	  public String getStatePool() {
		  return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
	  }
	  
	  

	}


