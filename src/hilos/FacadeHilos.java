package hilos;

import interfaz.InterfazSpaceInvaders;
import mundo.NaveJugador;
import mundo.SpaceInvaders;



//esta facade se encarga de manejar todos los hilos del sistema.


public class FacadeHilos {
	
	
	private HiloEnemigos hilitoEnemigo;

	private HiloDisparoJugador hilitoDisparo;

	private HiloDisparoEnemigos hilitoEnemigoDisparo;

	private HiloAuxiliarCreaDisparo hilitoAuxiliar;

	private HiloAnimacionEnemigos hilitoAnimacion;
	
	
	
	public void startHiloEnemigo(SpaceInvaders mundo, InterfazSpaceInvaders interfaz) {
		for (int i = 0; i < mundo.getPartidaActual().getEnemigos().length; i++) {
			for (int j = 0; j < mundo.getPartidaActual().getEnemigos()[0].length; j++) {
				if (mundo.getPartidaActual().getEnemigos()[i][j] != null) {
					hilitoEnemigo = new HiloEnemigos(mundo.getPartidaActual().getEnemigos()[i][j], interfaz);
					hilitoEnemigo.start();
				}
			}
		}
	}
	
	
	public void startHiloAuxiliar(SpaceInvaders mundo,InterfazSpaceInvaders interfaz) {
		hilitoAuxiliar = new HiloAuxiliarCreaDisparo(mundo.getPartidaActual(), interfaz);
		hilitoAuxiliar.start();
	}
	
	
	public void startHiloAnimacion(SpaceInvaders mundo,InterfazSpaceInvaders interfaz) {
		for (int i = 0; i < mundo.getPartidaActual().getEnemigos().length; i++) {
			for (int j = 0; j < mundo.getPartidaActual().getEnemigos()[0].length; j++) {
				if (mundo.getPartidaActual().getEnemigos()[i][j] != null) {
					hilitoAnimacion = new HiloAnimacionEnemigos(mundo.getPartidaActual().getEnemigos()[i][j], interfaz);
					hilitoAnimacion.start();
				}
			}
		}
	}
	

	public void startHiloDisparoEnemigo(SpaceInvaders mundo, InterfazSpaceInvaders interfaz) {
		hilitoEnemigoDisparo = new HiloDisparoEnemigos(mundo.getPartidaActual(), interfaz, mundo);
		hilitoEnemigoDisparo.start();
	}

	/**
	 * 
	 */
	public void startHiloJugador(SpaceInvaders mundo,InterfazSpaceInvaders interfaz) {
		hilitoDisparo = new HiloDisparoJugador((NaveJugador) mundo.getJugadorActual(), interfaz,
				mundo.getPartidaActual().getEnemigos(), mundo.getPartidaActual());
		hilitoDisparo.start();
	}

	
	public void iniciarTodosLosHilos(SpaceInvaders mundo,InterfazSpaceInvaders interfaz) {
		mundo.setEnFuncionamiento(true);
		startHiloJugador(mundo,interfaz);
		startHiloEnemigo(mundo,interfaz);
		startHiloAnimacion(mundo,interfaz);
		startHiloAuxiliar(mundo,interfaz);
		startHiloDisparoEnemigo(mundo,interfaz);
	}

	/**
	 * 
	 */
	public void matarHilos (){
		hilitoAnimacion = null;
		hilitoAuxiliar = null;
		hilitoDisparo = null;
		hilitoEnemigoDisparo = null;
		hilitoEnemigo = null;
	}
	
	

}
