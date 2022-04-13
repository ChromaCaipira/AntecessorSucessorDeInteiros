package aplicação;

import modelagem.Inteiro;
import java.util.Scanner;

public class App {
	private static Inteiro numInt;
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Digite um número inteiro: ");
			int inteiro = scan.nextInt();
			
			numInt = new Inteiro(inteiro);
			
			System.out.println(numInt.antesuc());
		}
	}
}
