package design.demo.strategy;

public class Context {

    /**
     * 聚合策略类对象
     */
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void show() {
        strategy.show();
    }

}
