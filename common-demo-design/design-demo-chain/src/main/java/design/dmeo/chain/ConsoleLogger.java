package design.dmeo.chain;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
