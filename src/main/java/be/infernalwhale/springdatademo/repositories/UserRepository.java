package be.infernalwhale.springdatademo.repositories;

import be.infernalwhale.springdatademo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByLoginContaining(String s);
    List<User> findByLoginStartingWith(String s);
    List<User> findByIdGreaterThan(Integer id);
    List<User> findByLoginContainingAndIdGreaterThanOrNameStartingWith(String login, Integer id, String name);

    @Query("SELECT u from User u WHERE u.name LIKE :name")
    List<User> customQuery(String name);

    @Query(value = "SELECT * FROM User WHERE name LIKE :name", nativeQuery = true)
    List<User> customSqlQuery(String name);
}
