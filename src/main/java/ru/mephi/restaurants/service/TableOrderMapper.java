package ru.mephi.restaurants.service;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.mephi.restaurants.domain.order.TableOrder;
import ru.mephi.restaurants.domain.order.TableOrderDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TableOrderMapper {
    TableOrderDto toDto(TableOrder tableOrder);
}
