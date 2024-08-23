import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int serving;
    int difficultyLevel;
    int rating;
    Date dateCreated;
    Date lastModified;

    @OneToMany(fetch=LAZY)
    Set<Ingredient> listOfIngredients;

    @OneToMany(fetch=LAZY)
    Set<Category> listOfCategories;

    @ManyToOne(fetch=LAZY)
    User creator;

}
