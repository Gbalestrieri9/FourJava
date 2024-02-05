package exercicio3;
import java.util.ArrayList;
import java.util.List;
public class Tarefa {
	
	ArrayList<String> listaDeTarefas = new ArrayList<>();
	
	String elemento;
	
	private void adicionarTarefa(String elemento) {
		listaDeTarefas.add(elemento);
	}
	
	private void removerTarefa(String elemento) {
		listaDeTarefas.remove(elemento);
	}
	
	private void listarTarefas() {
		for (String elemento:listaDeTarefas) {
			System.out.println(elemento);
		}
	}
	
	public String alteracoesLista(String elemento, String exemplo) {
		switch (exemplo) {
		case "1":
			adicionarTarefa(elemento);
			break;
		case "2":
			removerTarefa(elemento);
			break;
//		case "3":
//			listarTarefas(elemento);
//			break;
		}
		return elemento;
	}
}
