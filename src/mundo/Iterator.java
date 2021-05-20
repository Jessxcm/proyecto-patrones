package mundo;



//interfaz para iteradores
public interface Iterator {
	
	
	//indica si hay elementos siguientes o no para iterar
	public boolean hasNext();
	
	//retorna el siguiente elemento
	 public Object next();

	 public int posicion();
}
