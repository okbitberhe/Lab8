package miu.edu.elibraryy.elibraryy.controller;


import miu.edu.elibraryy.elibraryy.model.Book;
import miu.edu.elibraryy.elibraryy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;



    @GetMapping(value={"/book/list"})
    public ModelAndView bookList(){
        var modelAndView = new ModelAndView();
        List<Book> books= bookService.getBooks();
        modelAndView.addObject("books",books);
        modelAndView.setViewName("bookList/list");
        return modelAndView;
    }

}
