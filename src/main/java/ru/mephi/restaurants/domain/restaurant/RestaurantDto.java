package ru.mephi.restaurants.domain.restaurant;

import lombok.Builder;
import lombok.Data;
import ru.mephi.restaurants.domain.table.TableDto;

import java.io.Serializable;
import java.util.Set;

@Data
@Builder
public class RestaurantDto implements Serializable{
    private Long id;
    private String name;
    private String address;
    private String openingHours;
    private String site;
    private String phone;
    private Set<TableDto> tables;

}
