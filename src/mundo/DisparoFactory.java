package mundo;


public class DisparoFactory{
	
	   public static final String[] names = {"Rob", "Joe", "Julie"};

	   public static DisparoAbstracto getDisparo(String name){
	   
	      for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){
	            return new DisparoReal(1,1);
	         }
	      }
	      return new DisparoNull(1,1);
	   }
	}
