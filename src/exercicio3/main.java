package exercicio3;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		System.out.println("1. Adicionar tarefa\n"
				+ "2. Remover tarefa\n"
				+ "3. Listar tarefas\n"
				+ "4. Listar tarefas em ordem alfabetica\n"
				+ "5. Listar tarefas em cronologicas ");
		
		String exemplo = input.nextLine();
		
		String exemplo2 = input.nextLine();
		System.out.println(tarefa.alteracoesLista(exemplo, exemplo2));
	}

}
