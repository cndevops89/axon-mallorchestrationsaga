package axonmallorchestrationsaga.command;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@ToString
@Data
public class StartDeliveryCommand {

    //<<< Etc / ID Generation
    private String deliveryId; // Please comment here if you want user to enter the id directly
    //>>> Etc / ID Generation
    private String userId;
    private String address;
    private String orderId;
    private String productId;
    private Integer qty;
    private String status;
}
