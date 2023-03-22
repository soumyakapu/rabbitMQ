package rabbitmqdemo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import rabbitmqdemo.config.MessagingConfig;
import rabbitmqdemo.dto.OrderStatus;

@Component
public class User {
    @RabbitListener(queues = MessagingConfig.Queue)
    public void consumeMessageFromQueue(OrderStatus orderStatus){
        System.out.println("Message recieved from queue :" +orderStatus);
    }
}
