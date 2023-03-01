package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine(), saida = "";
		char[] inversa = new char[entrada.length()] ;
		int aux = 0;
		for(int i = entrada.length() - 1; i >= 0; i--) {
			inversa[aux] = entrada.charAt(i);
			aux++;
		}
		for(char i : inversa) {
			saida += i;
		}
		System.out.println(saida);
		sc.close();

	}

}
