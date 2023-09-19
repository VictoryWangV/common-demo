package common.demo.spi.impl;

public class Log implements common.demo.spi.service.Log {

    @Override
    public void debug(String msg) {
        System.err.printf("DEBUG %s%n", msg);
    }

    @Override
    public void info(String msg) {
        System.err.printf("INFO  %s%n", msg);
    }

    @Override
    public void error(String msg) {
        System.err.printf("ERROR %s%n", msg);
    }
}
