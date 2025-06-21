package application;

import entities.Livro;

public class PrincipalLivro {

	public static void main(String[] args) {
		
		Livro l = new Livro();
		
		l.setTitulo("Java para iniciantes");
		
		System.out.println(l.status());
		
		l.emprestar();
		
		System.out.println(l.status());
		
		//Resposta: Disponivel/Indisponível

				

	}

}
