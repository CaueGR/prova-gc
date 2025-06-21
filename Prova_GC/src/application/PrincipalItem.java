package application;

import entities.Item;

public class PrincipalItem {

	public static void main(String[] args) {
		Item x = new Item("Caderno");
		Item y = new Item("Caneta", 3);
		
		System.out.println(x.getQuantidade() + y.getQuantidade());

		//Resposta: 4
	}

}
