package br.cesed.si.map.objectpool.atividade1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	private List<Connection> connectionsDisponiveis = new ArrayList<Connection>();
	
	private int minimumConnectionCount;
	
	private int indexConnectionInUse = -1;

	public ConnectionPool(int minimumConnectionCount) {
		this.minimumConnectionCount = minimumConnectionCount;
		initializeConnectionPool(minimumConnectionCount);
	}

	private void initializeConnectionPool(int minimumConnectionCount) {
		
		try {
			
			Class.forName("org.h2.Driver");
			//hardcoded
			
			for (int i = 0; i < minimumConnectionCount; i++) {
			
				Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
				connectionsDisponiveis.add(conn);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnectionDisponivel() {
		
		//tratamento para a última connection disponível
		//volta para a primeira connection disponível
		if(indexConnectionInUse == minimumConnectionCount - 1) {
			indexConnectionInUse = -1;
		}
		
		indexConnectionInUse++;
		return connectionsDisponiveis.get(indexConnectionInUse);
	}

}
