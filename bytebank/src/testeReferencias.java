
public class testeReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		System.out.println(segundaConta.saldo);
	}
}
