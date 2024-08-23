import jakarta.persistence.*;

@Entity
class Category {

    @Id
    @GeneratedValue // auto-generate IDs
    Long id;

    String name;

}
