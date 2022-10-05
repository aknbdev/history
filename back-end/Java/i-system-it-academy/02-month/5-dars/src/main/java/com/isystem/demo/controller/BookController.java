package com.isystem.demo.controller;
import com.isystem.demo.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private List<Book> bookList;
    private static Integer index;
    public BookController(){
        this.bookList = new ArrayList<>();
        index = 1;
    }
    @PostMapping("/makeBook")
    public Book makeBook(@RequestBody Book requestBook){
        requestBook.setId(index);
        index++;
        bookList.add(requestBook);
        return requestBook;
    }
    @GetMapping("/getOne")
    public Book getOne(@RequestParam("id") Integer id){
        for (Book book : bookList) {
            if(book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
    @GetMapping("/getAll")
    public List<Book> getAll(){
        return bookList;
    }
    @PutMapping("/updateBook")
    public Book updateBook(
            @RequestParam("id") Integer id,
            @RequestBody Book requestBook
    ){
        for (Book book : bookList) {
            if(book.getId().equals(id)){
                book.setName(requestBook.getName());
                book.setAuthor(requestBook.getAuthor());
                book.setYear(requestBook.getYear());
                book.setMajor(requestBook.getMajor());
                book.setLevel(requestBook.getLevel());
            }
        }
        return requestBook;
    }
}
