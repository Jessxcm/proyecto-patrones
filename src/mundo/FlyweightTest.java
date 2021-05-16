package mundo;



public class FlyweightTest {
	
	public static void main(String[] args) throws Exception {
		EnemyFlyweightFactory2 enemyfactory = new EnemyFlyweightFactory2();
		EnemyFlyweight calamar= enemyfactory.GetEnemy("Calamar",0,0,0,3,0,0,0,"./data/imagenes/Naves/s0.png","./data/imagenes/Naves/s1.png");
		
		EnemyFlyweight pulpo= enemyfactory.GetEnemy("Pulpo",0,0,0,3,0,0,0, "./data/imagenes/Naves/r0.png", "./data/imagenes/Naves/r1.png");
		
		EnemyFlyweight cangrejo= enemyfactory.GetEnemy("Cangrejo",0,0,0,3,0,0,0, "./data/imagenes/Naves/p0.png", "./data/imagenes/Naves/p1.png");
		
	}
	

}
