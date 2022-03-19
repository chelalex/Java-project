package ru.mephi.restaurants.service;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.mephi.restaurants.domain.restaurant.WeekDays;
import ru.mephi.restaurants.domain.restaurant.WeekDaysDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface WeekDaysMapper {
    WeekDaysDto toDto(WeekDays weekDays);
}
