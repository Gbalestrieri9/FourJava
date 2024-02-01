package exercicio2;

public class Calculadora {

	double num1, num2 = 0;

	private double somar(double num1, double num2) {
		return num1 + num2;
	}

	private double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	private double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	private double potencia (double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	private double restoDivisao (int num1, int num2) {
		return Math.floorMod(num1,num2);
	}
	
	private double raizQuadrada (double num1, double num2) {
		return Math.sqrt(num1);
	}

	private double dividir(double num1, double num2) {
		return num1 / num2;
	}

	public double calcular(double num1, double num2, char operacao) {
		double resultado = 0;
		switch (operacao) {
		case '+':
			resultado = somar(num1, num2);
			break;
		case '-':
			resultado = subtrair(num1, num2);
			break;
		case '*':
			resultado = multiplicar(num1, num2);
			break;
		case 'p':
			resultado = potencia(num1, num2);
			break;
		case 'r':
			resultado = raizQuadrada(num1, num2);
			break;
		case '%':
			resultado = restoDivisao((int)num1, (int)num2);
			break;
		case '/':
			if (num2 != 0) {
				resultado = dividir(num1, num2);
			} else {
				resultado = 0;
			}
			break;
		}
		return resultado;
	}
}
