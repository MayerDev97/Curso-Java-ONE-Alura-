
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(0001,25313);
		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("123.456.789-00");
		paulo.setProfissao("Programador");
		
		conta.setTitular(paulo);
		
		System.out.println(Conta.getTotal());
		
		
	}
}
