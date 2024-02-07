package exercicio3;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Tarefa tarefa = new Tarefa();
		
		int acaoDigitada;
		String tarefaDigitada = null;
		boolean executando = true;
		
		while(executando) {
			System.out.println("1. Adicionar tarefa\n"
					+ "2. Remover tarefa\n"
					+ "3. Listar tarefas\n"
					+ "4. Listar tarefas em ordem alfabetica\n"
					+ "5. Listar tarefas em cronologicas\n"
					+ "6. Sair ");
			
			System.out.println("digite cada uma das opçoes\n");
			acaoDigitada = input.nextInt();
			input.nextLine();
			
			if(acaoDigitada == 1) {
				System.out.println("digite uma tarefa\n");
				tarefaDigitada = input.nextLine();
			}
			
			tarefa.alteracoesLista(acaoDigitada, tarefaDigitada);

			if(acaoDigitada == 6) {
				executando = false;
			}
		}
	}
}
