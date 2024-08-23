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
    Set<Image> image;
    Date dateCreated;
    Date lastModified;

    @OneToMany(mappedBy="recipe")
    Set<Ingredient> listOfIngredients;

    @OneToMany(mappedBy="recipe")
    Set<Category> listOfCategories;

    @OneToMany(mappedBy="recipe")
    Set<Rating> listOfRating;

    @OneToMany(mappedBy = "recipe")
    Set<Tag> listOfTags;

    @ManyToOne(fetch=LAZY)
    User creator;

}
