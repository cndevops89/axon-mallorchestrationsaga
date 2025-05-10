package axonmallorchestrationsaga.command;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@ToString
@Data
public class RegisterCommand {

    //<<< Etc / ID Generation
    private String productId; // Please comment here if you want user to enter the id directly
    //>>> Etc / ID Generation
    private String productName;
    private Integer stock;
    private String orderId;
}
