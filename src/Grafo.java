import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Grafo {

	private MatrizAdyacencia matriz;
	private PriorityQueue<Arista> colaPrioridad = new PriorityQueue<Arista>();
	private int cantidadNodos;

	public Grafo(int cantidadNodos) {
		super();
		this.matriz = new MatrizAdyacencia(cantidadNodos);
		this.cantidadNodos = cantidadNodos;
	}

	public void set(int fila, int columna, int peso) {
		this.matriz.setValor(fila, columna, peso);
	}

	public void dijkstra(int nodoInicial) {
		int[] costosNodoInicialAN = new int[this.cantidadNodos];
		List<Integer> listaDeAdyacentes = new LinkedList<Integer>();

		int nodoW, costoDirecto, costoConNodoIntermedio;

		// Cargo la cola de prioridad e inicio los costos con los costo que ya tiene
		// desde el nodoInicial
		for (int i = 0; i < this.cantidadNodos; i++) {
			this.colaPrioridad.add(new Arista(nodoInicial, i, this.matriz.getValor(nodoInicial, i)));
			costosNodoInicialAN[i] = this.matriz.getValor(nodoInicial, i);
		}

		while (!this.colaPrioridad.isEmpty()) {
			
		}
	}
}
