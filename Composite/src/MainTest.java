
public class MainTest {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Isaque", "desenvolvedor");
		Pessoa pessoa2 = new Pessoa("Abella", "Arquiteto");
		Pessoa pessoa3 = new Pessoa("Dhiogo", "Aluno");
		Pessoa pessoa4 = new Pessoa("Italo", "Testador");
		
		Secretaria secTi = new Secretaria("Aréa de ti da empresa");
		Secretaria secProf = new Secretaria("Aréa de planejamento professores");
		
		Setor setor1 = new Setor("Ti", 1);
		Setor setor2 = new Setor("Salas de aula", 2);
		
		secTi.getOpcoes().add(pessoa1);
		secTi.getOpcoes().add(pessoa2);
		secTi.getOpcoes().add(setor1);
		
		secProf.getOpcoes().add(pessoa2);
		secProf.getOpcoes().add(setor2);
		secProf.getOpcoes().add(secTi);
	}
}
