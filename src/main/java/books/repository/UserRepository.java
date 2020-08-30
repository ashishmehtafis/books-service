package books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import books.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
