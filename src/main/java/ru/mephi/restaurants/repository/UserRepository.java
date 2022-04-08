package ru.mephi.restaurants.repository;

import org.springframework.data.domain.Sort;
import ru.mephi.restaurants.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    public List<User> getAll(Sort sort);
}
