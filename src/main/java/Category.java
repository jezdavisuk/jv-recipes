import jakarta.persistence.*;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
class Category {

    @Id
    @GeneratedValue // auto-generate IDs
    Long id;

    String name;

//    @OneToMany(mappedBy="category")
//    Set<Category> listOfRecipes;

    @ManyToOne(fetch=LAZY)
    Recipe recipe;

}
