package ru.mephi.restaurants.domain.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mephi.restaurants.domain.order.TableOrder;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
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

    @OneToMany(mappedBy = "user")
    private Set<TableOrder> orders;

}
//blea