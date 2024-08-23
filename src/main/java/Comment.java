import java.util.Date;
import jakarta.persistence.*;

public class Comment {

    @Id
    @GeneratedValue
    Long id;
    String text;
    Date datePosted;
    User author;
    Recipe associatedRecipe;

}
