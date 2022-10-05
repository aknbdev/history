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

//    author
//    level
//    major

    @GetMapping("/getByAuthor")
    public List<Book> getByAuthor(@RequestParam("author") String author){
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getAuthor().equals(author)){
                books.add(book);
            }
        }
        return books;
    }
    @GetMapping("/getByLevel")
    public List<Book> getByLevel(@RequestParam("level") Integer level){
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getLevel().equals(level)){
                books.add(book);
            }
        }
        return books;
    }
    @GetMapping("/getByMajor")
    public List<Book> getByMajor(@RequestParam("major") String major){
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getMajor().equals(major)){
                books.add(book);
            }
        }
        return books;
    }
}