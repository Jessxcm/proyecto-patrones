package mundo;



public class FactoryTest {
	public static void main(String[] args) throws Exception {

        System.out.println("***Factoria enemigos Demo***\n");

        IEnemyFactory enemyFactory = new EnemyFactory();

        Enemigo calamar = enemyFactory.GetEnemy("Calamar",0,0,0,3,0,0,0,"./data/imagenes/Naves/s0.png","./data/imagenes/Naves/s1.png");

        calamar.speak(); 

        Enemigo pulpo = enemyFactory.GetEnemy("pulpo",0,0,0,3,0,0,0, "./data/imagenes/Naves/r0.png", "./data/imagenes/Naves/r1.png");

        pulpo.speak();

        // There is no Lion type. So, an exception will be thrown

        Enemigo cangrejo = enemyFactory.GetEnemy("Cangrejo",0,0,0,3,0,0,0, "./data/imagenes/Naves/p0.png", "./data/imagenes/Naves/p1.png");

        cangrejo.speak();

   }
}
