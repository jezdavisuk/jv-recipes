import java.util.Date;
import jakarta.persistence.*;

public class Rating {

    @Id
    @GeneratedValue
    Long id;
    int value;
    Date rated;
    Recipe associatedRecipe;
    User rater;

}
