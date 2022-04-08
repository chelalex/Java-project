package ru.mephi.restaurants.domain.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mephi.restaurants.domain.order.TableOrderDto;

import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Serializable {
    private Long id;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Past
    private LocalDate birthday;
    private String login;
    private String email;
    private String firstName;
    private String lastName;
    private String fatherName;
    private String phone;

    //@OneToMany
    //@JoinColumn(name = "user_id")
    private Set<TableOrderDto> orders;
}
//blo
