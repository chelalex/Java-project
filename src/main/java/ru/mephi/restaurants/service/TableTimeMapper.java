package ru.mephi.restaurants.service;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import ru.mephi.restaurants.domain.table.TableTime;
import ru.mephi.restaurants.domain.table.TableTimeDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TableTimeMapper {
    TableTimeDto toDto(TableTime tableTime);
}
