package be.infernalwhale.springdatademo;

import be.infernalwhale.springdatademo.model.Cake;
import be.infernalwhale.springdatademo.model.User;
import be.infernalwhale.springdatademo.repositories.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

@SpringBootApplication
public class SpringDataDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =
        SpringApplication.run(SpringDataDemoApplication.class, args);

        UserRepository repository = ctx.getBean(UserRepository.class);
        System.out.println(repository);

        repository.save(new User().setName("Jan"));
        repository.save(new User("Piet"));
        repository.save(new User("Joris"));
        repository.save(new User("Korneel"));
        repository.save(new User("Jacoba"));
        repository.save(new User("Felicia"));

        UserRepository userRepo = ctx.getBean(UserRepository.class);
        userRepo.findByLoginContaining("J").forEach(user -> System.out.println(user.toString()));

        User user = new User()
                .setLogin("Paramememeter")
                .setName("De Naam")
                .setCake(new Cake());
    }

    // MEDEDELING: 25 November 2021: Les TWS/Dev, online technisch solicitatie gesprek
    // Ruud en Patrick gaan jullie opbellen en een technisch gesprek doen met jullie
}
