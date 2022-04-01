package ru.mephi.restaurants.domain.table;

import lombok.Getter;
import lombok.Setter;
import ru.mephi.restaurants.domain.order.TableOrder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
<<<<<<< HEAD

=======
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
public class TableTime {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;
<<<<<<< HEAD
    @OneToOne(mappedBy = "tableTime")
    private TableOrder order;
=======

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resttable_id")
    private RestTable restTable;

    @OneToOne(mappedBy = "tableTime")
    private TableOrder restOrder;
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
}
