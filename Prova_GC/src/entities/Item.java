package entities;

public class Item {

	private String name;
	private Integer quantidade;
	
	public Item(String nome) {
		this.name = nome;
		this.quantidade = 1;
	}

	public Item(String nome, Integer quantidade) {
		this.name = nome;
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}		

}


