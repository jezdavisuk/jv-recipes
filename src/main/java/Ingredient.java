import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

public class Ingredient {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int quantity;
    String unitOfMeasurement;

    @ManyToOne(fetch=LAZY)
    Recipe recipe;

}
