package ru.mephi.restaurants.service;


import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.mephi.restaurants.domain.user.User;
import ru.mephi.restaurants.domain.user.UserDto;
import ru.mephi.restaurants.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper mapper;
    public Iterable<UserDto> getUsers() {
        var list = userRepository.findAll();
        var result = new ArrayList<UserDto>();
        for (User user : list) {
            result.add(mapper.toDto(user));
        }
        return result;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public List<UserDto> findAll(Sort sort){
        var list = userRepository.findAll(sort);
        var result = new ArrayList<UserDto>();
        for (User user : list) {
            result.add(mapper.toDto(user));
        }
        return result;
    }

    public List<UserDto> findAll(List<Filter> filters){
        Specification<User> spec = Specification.where(null);//createSpecification(filter);
        for (Filter filter : filters){
            spec = spec.and(createSpecification(filter));

        }
        var result = userRepository.findAll(spec);
        return result.stream().map(mapper::toDto).collect(Collectors.toList());
    }

    private Specification<User> createSpecification(Filter filter) {
        switch (filter.getField()){
            case "lastName":
            case "firstName":
                return createStringSpec(filter);
            default:
                throw new RuntimeException("no such field or no such filter");
        }
    }

    private Specification<User> createStringSpec(Filter filter) {
        switch (filter.getOperator().toUpperCase()){
            case "EQ":
                return (root, query, cb) -> cb.equal(root.get(filter.getField()), filter.getValue());
            case "LIKE":
                return (root, query, cb) -> cb.like(root.get(filter.getField()), "%"+filter.getValue()+"%");
            default:
                throw new RuntimeException("operation not supported");
        }
    }

}
