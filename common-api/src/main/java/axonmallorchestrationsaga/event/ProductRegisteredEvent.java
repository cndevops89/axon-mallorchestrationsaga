package axonmallorchestrationsaga.event;

import lombok.Data;
import lombok.ToString;

//<<< DDD / Domain Event

@Data
@ToString
public class ProductRegisteredEvent {

    private String productId;
    private String productName;
    private Integer stock;
}
//>>> DDD / Domain Event
