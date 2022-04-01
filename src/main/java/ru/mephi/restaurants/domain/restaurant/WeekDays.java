package ru.mephi.restaurants.domain.restaurant;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mephi.restaurants.domain.order.TableOrder;

import javax.persistence.*;
import javax.validation.constraints.Past;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Getter
@Setter

public class WeekDays {
    @Id
    @Column(name = "weekdays_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalTime mondayBegin;
    private LocalTime mondayEnd;
    private LocalTime tuesdayBegin;
    private LocalTime tuesdayEnd;
    private LocalTime wednesdayBegin;
    private LocalTime wednesdayEnd;
    private LocalTime thursdayBegin;
    private LocalTime thursdayEnd;
    private LocalTime fridayBegin;
    private LocalTime fridayEnd;
    private LocalTime saturdayBegin;
    private LocalTime saturdayEnd;
    private LocalTime sundayBegin;
    private LocalTime sundayEnd;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
