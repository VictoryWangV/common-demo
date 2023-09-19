package common.demo.spi.client;

import common.demo.spi.service.Log;
import common.demo.spi.service.LogProvider;

public class Bootstrap {

    public static void main(String[] args) {
        Log log = LogProvider.getLogger();
        System.out.println("Log接口的实现类: " + log.getClass().getName());
        log.debug("这是一条debug级别的日志");
        log.info("这是一条info级别的日志");
        log.error("这是一条error级别的日志");
    }

}
