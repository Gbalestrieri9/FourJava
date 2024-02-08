package exercicio3;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
public class Tarefa {
	Scanner input = new Scanner(System.in);
	ArrayList<String> listaDeTarefas = new ArrayList<>();
	
	String elemento;
	
	private void adicionarTarefa(String elemento) {
		if (listaDeTarefas.contains(elemento.toLowerCase())) {
	        System.out.println("Essa tarefa ja foi adicionada em sua lista anteriormente.");
	    } else {
	        listaDeTarefas.add(elemento);
	        System.out.println("Tarefa adicionada com sucesso.\n");
	    }
	}
	
	private void removerTarefa(String elemento) {
		listarTarefas();
        System.out.print("Digite o número da tarefa que deseja remover: ");
        int indice = input.nextInt();
        input.nextLine(); 
        
        if (indice >= 1 && indice <= listaDeTarefas.size()) {
        	System.out.print("Deseja realmente excluir esse item? Sim ou Nao ");
            String confirmacao = input.nextLine();
            if(confirmacao.equalsIgnoreCase("sim")) {
            	String tarefaRemovida = listaDeTarefas.remove(indice - 1);
                System.out.println("Tarefa \"" + tarefaRemovida + "\" removida com sucesso.");
            }
        } else {
            System.out.println("Índice inválido.");
        }
	}
	
	private void listarTarefas() {
		System.out.println("\n--- Lista de Tarefas ---");
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista.\n");
        } else {
            for (int i = 0; i < listaDeTarefas.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i)+ "\n");
            }
        }
	}
	
	private void listarTarefasOrdemAlfabetica() {
		System.out.println("\n--- Lista de Tarefas em ordem alfabetica ---");
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista.\n");
        } else {
            for (int i = 0; i < listaDeTarefas.size(); i++) {
            	Collections.sort(listaDeTarefas);
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i)+ "\n"); 
            }
        }
	}
	
	private void listarTarefasOrdemCronologica() {
		System.out.println("\n--- Lista de Tarefas ---");
        if (listaDeTarefas.isEmpty()) {
            System.out.println("Não há tarefas na lista.\n");
        } else {
            for (int i = listaDeTarefas.size()-1; i >= 0; i--) {
                System.out.println((i + 1) + ". " + listaDeTarefas.get(i)+ "\n");
            }
        }
	}
	
	public void alteracoesLista(int acaoSelecionada, String tarefa) {
		switch (acaoSelecionada) {
		case 1:
			adicionarTarefa(tarefa);
			break;
		case 2:
			removerTarefa(elemento);
			break;
		case 3:
			listarTarefas();
			break;
		case 4:
			listarTarefasOrdemAlfabetica();
			break;
		case 5:
			listarTarefasOrdemCronologica();
			break;
		}
	}
}
