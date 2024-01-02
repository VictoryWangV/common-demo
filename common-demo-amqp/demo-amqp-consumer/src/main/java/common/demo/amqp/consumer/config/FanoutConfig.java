package common.demo.amqp.consumer.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FanoutConfig {

    /**
     * 声明交换机（exchange）
     * @return 交换机（exchange）
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("itcast.fanout");
    }

    /**
     * 声明队列1（queue）
     * @return 队列1（queue）
     */
    @Bean
    public Queue fanoutQueue1() {
        return new Queue("fanout.queue1");
    }

    /**
     * 绑定交换机与队列1
     * @param fanoutQueue1 队列1
     * @param fanoutExchange 交换机
     * @return 绑定器
     */
    @Bean
    public Binding fanoutBinding1(Queue fanoutQueue1, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueue1).to(fanoutExchange);
    }

    /**
     *  声明队列2（queue）
     * @return 队列2（queue）
     */
    @Bean
    public Queue fanoutQueue2() {
        return new Queue("fanout.queue2");
    }

    /**
     *  绑定交换机与队列2
     * @param fanoutQueue2 队列2
     * @param fanoutExchange 交换机
     * @return 绑定器
     */
    @Bean
    public Binding fanoutBinding2(Queue fanoutQueue2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(fanoutQueue2).to(fanoutExchange);
    }

}
