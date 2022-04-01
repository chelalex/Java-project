package ru.mephi.restaurants.service;

import ru.mephi.restaurants.domain.restaurant.Restaurant;
import ru.mephi.restaurants.domain.restaurant.RestaurantDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mephi.restaurants.domain.user.User;
import ru.mephi.restaurants.domain.user.UserDto;
import ru.mephi.restaurants.repository.RestaurantRepository;
import ru.mephi.restaurants.repository.UserRepository;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor

public class RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final RestaurantMapper mapper;
    public Iterable<RestaurantDto> getRestaurants() {
        var list = restaurantRepository.findAll();
        var result = new ArrayList<RestaurantDto>();
        for (Restaurant restaurant : list) {
            result.add(mapper.toDto(restaurant));
        }
        return result;
    }

    public Restaurant getRestaurant(Long id) {
        return restaurantRepository.findById(id).orElseThrow();
    }

    public Restaurant saveRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    public void deleteRestaurant(Long id) {
        restaurantRepository.deleteById(id);
    }


}
