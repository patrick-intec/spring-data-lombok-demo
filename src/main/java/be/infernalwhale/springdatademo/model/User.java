package be.infernalwhale.springdatademo.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String login;
    private String name;

    @OneToOne
    private Cake cake;

    public User(String name) {
        this.name = name;
    }
}
