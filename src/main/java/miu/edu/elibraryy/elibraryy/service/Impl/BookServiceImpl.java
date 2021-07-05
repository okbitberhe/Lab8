package miu.edu.elibraryy.elibraryy.service.Impl;

import miu.edu.elibraryy.elibraryy.model.Book;
import miu.edu.elibraryy.elibraryy.repository.BookRepository;
import miu.edu.elibraryy.elibraryy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

   // public BookRepository()
    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
