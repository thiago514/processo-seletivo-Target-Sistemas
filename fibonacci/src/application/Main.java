package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testFibonacci = sc.nextInt();
		boolean isFibonacci = false;
		int valAnterior1 = 0, valAnterior2 = 1, fibonacci = 0;
		while(!isFibonacci && fibonacci < testFibonacci) {
			fibonacci = valAnterior2 + valAnterior1;
			valAnterior1 = valAnterior2;
			valAnterior2 = fibonacci;
			isFibonacci = (fibonacci==testFibonacci);
		}
		System.out.print(isFibonacci ? "O número informado pertence a sequencia": "O número informado não pertence a sequencia");
		
		sc.close();
		//Criar os TESTES
	}
}
