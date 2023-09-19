package common.demo.spi.impl;

import common.demo.spi.service.Log;

/**
 * {@link common.demo.spi.service.Log}接口的具体实现类
 * 基于SPI实现规范，需要将全类名声明到{@code META-INF/services/common.demo.spi.service.Log}文件中，
 * 以便于被{@link java.util.ServiceLoader}加载
 */
public class Logger implements Log {

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
