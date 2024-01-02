package common.demo.amqp.publisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAmqpTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSendSimpleQueue() {
        String queueName = "simple.queue";
        String message = "hello，RabbitMQ";
        rabbitTemplate.convertAndSend(queueName, message);
    }

    @Test
    public void testSendWorkQueue() throws InterruptedException {
        String queueName = "work.queue";
        for (int i = 1; i <= 50; i++) {
            String msg = LocalTime.now() + " " + i;
            rabbitTemplate.convertAndSend(queueName, msg);
            Thread.sleep(20);
        }
    }

    /**
     * 测试向交换机中发送消息
     */
    @Test
    public void testSendFanoutExchange() {
        String exchangeName = "itcast.fanout";
        String message = "hello, everyone!";
        rabbitTemplate.convertAndSend(exchangeName, "", message);
    }

    @Test
    public void testSendDirectExchange() {
        String exchangeName = "itcast.direct";
        send(exchangeName, "blue");
        send(exchangeName, "yellow");
        send(exchangeName, "red");
    }

    @Test
    public void testSendTopicExchange() {
        String exchangeName = "itcast.topic";
        send(exchangeName, "china.news");
        send(exchangeName, "china.weather");
        send(exchangeName, "japan.news");
        send(exchangeName, "japan.weather");
    }

    private void send(String exchangeName, String routingKey) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, "hello! routingKey: " + routingKey);
    }

    @Test
    public void testSendObjectExchange() {
        String queueName = "object.queue";
        Map<String, Object> map = new HashMap<>();
        map.put("姓名", "柳岩");
        map.put("年龄", 21);
        map.put("性别", "女");
        map.put("体重", 55.5);
        rabbitTemplate.convertAndSend(queueName, map);
    }
}
