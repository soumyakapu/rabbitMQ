package rabbitmqdemo.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rabbitmqdemo.config.MessagingConfig;
import rabbitmqdemo.dto.Order;
import rabbitmqdemo.dto.OrderStatus;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrederPublisher {
    @Autowired
    private RabbitTemplate template;
    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName){
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus=new OrderStatus(order,"Process","order placed successfully in "+restaurantName);
        template.convertAndSend(MessagingConfig.exchange,MessagingConfig.binding,orderStatus);
        return "Success...";

    }
}
