package mundo;



public class NullObjectTest {
	 public static void main(String[] args) {
    DisparoAbstracto customer1 = DisparoFactory.getDisparo("Rob");
    DisparoAbstracto customer2 = DisparoFactory.getDisparo("Bob");
    DisparoAbstracto customer3 = DisparoFactory.getDisparo("Julie");
    DisparoAbstracto customer4 = DisparoFactory.getDisparo("Laura");

    System.out.println("Customers");
    System.out.println(customer1.getPosX());
    System.out.println(customer2.getPosX());
    System.out.println(customer3.getPosX());
    System.out.println(customer4.getPosX());
	 }
}
