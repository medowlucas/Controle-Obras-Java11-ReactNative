package br.com.irrigaparana.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.GeneratedValue;

import br.com.irrigaparana.models.Roles;


@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;
    
    private Roles role;

    public User() {
    }

    public User(String username, String password, Roles role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }
    
    
}
