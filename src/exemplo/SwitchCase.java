package exemplo;

public class SwitchCase {
	public static void main(String[] args) {
		String opcao;
		
		opcao = "Java";
		
		switch (opcao) {
		case "Web2":
		case "web2":
		case "Web02":
		case "web02":
			System.out.println("Cria��o de sites responsivos, templates e jQuery, ajax ");
			break;
		case "PHP":
		case "Php":
		case "php":
			System.out.println("Cria��o de sites informativos, sistemas interligados a um SGBD");
			break;
		case "JAVA":
		case "Java":
		case "java":
			System.out.println("Cria��o de sistemas robusto, muito utilizado por bancos");
			break;
		default:
			System.out.println("Nenhuma das op��es acima..");
			break;
		}
	}

}
