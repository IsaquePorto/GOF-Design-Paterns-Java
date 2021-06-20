
public class Main {
	public static void main(String[] args) {
		
		Desenvolvedor func1 = new Desenvolvedor();
		
		func1.setNivel1(false);
		
		func1.setSalarioBase(1000);
		
		System.out.println(func1.calcularSalario());
	}
}
