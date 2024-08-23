import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

public class Comment {

    @Id
    @GeneratedValue
    Long id;
    String text;
    Date datePosted;
    Recipe associatedRecipe;

    @ManyToOne(fetch=LAZY)
    User author;

}
