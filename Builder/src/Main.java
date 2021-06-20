
public class Main {
	public static void main(String[] args) {
		
		QueryCreation minhaConsulta = new QueryCreation();
		
		minhaConsulta.select("salario, AVG(salario), SUM(salario)")
			.table("funcionario")
				.where("salario > 1000")
					.orderBy("salario")
						.orderCondition("ASC")
							.builder();
		
		
		System.out.println(minhaConsulta);
		
	}
}
