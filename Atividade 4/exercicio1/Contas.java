package exercicio1;

public class Contas {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("victor", 60, 8000);
		ContaPoupanca conta2 = new ContaPoupanca("José" , 20, 10000, 10);
		ContaEspecial conta3 = new ContaEspecial("Carlos", 10, 3000, 400);
		conta.sacar(5000);
		conta2.sacar(2000);
		conta3.sacar(3300);
		conta.depositar(3000);
		conta2.depositar(200);
		conta3.depositar(100);
		conta2.calcularNovoSaldo(0.1);
		System.out.println("Conta da poupança:\n" + conta2.toString());
		System.out.println("\nConta Bancaria:\n" + conta.toString());
		System.out.println("\nConta Especial: \n" + conta3.toString());
	}
}
