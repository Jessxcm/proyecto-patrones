package mundo;

import java.util.List;

public class AgreggateIterator implements IAggregate{

    public Iterator createIterator(List<String> list){
        return new DataIterator(list);
        
    }
    
    
    
    public class DataIterator implements Iterator {
    	private List<String> itemList;
        private int position;

        public DataIterator(List<String> itemList){
            this.itemList = itemList;
        }

        @Override
        public boolean hasNext() {
            if (position >= itemList.size()){
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            return itemList.get(position++);
        }
        
        public int posicion() {
            return position;
        }
   }

}  