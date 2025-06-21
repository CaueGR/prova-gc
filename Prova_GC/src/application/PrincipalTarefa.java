package application;

import java.util.ArrayList;
import java.util.Collections;

import entities.Tarefa;

public class PrincipalTarefa {

	public static void main(String[] args) {
		ArrayList<Tarefa> tarefas = new ArrayList<>();
		tarefas.add(new Tarefa("Estudar"));
		tarefas.add(new Tarefa("Almoçar"));
		tarefas.add(new Tarefa("Dormir"));
		
		Collections.sort(tarefas);
		
		System.out.println(tarefas);
		
		//[Almoçar, Dormir, Estudar]

	}

}
