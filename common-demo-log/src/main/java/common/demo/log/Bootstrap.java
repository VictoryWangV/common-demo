package common.demo.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Bootstrap {

    public static void main(String[] args) {
        log.trace("这是一条TRACE级别的日志");
        log.debug("这是一条DEBUG级别的日志");
        log.info("这是一条INFO级别的日志");
        log.warn("这是一条WARN级别的日志");
        log.error("这是一条ERROR级别的日志");
    }

}
