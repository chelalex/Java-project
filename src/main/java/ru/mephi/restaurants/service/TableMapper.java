package ru.mephi.restaurants.service;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
<<<<<<< HEAD
import ru.mephi.restaurants.domain.table.Table;
=======
import ru.mephi.restaurants.domain.table.RestTable;
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
import ru.mephi.restaurants.domain.table.TableDto;

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TableMapper {
<<<<<<< HEAD
    TableDto toDto(Table table);
=======
    TableDto toDto(RestTable restTable);
>>>>>>> 7fdcb2a0ff6ea69e40518b2da88f9ff85ead7a0f
}
