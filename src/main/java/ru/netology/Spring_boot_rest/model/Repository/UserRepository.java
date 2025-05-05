package ru.netology.Spring_boot_rest.model.Repository;

import org.springframework.stereotype.Repository;
import ru.netology.Spring_boot_rest.model.Authorities;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("Aleksey") && password.equals("12345")) {
            List<Authorities> authorities = new ArrayList<>();
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.DELETE);

            return authorities;
        }
        return new ArrayList<>();
    }
}
