package ru.mephi.restaurants.domain.restaurant;

import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD
import ru.mephi.restaurants.domain.table.Table;
=======
import ru.mephi.restaurants.domain.table.RestTable;
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter

public class Restaurant {
    @Id
    @Column(name = "restaurant_id", nullable = false)
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private LocalDateTime openingHours;
    private LocalDateTime closingHours;
    private String site;
    private String phone;

    @OneToMany
    @JoinColumn(name = "restaurant_id")
<<<<<<< HEAD
    private Set<Table> tables;
=======
    private Set<RestTable> restTables;
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f

    @OneToMany
    @JoinColumn(name = "restaurant_id")
    private Set<WeekDays> weekDays;
}
