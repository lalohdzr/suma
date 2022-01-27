package suma;

public class Suma {
	private int aUno, bDos, Resultado;
	public Suma(int numeroUno, int numeroDos) {
		this.aUno = numeroUno;
		this.bDos = numeroDos;
		
		
	}

	public void Operacion() {
		Resultado = aUno + bDos;
		System.out.println("La suma es " + Resultado);
	}
	
}
