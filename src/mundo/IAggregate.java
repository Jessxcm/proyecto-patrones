package mundo;

import java.util.List;

//interfaz de coleccion o aggregate para patron iterador


public interface IAggregate {

	public Iterator createIterator(List<String> list);
}
