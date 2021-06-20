package RequisicaoAcesso;

public class Cliente {
	public static void main(String[] args) {
		
		
		RequisicaoChain requisicoes = new Log();
		requisicoes.setNext(new Autenticacao());
		//requisicoes.setNext(new Autorizacao());
		
		try {
			requisicoes.confirmarAcesso(IdUsuarios.log);
			requisicoes.confirmarAcesso(IdUsuarios.autenticacao);
			requisicoes.confirmarAcesso(IdUsuarios.autorizacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
