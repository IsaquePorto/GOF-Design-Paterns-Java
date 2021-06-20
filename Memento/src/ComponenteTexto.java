
public class ComponenteTexto {
	
	private String texto;

	private TextoCareTaker careTaker = new TextoCareTaker();

	public ComponenteTexto (String novoTexto) {
		this.texto = novoTexto;
		ComponenteTexto temp = new ComponenteTexto();
		temp.setTexto(novoTexto);
		careTaker.adicionarEstado(temp);
	}
	
	public ComponenteTexto() {
		
	}
	
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void salvar(String novoTexto) {
		this.texto += novoTexto;
		careTaker.adicionarEstado(new ComponenteTexto(this.texto));
	}
	
	public void desfazer() {
		texto = careTaker.getUltimoEstadoSalvo().getTexto();
	}
	
	
	
}
