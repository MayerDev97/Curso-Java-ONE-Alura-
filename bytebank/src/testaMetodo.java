
public class testaMetodo {

	public static void main(String[] args) {
		Conta contaJonatham = new Conta();
		contaJonatham.saldo = 100;
		
		contaJonatham.deposita(50);
		System.out.println(contaJonatham.saldo);
		
		boolean conseguiuRetirar = contaJonatham.saca(20);
		System.out.println(contaJonatham.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(3000, contaJonatham)) {
			System.out.println("TransferĂȘncia realizada com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println(contaJonatham.saldo);
		System.out.println(contaMarcela.saldo);
	}
}
