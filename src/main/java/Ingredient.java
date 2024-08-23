import jakarta.persistence.*;

public class Ingredient {

    @Id
    @GeneratedValue
    Long id;
    String name;
    int quantity;
    String unitOfMeasurement;
}
