package ru.mephi.restaurants.domain.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mephi.restaurants.domain.order.TableOrder;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private LocalDate birthday;
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String phone;

<<<<<<< HEAD
    @OneToMany
    @JoinColumn(name = "user_id")
=======
    @OneToMany(mappedBy = "user")
    //@JoinColumn(name = "user_id")
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
    private Set<TableOrder> orders;

}
//dffdf