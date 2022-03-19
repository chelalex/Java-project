package ru.mephi.restaurants.domain.restaurant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class WeekDaysDto {
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
    private RestaurantDto restaurant;
}
