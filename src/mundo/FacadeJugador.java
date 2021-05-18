package mundo;

import excepciones.PartidaYaExisteException;

public class FacadeJugador {
	
	
	
	
	public void agregarPartida(Partida partidaRaiz,Partida agregar) throws PartidaYaExisteException {

		if (partidaRaiz == null) {
			partidaRaiz = agregar;
		} else {
			partidaRaiz.agregarPartida(agregar);
		}

	}
	
	
	public Partida crearPartida(Partida partidaRaiz,String nombre) throws PartidaYaExisteException {

		Partida b = new Partida(nombre);
		this.agregarPartida(partidaRaiz,b);

		return b;

	}

}
