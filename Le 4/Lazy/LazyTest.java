public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("Before calling getInstance()");
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("Final Constructor Call Count: " + Singleton.getInstanceCount());
    }
}
