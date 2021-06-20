
public abstract class Funcionario {
	
	private double salarioBase;
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public final double calcularSalario(){
		
		return salarioBase + porcentagem(salarioBase);
	}
	
	public abstract double porcentagem(Double salarioBase);
}
