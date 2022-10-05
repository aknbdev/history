package com.isystem.demo.service;

import com.isystem.demo.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<Book> bookList;
    private static Integer index;
    public BookService(){
        this.bookList = new ArrayList<>();
        index = 1;
    }

    public ResponseEntity<?> newBook(Book requestBook) {
        requestBook.setId(index);
        index++;
        bookList.add(requestBook);
        return new ResponseEntity<>("Ok, E new student added.", HttpStatus.CREATED);
    }

    public ResponseEntity<?> getOne(Integer id) {
        for (Book book : bookList) {
            if(book.getId().equals(id)){
                return new ResponseEntity<>(book, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("Ups, Something went wrong.", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<?> getAll() {
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    public ResponseEntity<?> updateBook(Integer id, Book requestBook) {
        for (Book book : bookList) {
            if(book.getId().equals(id)){
                book.setName(requestBook.getName());
                book.setAuthor(requestBook.getAuthor());
                book.setYear(requestBook.getYear());
                book.setMajor(requestBook.getMajor());
                book.setLevel(requestBook.getLevel());
            }
        }
        return new ResponseEntity<>("Ok, Student information is updated.", HttpStatus.OK);
    }

    public ResponseEntity<?> getByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getAuthor().equals(author)){
                books.add(book);
            }
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    public ResponseEntity<?> getByLevel(Integer level) {
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getLevel().equals(level)){
                books.add(book);
            }
        }
        return new ResponseEntity<>(books, HttpStatus.OK
        );
    }

    public ResponseEntity<?> getByMajor(String major) {
        List<Book> books = new ArrayList<>();
        for (Book book : bookList) {
            if(book.getMajor().equals(major)){
                books.add(book);
            }
        }
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
}
