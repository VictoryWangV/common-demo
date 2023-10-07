package common.demo.spring.boot;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class ShutdownHook implements Runnable {

    @PostConstruct
    public void init() {
        Runtime.getRuntime().addShutdownHook(new Thread(this));
    }

    @Override
    @SneakyThrows
    public void run() {
        log.info("监听到主程序退出。。。");
        int count = 3;
        while (count > 0) {
            Thread.sleep(1000);
            System.out.printf("%d。。。%n", count--);
        }
        log.info("主程序退出。。。");
    }
}
