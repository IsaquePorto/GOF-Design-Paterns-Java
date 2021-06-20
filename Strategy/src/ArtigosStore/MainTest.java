package Questão1;

public class MainTest {
	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.setDigital(false);
		
		livro1.setValor(10);
		

		livro1.promocao(50); //50 porcento de desconto em livros
		
		System.out.println(livro1.calcularDesconto());
		
		Jogo jogo1 = new Jogo();
		jogo1.setTabuleiro(true);
		
		jogo1.setValor(50);
		
		
		//jogo1.promocao(10);	//10 porcento de desconto em jogos
		
		System.out.println(jogo1.calcularDesconto());
		
	}
}
