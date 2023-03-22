package rabbitmqdemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//this is for sending the respoonse
public class OrderStatus {
    private Order order;
    private String status;
    private String message;
}
