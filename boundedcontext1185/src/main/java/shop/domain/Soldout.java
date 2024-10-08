package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Soldout extends AbstractEvent {

    private Long id;

    public Soldout(Inventory aggregate) {
        super(aggregate);
    }

    public Soldout() {
        super();
    }
}
//>>> DDD / Domain Event
