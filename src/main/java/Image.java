import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

public class Image {

    @Id
    @GeneratedValue
    Long id;
    String filename;
    String fileData;

    @ManyToOne(fetch=LAZY)
    Recipe associatedRecipe;

}
