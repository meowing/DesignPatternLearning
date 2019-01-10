public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void Display() {
        System.out.println("I'm a model duck!");
    }
}
