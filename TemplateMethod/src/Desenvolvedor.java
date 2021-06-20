
public class Desenvolvedor extends Funcionario{

	private boolean nivel1 = true;
	
	public boolean isNivel1() {
		return nivel1;
	}

	public void setNivel1(boolean nivel1) {
		this.nivel1 = nivel1;
	}

	@Override
	public double porcentagem(Double salarioBase) {
		if(nivel1) {
			return salarioBase*0.15;
		}else
			return salarioBase*0.25;
	}


}
