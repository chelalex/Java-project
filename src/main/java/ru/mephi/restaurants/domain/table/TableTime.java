package ru.mephi.restaurants.domain.table;

import lombok.Getter;
import lombok.Setter;
import ru.mephi.restaurants.domain.order.TableOrder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class TableTime {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;
    @OneToOne(mappedBy = "tableTime")
    private TableOrder order;
}
