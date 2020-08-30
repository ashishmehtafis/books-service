package books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import books.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String>{

}
