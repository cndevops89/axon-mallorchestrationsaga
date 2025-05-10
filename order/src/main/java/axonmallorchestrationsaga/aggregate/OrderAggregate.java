package axonmallorchestrationsaga.aggregate;

import static org.axonframework.modelling.command.AggregateLifecycle.*;

import axonmallorchestrationsaga.command.*;
import axonmallorchestrationsaga.event.*;
import axonmallorchestrationsaga.query.*;
import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.ToString;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

//<<< DDD / Aggregate Root
@Aggregate
@Data
@ToString
public class OrderAggregate {

    @AggregateIdentifier
    private String orderId;

    private String productName;
    private String productId;
    private String status;
    private Integer qty;
    private String userId;

    public OrderAggregate() {}

    @CommandHandler
    public OrderAggregate(OrderCommand command) {}

    @CommandHandler
    public void handle(UpdateStatusCommand command) {}

    @CommandHandler
    public void handle(OrderCancelCommand command) {}

    //<<< Etc / ID Generation
    private String createUUID() {
        return UUID.randomUUID().toString();
    }

    //>>> Etc / ID Generation

    //<<< EDA / Event Sourcing

    @EventSourcingHandler
    public void on(OrderPlacedEvent event) {
        //TODO: business logic here

    }

    @EventSourcingHandler
    public void on(OrderCompletedEvent event) {
        //TODO: business logic here

    }

    @EventSourcingHandler
    public void on(OrderCancelledEvent event) {
        //TODO: business logic here

    }
    //>>> EDA / Event Sourcing

}
//>>> DDD / Aggregate Root
