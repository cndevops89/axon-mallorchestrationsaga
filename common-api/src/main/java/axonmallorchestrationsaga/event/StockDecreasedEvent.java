package axonmallorchestrationsaga.event;

import lombok.Data;
import lombok.ToString;

//<<< DDD / Domain Event

@Data
@ToString
public class StockDecreasedEvent {

    private String productId;
    private String productName;
    private Integer stock;
    private String orderId;
}
//>>> DDD / Domain Event
