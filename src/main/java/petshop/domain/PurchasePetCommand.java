package petshop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class PurchasePetCommand {

    private String petId;
    private String consumerId;
}
