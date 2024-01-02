package common.demo.amqp.consumer.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringRabbitListener {

    @RabbitListener(queues = "simple.queue")
    public void listenSimpleQueue(String msg) {
        log.info("消费者接收到simple.queue的消息：{}", msg);
    }

    @RabbitListener(queues = "work.queue")
    public void listenWorkQueue1(String msg) throws InterruptedException {
        log.info("消费者1接收到work.queue的消息：{}", msg);
        Thread.sleep(20);
    }

    @RabbitListener(queues = "work.queue")
    public void listenWorkQueue2(String msg) throws InterruptedException {
        log.info("消费者2接收到work.queue的消息：{}", msg);
        Thread.sleep(100);
    }

    /**
     * 监听队列1
     * @param msg 队列1中消息
     */
    @RabbitListener(queues = "fanout.queue1")
    public void listenFanoutQueue1(String msg) {
        log.info("消费者1接收到fanout.queue1的消息：{}", msg);
    }

    /**
     * 监听队列2
     * @param msg 队列2中消息
     */
    @RabbitListener(queues = "fanout.queue2")
    public void listenFanoutQueue2(String msg) {
        log.info("消费者2接收到fanout.queue2的消息：{}", msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            // 指定队列
            value = @Queue(name = "direct.queue1"),
            // 指定交换机名称与类型
            exchange = @Exchange(name = "itcast.direct", type = ExchangeTypes.DIRECT),
            // 指定binding key
            key = {"red", "blue"}
    ))
    public void listenDirectQueue1(String msg) {
        log.info("消费者1接收到direct.queue1的消息：{}", msg);
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue2"),
            exchange = @Exchange(name = "itcast.direct", type = ExchangeTypes.DIRECT),
            key = {"red", "yellow"}
    ))
    public void listenDirectQueue2(String msg) {
        log.info("消费者2接收到direct.queue2的消息：{}", msg);
    }

}
