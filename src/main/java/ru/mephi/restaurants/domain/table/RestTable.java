package ru.mephi.restaurants.domain.table;

import lombok.Getter;
import lombok.Setter;
import ru.mephi.restaurants.domain.restaurant.Restaurant;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@javax.persistence.Table(name = "rest_table")
public class RestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numberSeats;
    private Location location;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    @OneToMany(mappedBy = "restTable")
    private Set<TableTime> tableTime;
}
