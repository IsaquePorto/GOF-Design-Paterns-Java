import java.util.ArrayList;


public class IteratorExemplo {
	public static void main(String[] args) {
		
		ArrayList<String> professores = new ArrayList<String>();
		
		professores.add("Herriot");
		professores.add("Abella");
		professores.add("Juliana");
		professores.add("Fábio");
		professores.add("Ewerton");
		
		for (String prof : professores) {
			System.out.println(prof);
		}
	}
}
