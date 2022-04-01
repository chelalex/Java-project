package ru.mephi.restaurants.domain.order;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
<<<<<<< HEAD
=======
import ru.mephi.restaurants.domain.table.TableTime;
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
import ru.mephi.restaurants.domain.user.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class TableOrder {
    @Id
    @Column(name = "order_id", nullable = false)
    private Long id;
    private Status status;

<<<<<<< HEAD
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;

    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "table_time_id", referencedColumnName = "id")
    //private TableTime tableTime;

    @ManyToOne(fetch = FetchType.LAZY)
=======
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "table_time_id", referencedColumnName = "id")
    private TableTime tableTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
    private User user;

}
