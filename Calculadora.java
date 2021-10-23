package dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("Digite o primeiro numero: ");
		a = s.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = s.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a,b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		
		System.out.println("Soma: "+soma);
		System.out.println("Subtração: "+subtracao);
		System.out.println("Multiplicação: "+multiplicacao);
		System.out.println("Divisão: "+divisao);

		}
	
	
	public static int soma (int a, int b ) {
		return a + b; 
	}
	public static int subtracao (int a, int b ) {
		return a - b; 
	}
	public static int multiplicacao (int a, int b ) {
		return a * b; 
	}
	public static int divisao (int a, int b ) {
		return a / b; 
	}
	
}
