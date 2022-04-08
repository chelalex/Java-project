package ru.mephi.restaurants.service;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.mephi.restaurants.domain.table.RestTable;
import ru.mephi.restaurants.domain.table.TableDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TableMapper {
    TableDto toDto(RestTable restTable);
}
