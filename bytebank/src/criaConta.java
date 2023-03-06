
public class criaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		primeiraConta.saldo += 100;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("A primeira Conta tem " + primeiraConta.saldo);
		System.out.println("A segunda Conta tem " + segundaConta.saldo);
	}

}
