package entities;

public class Tarefa implements Comparable<Tarefa>{

	private String titulo;

	public Tarefa(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public int compareTo(Tarefa outra) {
		return this.titulo.compareTo(outra.titulo);
	}

	@Override
	public String toString() {
		return "Tarefa [titulo=" + titulo + "]";
	}
	
}
