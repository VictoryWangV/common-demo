package common.demo.spi.service;

public class NOPLog implements Log {

    @Override
    public void debug(String msg) {
        System.out.printf("DEBUG %s%n", msg);
    }

    @Override
    public void info(String msg) {
        System.out.printf("INFO  %s%n", msg);
    }

    @Override
    public void error(String msg) {
        System.out.printf("ERROR %s%n", msg);
    }
}
