
public class MatrizAdyacencia {

	private int cantNodos;
	private int[][] matriz;

	public MatrizAdyacencia(int cantNodos) {
		this.cantNodos = cantNodos;
		this.matriz = new int[cantNodos][cantNodos];

		for (int i = 0; i < this.cantNodos; i++) {
			for (int j = 0; j < this.cantNodos; j++) {
				this.matriz[i][j] = Integer.MAX_VALUE;
			}
		}
	}

	public void setValor(int fila, int columna, int valor) {
		if (fila == columna)
			this.matriz[fila][columna] = Integer.MAX_VALUE;

		this.matriz[fila][columna] = valor;

	}

	public int getValor(int fila, int columna) {
		return this.matriz[fila][columna];
	}

}
