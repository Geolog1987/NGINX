package ru.netology.Spring_boot_rest.model.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.Spring_boot_rest.model.Controller.AuthorizationController;
import ru.netology.Spring_boot_rest.model.Service.AuthorizationService;
import ru.netology.Spring_boot_rest.model.Repository.UserRepository;

@Configuration
public class AppConfig {

    @Bean
    public AuthorizationController authorizationController(AuthorizationService service){
        return new AuthorizationController(service);
    }

    @Bean
    public AuthorizationService authorizationService(UserRepository userRepository){
        return new AuthorizationService(userRepository);
    }

    @Bean
    public UserRepository userRepository(){
        return new UserRepository();
    }
}
