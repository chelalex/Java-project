package ru.mephi.restaurants.domain.table;

import lombok.Builder;
import lombok.Data;
import ru.mephi.restaurants.domain.order.TableOrderDto;

import java.time.LocalDateTime;

@Data
@Builder
public class TableTimeDto {
    private Long id;
    private TableOrderDto order;
    private LocalDateTime reservedFrom;
    private LocalDateTime reservedTo;
}
