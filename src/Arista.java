
public class Arista implements Comparable<Arista> {

	private int nodoOrigen;
	private int nodoDestino;
	private int valor;

	public Arista(int nodoOrigen, int nodoDestino, int valor) {
		super();
		this.nodoOrigen = nodoOrigen;
		this.nodoDestino = nodoDestino;
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

	public int getNodoOrigen() {
		return this.nodoOrigen;
	}

	public int getNodoDestino() {
		return this.nodoDestino;
	}

	@Override
	public int compareTo(Arista o) {
		return this.valor - o.valor;
	}

}
