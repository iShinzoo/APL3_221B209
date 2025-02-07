public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFly(), new Squeak(), new Swim());
    }
}