package common.demo.spring.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * 基于spring-boot框架实现，两种方式监听程序关闭。
 * 方式一：实现{@link ApplicationListener}接口，并将泛型指定为{@link ContextClosedEvent}
 * 方式二：详见：{@link PreDestroyListener}
 */
@Slf4j
@Component
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        log.info("监听到程序关闭...");
    }
}