package ExQuestao1;

public class MainTest {
	public static void main(String[] args) {
		
		ContaPoupan�a conta1 = new ContaPoupan�a();
		
		conta1.depositar(100);
		
		System.out.println(conta1.getSaldo());
		
		System.out.println(conta1.sacar(50));
		
		ContaCorrente conta2 = new ContaCorrente();
		
		conta2.depositar(100);
		
		System.out.println(conta2.getSaldo());
		
		System.out.println(conta2.sacar(50));
	}
}
