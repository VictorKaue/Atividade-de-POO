package restaurante;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Prato prato[]  = new Prato[5];
		prato[0] = new Prato("Macarrão", 15.90, "Massas");
		prato[1] = new Prato("Filé à parmegiana", 19.99, "Carne");
		prato[2] = new Prato("Pudim", 6.50, "Sobremesa");
		prato[3] = new Prato("Suco de Laranja", 9.99, "Bebida");
		prato[4] = new Prato("Pizza de Frango", 29.99, "Pizza");
		Pedido pedido = new Pedido();
		int i = 0;
		int opcao = 0;
		do {
			System.out.println("Digite qual das opções de pratos deseja: [1] [2] [3] [4] [5]");
			opcao = sc.nextInt();
			if(opcao < 1 || opcao >5) {
				System.out.println("Número inválido!");
				continue;
			}
			if(i==0) {
				System.out.println("Digite o código do pedido");
				pedido.setNumeroPedido(sc.nextInt());
				System.out.println("Digite o nome do cliente");
				pedido.setNomeCliente(null);
			}
			switch(opcao) {

			}
			
		}while(i < 5);
		sc.close();
	}

}
