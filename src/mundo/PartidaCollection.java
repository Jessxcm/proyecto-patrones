package mundo;

import java.util.ArrayList;

//coleccion partida 
public class PartidaCollection implements Collection{
	
	
	Partida nodoDerecho;
	Partida nodoIzquierdo;
	Partida nodoActual;

	//implementacion de crear iterador
	public Iterator createIterator() {
		return new PartidaIterator(); //se crea un iterador de partidas
	}
	
	
	
	//se crea el iterador que implementa la interfaz iterador
	public class PartidaIterator implements Iterator {
		
		public boolean hasNext() {
			if(nodoActual!=null) {
				System.out.println ("siguienter");
			}
			return true;
		}
		
		//retorna el siguiente elemento
		 public Object next() {
			 if(this.hasNext()) {
				 System.out.println ("tiene siguiente");
				 
			 }
			 return new Partida("hola");

		 }
		 
		 


	}
	
	

}
