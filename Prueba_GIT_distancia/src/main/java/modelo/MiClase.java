package modelo;

import Interfaces.Miinterfaz;

public class MiClase implements Miinterfaz{

	@Override
	public int metododevuelveentero() {
		// TODO Auto-generated method stub
		
		
		int mientero = 5;
		int otroentero = mientero-3;
		int resultado = otroentero;
		 
	    return resultado;
	}

}
