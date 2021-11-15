package be.infernalwhale.springdatademo.repositories;

import be.infernalwhale.springdatademo.model.Cake;

import javax.persistence.EntityManagerFactory;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CakeRepository {
    private EntityManagerFactory entityManagerFactory;

    // Repository implements the CRUD actions

    public Optional<Cake> getCake(Integer id) {
        return Optional.empty();
    }

    public Collection<Cake> getAllCakes() {
        return List.of();
    }

    public void createCake(Cake kek) {
        // Standard JPA behaviour saving shit to db
    }

    public void updateCake(Cake cake) {
        // Standard JPA behaviour saving shit to db
    }

    public void deleteCake(Integer id) {

    }

    public void deleteCake(Cake cake) {

    }
}
