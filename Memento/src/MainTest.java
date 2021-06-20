
public class MainTest {
	
	public static void main(String[] args) {
		
		ComponenteTexto notePad = new ComponenteTexto("");
		notePad.salvar("A");
		System.out.println(	notePad.getTexto());
		notePad.salvar("B");
		System.out.println(	notePad.getTexto());
		notePad.salvar("C");
		System.out.println(	notePad.getTexto());
		notePad.desfazer();
		System.out.println(notePad.getTexto());
		notePad.desfazer();
		System.out.println(notePad.getTexto());
	}
}
