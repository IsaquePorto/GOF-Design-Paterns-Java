package br.cesed.si.map.objectpool.atividade1;

public class Main {
	public static void main(String[] args) {
		ConnectionPool connection = new ConnectionPool(3);
		
		
		System.out.println(connection.getConnectionDisponivel());
		System.out.println(connection.getConnectionDisponivel());
		System.out.println(connection.getConnectionDisponivel());
		System.out.println(connection.getConnectionDisponivel());
	}
	
	
	
	
}
