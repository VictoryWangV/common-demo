package common.demo.spring.boot;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class Config implements Runnable {

    private final AtomicInteger count;

    public Config(AtomicInteger count) {
        this.count = count;
    }

    @PostConstruct
    public void init() {
        System.out.println("初始化Config");
        new Thread(this).start();
    }

    @Override
    @SneakyThrows
    public void run() {
        while (count.get() < 1) {
            System.out.println(count.incrementAndGet());
            Thread.sleep(1000);
        }
    }
}
