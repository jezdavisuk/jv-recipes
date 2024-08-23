import java.util.Date;
import jakarta.persistence.*;

public class User {

    @Id
    @GeneratedValue
    Long id;
    String username;
    String email;
    String password;
    Roles roles;
    Date dateRegistered;

}
