public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFly(), new MuteQuack(), new Swim());
    }
}