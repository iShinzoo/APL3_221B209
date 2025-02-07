public class Main {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();
        
        System.out.println("Rubber Duck:");
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();
        
        System.out.println("\nWooden Duck:");
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();
        
        System.out.println("\nRedHead Duck:");
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();
        
        System.out.println("\nLake Duck:");
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.performSwim();
    }
}
