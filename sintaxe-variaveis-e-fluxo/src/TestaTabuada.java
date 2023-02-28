
public class TestaTabuada {

	public static void main(String[] args) {
		System.out.print("***** TABUADA *****");
		System.out.println();
		System.out.println();
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			for(int contador = 1; contador <=10; contador++) {
				System.out.print(multiplicador + " * " + contador + "  ");
				System.out.print(" = " + (contador * multiplicador));
				System.out.println();
			}
			System.out.println();
		}
	}
}
