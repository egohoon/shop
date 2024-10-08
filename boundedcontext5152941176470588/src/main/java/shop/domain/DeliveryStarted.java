package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private String userid;
    private Integer Qty;
    private String address;
    private Long orderid;
    private Long productid;
}
