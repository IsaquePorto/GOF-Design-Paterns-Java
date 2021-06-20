
public class SingletonMain {
	
	public static void main(String[] args) {
		
		Singleton instancia1 = Singleton.getInstance();
		System.out.println(instancia1);
		Singleton instancia2 = Singleton.getInstance();
		
		System.out.println(instancia2);
	}
}
