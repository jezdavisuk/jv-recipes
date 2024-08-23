import jakarta.persistence.*;
import static jakarta.persistence.FetchType.LAZY;

public class Ingredient {
    public Ingredient(String name, int quantity, String unitOfMeasurement, Recipe recipe) {
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
        this.recipe = recipe;
    }

    @Id
    @GeneratedValue
    Long id;

    String name;
    int quantity;
    String unitOfMeasurement;

    @ManyToOne(fetch=LAZY)
    Recipe recipe;

}
