package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String userid;
    private String productid;
    private Integer Qty;
    private String address;
}
