package restaurante;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Pratos prato[]  = new Pratos[5];
		prato[0] = new Pratos("Macarrão", 15.90, "Massas");
		prato[1] = new Pratos("Filé à parmegiana", 19.99, "Carne");
		prato[2] = new Pratos("Pudim", 6.50, "Sobremesa");
		prato[3] = new Pratos("Suco de Laranja", 9.99, "Bebida");
		prato[4] = new pratos("Pizza de Frango", 29.99, "Pizza");
		int i = 0;
		int opcao = 0;
		do {
			System.out.println("Digite qual das opções de pratos deseja: [1] [2] [3] [4] [5]");
			sc.nextInt();
			if(opcao < 1 || opcao >5) {
				continue;
			}
			
		}while(i < 5);
		sc.close();
	}

}
