package exemplo;

public class EstruturaDeDecisaoEncadeada {
	public static void main(String[] args) {
		/**
		 * estrutura de decis�o if() if() e else if(), else if() if(), else if (), else
		 **/

		/* segundo exemplo */

		String materia = "Java";

		if (materia == "PHP") {
			System.out.println("Disciplina do 4� modulo");
		} else if (materia == "Banco de dados ") {
			System.out.println("Disciplina do 3� modulo");
		} else if (materia == "Java") {
			System.out.println("Disciplina do 5� modulo");
		} else {
			System.out.println("disciplina n�o � dos modulos de programa��o");
		}
	}
}