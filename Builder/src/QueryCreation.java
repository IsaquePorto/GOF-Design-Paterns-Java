import javax.swing.JOptionPane;

public class QueryCreation {
	
	private String select;
	private String table;
	private String whereCondition;
	private String orderBy;
	private String orderCondition;
	
	public QueryCreation select(String select) {    //Aqui que pode colocar um AVG ou SUM
		this.select = select;
		return this;
	}
	
	public QueryCreation table(String selectFrom) {
		this.table = selectFrom;
		return this;
	}
	
	public QueryCreation where(String whereCondition) {
		this.whereCondition = whereCondition;
		return this;
	}
	
	public QueryCreation orderBy(String orderBy) {
		this.orderBy = orderBy;
		return this;
	}
	
	public QueryCreation orderCondition(String orderCondition) {
		this.orderCondition = orderCondition;
		return this;
	}
	
	
	public QueryCreation builder(){
		String consulta = "";
		
		if(select == null) {
			consulta += "SELECT * ";
		}else {
			consulta+= "SELECT "+select;
		}
		
		if(table == null) {
			JOptionPane.showMessageDialog(null,"Erro! Consulta deve ter uma tabela");
			return this;
		}
		else {
			consulta += "FROM "+table; //SELECT * FROM employees
		}
		
		if(whereCondition != null) {
			consulta += " WHERE "+whereCondition;
		}
		
		if(orderBy != null) {
			consulta += " ORDER BY " + orderBy;
		}
		
		if (orderCondition != null){
			consulta += " "+orderCondition;
		}
		
		JOptionPane.showMessageDialog(null,consulta);
		return this;
	}
	
}
