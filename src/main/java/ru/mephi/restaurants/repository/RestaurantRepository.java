package ru.mephi.restaurants.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mephi.restaurants.domain.restaurant.Restaurant;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long>{
}
