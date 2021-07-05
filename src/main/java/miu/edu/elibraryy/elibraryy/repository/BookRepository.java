package miu.edu.elibraryy.elibraryy.repository;

import miu.edu.elibraryy.elibraryy.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
