package ru.mephi.restaurants.domain.order;

import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import ru.mephi.restaurants.domain.table.TableTimeDto;
import ru.mephi.restaurants.domain.user.UserDto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class TableOrderDto implements Serializable{
    private Long id;
    private Status status;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;
    //private TableTimeDto tableTime;
    private UserDto user;
}
