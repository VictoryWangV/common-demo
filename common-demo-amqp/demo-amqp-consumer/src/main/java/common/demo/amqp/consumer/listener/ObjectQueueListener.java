package common.demo.amqp.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class ObjectQueueListener {

    @RabbitListener(queues = "object.queue")
    public void listenObjectQueue(Map<String, Object> map) {
        log.info("ObjectQueueListener received message: {}", map);
    }

}
