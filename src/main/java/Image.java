import jakarta.persistence.*;

public class Image {

    @Id
    @GeneratedValue
    Long id;
    String filename;
    String fileData;
    Recipe associatedRecipe;

}
