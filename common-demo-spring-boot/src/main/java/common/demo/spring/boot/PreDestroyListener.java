package common.demo.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * 基于spring-boot框架实现，两种方式监听程序关闭。
 * 方式一：使用{@link PreDestroy}注解修饰函数，当程序关闭时，该函数会被回调。
 * 方式二：详见：{@link ContextClosedEventListener}
 */
@Slf4j
@Component
public class PreDestroyListener {

    @PreDestroy
    public void onDestroy() {
        log.info("监听到程序关闭...");
    }

}
