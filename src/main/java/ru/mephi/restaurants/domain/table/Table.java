package ru.mephi.restaurants.domain.table;

import lombok.Getter;
import lombok.Setter;
import ru.mephi.restaurants.domain.restaurant.Restaurant;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numberSeats;
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    private Restaurant restaurant;

    @OneToMany
    @JoinColumn(name = "table_id")
    private Set<TableTime> tableTime;
}
