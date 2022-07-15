package ru.mephi.restaurants.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mephi.restaurants.domain.restaurant.Restaurant;

import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long>{
    public List<Restaurant> findAll(Sort sort);
}
