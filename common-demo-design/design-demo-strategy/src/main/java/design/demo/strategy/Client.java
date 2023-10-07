package design.demo.strategy;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.show();
    }

}
