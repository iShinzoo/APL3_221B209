public class Singleton {
	private static Singleton uniqueInstance = new Singleton();
	private static int counter = 0;

	private Singleton() {
		counter++; 
		System.out.println("Singleton Constructor Called. Instance count: " + counter);
	}

	public static Singleton getInstance() {
		return uniqueInstance;
	}

	public static int getInstanceCount() {
		return counter; 
}
