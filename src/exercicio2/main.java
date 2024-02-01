package exercicio2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();

		while (true) {
			double num1, num2 = 0;
			try {
				System.out.println("Digite uma das operações: \n"
						+ "+ : soma\n" 
						+ "- : subtração \n"
						+ "/ : divisão \n"
						+ "* : multiplicação \n"
						+ "P : potencia \n"
						+ "r : raiz quadrada \n"
						+ "% : resto de divisão \n");
				char operacao = input.next().charAt(0);
				
				System.out.println("Digite um numero: ");
				num1 = input.nextDouble();

				if(operacao != 'r') {
					System.out.println("Digite o outro numero: ");
					num2 = input.nextDouble();
				}

				System.out.println("Resultado: " + calculadora.calcular(num1, num2, operacao));
				break;

			} catch (Exception e) {
				System.out.println("Digite apenas numeros \n");
				input.nextLine();
			}
		}
	}
}
