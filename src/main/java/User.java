import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

public class User {

    @Id
    @GeneratedValue
    Long id;
    String username;
    String email;
    String password;
    Roles roles;
    Date dateRegistered;

    @OneToMany(mappedBy="user")
    Set<Comment> listOfComments;

    @OneToMany(mappedBy="user")
    Set<Recipe> listOfRecipe;

    @OneToMany(mappedBy="user")
    Set<Rating> listOfRatings;

    public User(String username, String email, String password, Roles roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }
}
