package common.demo.spi.service;

/**
 * 日志接口
 */
public interface Log {

    void debug(String msg);

    void info(String msg);

    void error(String msg);
}
