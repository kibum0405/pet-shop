package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PlaceOrderCommand {

    private UUID customerId;
    private UUID productId;
    private Integer quantity;
}
