import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class Recipe {

    @OneToMany

    int id;
    String title;
    String description;
    String instructions;
    int preparationTime;
    int cookingTime;
    int serving;
    int difficultyLevel;
    int rating;
    String listOfIngredients;
    String listOfCategories;
    User creator;
    Date dateCreated;
    Date lastModified;

}
