package ru.mephi.restaurants.domain.restaurant;

import lombok.Getter;
import lombok.Setter;
import ru.mephi.restaurants.domain.table.RestTable;

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
    private Set<RestTable> restTables;

    @OneToMany
    @JoinColumn(name = "restaurant_id")
    private Set<WeekDays> weekDays;
}
