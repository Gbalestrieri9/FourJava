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
			try {
				System.out.println("---MENU DE CONTROLE---\n"
						+ "1. Adicionar tarefa\n"
						+ "2. Remover tarefa\n"
						+ "3. Listar tarefas\n"
						+ "4. Listar tarefas em ordem alfabetica\n"
						+ "5. Listar tarefas em cronologicas\n"
						+ "6. Sair \n");
				
				System.out.println("Digite a numeração que deseja selecionar acima:");
				acaoDigitada = input.nextInt();
				input.nextLine();
				System.out.println("\n");
				
				if(acaoDigitada == 1) {
					System.out.println("digite uma tarefa: ");
					tarefaDigitada = input.nextLine();
					System.out.println("\n");
				}
				
				tarefa.alteracoesLista(acaoDigitada, tarefaDigitada);

				if(acaoDigitada == 6) {
					executando = false;
					System.out.println("Programa finalizado com sucesso!");
				}
				
			}catch(Exception e){
				System.out.println("Digite apenas os numeros disponiveis no menu de controle\n");
				input.nextLine();
			}
		}
	}
}
