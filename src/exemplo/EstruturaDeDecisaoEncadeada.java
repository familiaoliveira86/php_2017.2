package exemplo;

public class EstruturaDeDecisaoEncadeada {
	public static void main(String[] args) {
		/**
		 * estrutura de decisão if() if() e else if(), else if() if(), else if (), else
		 **/

		/* segundo exemplo */

		String materia = "Java";

		if (materia == "PHP") {
			System.out.println("Disciplina do 4º modulo");
		} else if (materia == "Banco de dados ") {
			System.out.println("Disciplina do 3º modulo");
		} else if (materia == "Java") {
			System.out.println("Disciplina do 5º modulo");
		} else {
			System.out.println("disciplina nâo é dos modulos de programação");
		}
	}
}