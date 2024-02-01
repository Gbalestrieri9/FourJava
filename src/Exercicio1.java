import java.util.Scanner;
public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			double num1,num2 = 0;
			try {
				System.out.println("Digite um numero: ");
				num1 = input.nextDouble();

				System.out.println("Digite o outro numero: ");
				num2 = input.nextDouble();
				
				System.out.println("Digite a operação: ");
				char operacao = input.next().charAt(0);
				
				calculadora(operacao,num1,num2);
				break;
				
			} catch (Exception e) {
				System.out.println("Digite apenas numeros \n");
				input.nextLine();
			}
		}
	}
	
	static void calculadora(char operacaoSelecionada,double num1, double num2) {
		double resultado = 0;
		switch (operacaoSelecionada) {
        case '+':
            resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);
            break;
        case '-':
            resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
            break;
        case '*':
            resultado = num1 * num2;
            System.out.println("Resultado: " + resultado);
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
            break;
        default:
            System.out.println("Operação inválida.");
    }
	}
}
