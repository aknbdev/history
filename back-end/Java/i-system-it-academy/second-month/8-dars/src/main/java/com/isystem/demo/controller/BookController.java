package com.isystem.demo.controller;
import com.isystem.demo.model.Book;
import com.isystem.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired

    private BookService bookService;
    private List<Book> bookList;
    private static Integer index;
    public BookController(){
        this.bookList = new ArrayList<>();
        index = 1;
    }
    @PostMapping("/myBooks")
    public void myBooks(){
        bookList.add(new Book(index++, "Ona tili", "anonim",1999, "Math", 1));
        bookList.add(new Book(index++, "Arab tili", "anonim",2000, "Math", 2));
        bookList.add(new Book(index++, "Koreys tili", "anonim",1989, "Math", 2));
        bookList.add(new Book(index++, "Hind tili", "anonim",2003, "Math", 2));
        bookList.add(new Book(index++, "Python", "Python tog'a",2005, "Programming", 1));
        bookList.add(new Book(index++, "Xatolar", "Deyl Karnegi",2010, "Business", 1));
    }

    @PostMapping("/makeBook")
    public ResponseEntity<?> makeBook(@RequestBody Book requestBook){
        ResponseEntity<?> Result = bookService.newBook(requestBook);
        return Result;
    }

    @GetMapping("/getOne")
    public ResponseEntity<?> getOne(@RequestParam("id") Integer id){
        ResponseEntity<?> Result = bookService.getOne(id);
        return Result;
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        ResponseEntity<?> Result = bookService.getAll();
        return Result;
    }

    @PutMapping("/updateBook")
    public ResponseEntity<?> updateBook(
            @RequestParam("id") Integer id,
            @RequestBody Book requestBook
    ){
        ResponseEntity<?> Result = bookService.updateBook(id, requestBook);
        return Result;
    }

    @GetMapping("/getByAuthor")
    public ResponseEntity<?> getByAuthor(@RequestParam("author") String author){
        ResponseEntity<?> Result = bookService.getByAuthor(author);
        return Result;
    }
    @GetMapping("/getByLevel")
    public ResponseEntity<?> getByLevel(@RequestParam("level") Integer level){
        ResponseEntity<?> Result = bookService.getByLevel(level);
        return Result;
    }
    @GetMapping("/getByMajor")
    public ResponseEntity<?> getByMajor(@RequestParam("major") String major){
        ResponseEntity<?> Result = bookService.getByMajor(major);
        return Result;
    }
}