import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

public class Rating {

    @Id
    @GeneratedValue
    Long id;
    int value;
    Date rated;

    @ManyToOne(fetch=LAZY)
    User rater;

    @ManyToOne(fetch=LAZY)
    Recipe associatedRecipe;

}
