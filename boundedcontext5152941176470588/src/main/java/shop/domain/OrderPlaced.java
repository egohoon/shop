package shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userid;
    private String address;
    private String productID;
    private String qty;
}
