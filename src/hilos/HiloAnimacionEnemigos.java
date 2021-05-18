package hilos;

import interfaz.InterfazSpaceInvaders;
import mundo.Enemigo;
import mundo.EnemigoFlyweight;
import mundo.InvasorCalamar;
import mundo.InvasorCangrejo;

public class HiloAnimacionEnemigos extends Thread {

	EnemigoFlyweight enemigo;
	InterfazSpaceInvaders interfaz;
	
	public HiloAnimacionEnemigos(EnemigoFlyweight invasores, InterfazSpaceInvaders principal) {
		// TODO Auto-generated constructor stub
		
		enemigo = invasores;
		interfaz = principal;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (interfaz.estaEnFuncionamiento()) {

			//enemigo.getTipo()

			if (enemigo.getTipo() instanceof InvasorCalamar) {
				enemigo.setRutaImage("./data/imagenes/Naves/s0.png");
			} else if (enemigo.getTipo() instanceof InvasorCangrejo) {
				enemigo.setRutaImage("./data/imagenes/Naves/p0.png");
			} else {
				enemigo.setRutaImage("./data/imagenes/Naves/r0.png");
			}
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			enemigo.setRutaImage(enemigo.getRutaImagen2());

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	
}
