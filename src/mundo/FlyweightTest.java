package mundo;



public class FlyweightTest {
	
	public static void main(String[] args) throws Exception {

		IEnemigoFactory enemyFactory = new EnemigoFactory();
		
		EnemigoFlyweight calamar = enemyFactory.GetEnemy("Calamar",0,345,215,3,0,0,0,"./data/imagenes/Naves/s0.png","./data/imagenes/Naves/s1.png");
		calamar.getPosX();
		System.out.println ("posX calamar 1: "+ calamar.getPosX());
		System.out.println ("posY calamar 1: "+ calamar.getPosY());
		
		EnemigoFlyweight calamar2 = enemyFactory.GetEnemy("Calamar",0,120,234,3,0,0,0,"./data/imagenes/Naves/s0.png","./data/imagenes/Naves/s1.png");

		System.out.println ("posX calamar 2: "+ calamar2.getPosX());
		System.out.println ("posY calamar 2: "+calamar2.getPosY());
	}
	

}
