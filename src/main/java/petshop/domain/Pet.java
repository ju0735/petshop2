package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.PetShopApplication;

@Entity
@Table(name = "Pet_table")
@Data
//<<< DDD / Aggregate Root
public class Pet {

    @Id
    private String id;

    private String name;

    private String color;

    @PrePersist
    public void onPrePersist() {}

    public static PetRepository repository() {
        PetRepository petRepository = PetShopApplication.applicationContext.getBean(
            PetRepository.class
        );
        return petRepository;
    }
}
//>>> DDD / Aggregate Root
