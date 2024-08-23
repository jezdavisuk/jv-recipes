import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

public class Tag {

    @Id
    @GeneratedValue
    Long id;
    String name;

    @ManyToOne(fetch=LAZY)
    Recipe recipe;

}
