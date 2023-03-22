package rabbitmqdemo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
//this is for sending message to queue
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
