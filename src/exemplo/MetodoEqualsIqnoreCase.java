package exemplo;

public class MetodoEqualsIqnoreCase {
	
	public static void main(String[] args) {
		String texto = "java";
		
		// equals e equivalente aos "=="
		if (texto.equals("Java")) {
			System.out.println("E igual");
		} else {
			System.out.println("Não e igual");
			
		}

		System.out.println("\n----------------------------------\n");
		
		if (texto.equalsIgnoreCase("JAVA")) {
			System.out.println("E igual");
		} else {
			System.out.println("Não e igual");
			
		
		}
	}
}
	
	

