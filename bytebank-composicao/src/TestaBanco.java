
public class TestaBanco {

	public static void main(String[] args) {
		Cliente jonatham = new Cliente();
		jonatham.nome = "Jonatham Mayer";
		jonatham.cpf = "123.456.789-00";
		jonatham.profissao = "Programador";

		Conta contaJonatham = new Conta();
		contaJonatham.deposita(100);
		
		contaJonatham.titular = jonatham;
		System.out.println(contaJonatham.titular.nome);
	}
}
