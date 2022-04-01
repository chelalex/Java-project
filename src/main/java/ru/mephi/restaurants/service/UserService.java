package ru.mephi.restaurants.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mephi.restaurants.domain.user.User;
import ru.mephi.restaurants.domain.user.UserDto;
import ru.mephi.restaurants.repository.UserRepository;

import java.util.ArrayList;

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

}
