package entities;

public class Livro {

	private String titulo;
	private boolean emprestado;
	
		
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}

	public void emprestar() {
		this.emprestado = true;
	}
	
	public String status() {
		if(emprestado) {
			return "Indisponível";
		}
		return "Disponivel";
	}
	
}
