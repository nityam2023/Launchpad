package cdac.launchpad.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String password;
    private String email;

    @Transient
    private String token;

}

