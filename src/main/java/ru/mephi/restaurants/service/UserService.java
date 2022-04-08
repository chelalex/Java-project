package ru.mephi.restaurants.service;


import lombok.RequiredArgsConstructor;
import org.apache.commons.math3.random.RandomDataGenerator;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.mephi.restaurants.domain.user.User;
import ru.mephi.restaurants.domain.user.UserDto;
import ru.mephi.restaurants.repository.UserRepository;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
import java.util.Locale;
>>>>>>> ccbc81a (createUser is started)

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

    public User createUser(UserDto userDto) {
        User user = new User();

        user.setLogin(userDto.getLogin().toLowerCase());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setFatherName(userDto.getFatherName());
        user.setBirthday(userDto.getBirthday());
        if (userDto.getEmail() != null) {
            user.setEmail(userDto.getEmail().toLowerCase());
        }
        if (userDto.getPhone() != null) {
            user.setPhone(userDto.getPhone());
        }
        //user.setOrders(userDto.getOrders());
        String encryptedPassword = null;
                //= new BCryptPasswordEncoder().encode(RandomDataGenerator.nextInt(min, max));
        user.setPassword(encryptedPassword);
        userRepository.save(user);
        return user;
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

    public List<UserDto> findList()

}
