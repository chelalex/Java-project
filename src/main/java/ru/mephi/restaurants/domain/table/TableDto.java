package ru.mephi.restaurants.domain.table;

import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
public class TableDto implements Serializable{
    private Long id;
    private Integer numberSeats;
    private Location location;
    private Set<TableTimeDto> tableTimeDto;
}
