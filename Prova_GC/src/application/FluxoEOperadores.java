package application;

public class FluxoEOperadores {
	public static void main(String[] args) {
		
		int prioridade = 4;
		int urgência = 8;
		
		if(prioridade > 3 && urgência > 7) {
			System.out.println("Tarefa Crítica");
		}else if(prioridade > 3 || urgência > 7){
			System.out.println("Tarefa importante");
		}else {
			System.out.println("Tarefa Comum");
		}
	}

}
