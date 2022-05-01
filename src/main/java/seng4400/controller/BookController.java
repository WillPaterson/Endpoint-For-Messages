package seng4400.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import seng4400.model.Book;

import java.util.ArrayList;

@Controller
public class BookController {
    ArrayList<Book> books = new ArrayList<>();

    @GetMapping("/all")
    public String showAll(Model model) {
        model.addAttribute("books", books);
        return "books/allBooks";
    }

    @PostMapping("/add")
    public String addBook(Model model) {
        books.add(new Book(1, "Test", "None"));
        return "books/allBooks";
    }
}
