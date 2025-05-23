package ru.netology.Spring_boot_rest.model.Service;

import org.springframework.stereotype.Service;
import ru.netology.Spring_boot_rest.model.Authorities;
import ru.netology.Spring_boot_rest.model.exception.InvalidCredentials;
import ru.netology.Spring_boot_rest.model.Repository.UserRepository;
import ru.netology.Spring_boot_rest.model.exception.UnauthorizedUser;

import java.util.List;

@Service
public class AuthorizationService {

    private UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}
