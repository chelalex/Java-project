package ru.mephi.restaurants.service;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.mephi.restaurants.domain.restaurant.Restaurant;
import ru.mephi.restaurants.domain.restaurant.RestaurantDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface RestaurantMapper {
    RestaurantDto toDto(Restaurant restaurant);
}
