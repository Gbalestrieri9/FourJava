package exercicio3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Tarefa {
	Scanner input = new Scanner(System.in);
	static ArrayList<String> listaDeTarefas = new ArrayList<>();
	private static final String TAREFAS = "tarefas.txt";
	
	private static void carregarTarefas() {
        try (BufferedReader br = new BufferedReader(new FileReader(TAREFAS))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                listaDeTarefas.add(linha);
            }
            System.out.println("Tarefas carregadas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao carregar tarefas: " + e.getMessage());
        }
    }
	
	private static void salvarTarefas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(TAREFAS))) {
            for (String tarefa : listaDeTarefas) {
                bw.write(tarefa);
                bw.newLine();
            }
            System.out.println("Tarefas salvas com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar tarefas: " + e.getMessage());
        }
    }
	
	private void adicionarTarefa(String elemento) {
		if (listaDeTarefas.contains(elemento.toLowerCase())) {
	        System.out.println("Essa tarefa ja foi adicionada em sua lista anteriormente.");
	    } else {
	        listaDeTarefas.add(elemento);
	        System.out.println("Tarefa adicionada com sucesso.\n");
	    }
	}
	
	private void removerTarefa() {
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
		carregarTarefas();
		switch (acaoSelecionada) {
		case 1:
			adicionarTarefa(tarefa);
			break;
		case 2:
			removerTarefa();
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
		case 6:
			salvarTarefas();
			break;
		}
	}
}
