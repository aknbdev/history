package com.isystem.demo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Homeworks {
    // |- 1-work -|
    @PostMapping("/threeChar")
    public String threeChar(
            @RequestParam("text") String text
    ){
        Integer u = 0;
        char[] arr = text.toCharArray();
        for(int i = 0; i< arr.length-2;i++){
            if(arr[i] == arr[i+1] & arr[i] == arr[i+2]){
                u++;
            }
        }
        return u.toString();
    }

    // |- 2-work -|
    @GetMapping("/numFind")
    public String numFind(
            @RequestParam("text") String text
    ){
        Integer sum = 0;
        char[] arr = text.toCharArray();
        for(int i = 0; i<arr.length;i++){
            if (Character.isDigit(arr[i])){
                Integer num = Character.getNumericValue(arr[i]);
                sum+=num;
            }
        }
        return sum.toString();
    }

    // |- 3-work -|
    @PutMapping("/putWord")
    public  String putWord(
            @RequestParam("word") String word,
            @RequestBody String request
    ){
        JSONObject jsnObj = new JSONObject(request);
        String text = (String) jsnObj.get("text");
        String replysedtext = text.replaceAll(" ", " "+word+" ");
        return replysedtext;
    }

    // |- 4-work -|
    private List<Book> bookList;
    private static int index;
    public Homeworks(){
        this.bookList = new ArrayList<>();
        index=1;
    }
    @PostMapping("/library")
    public Book library(@RequestBody Book book){
        book.setId(index);
        bookList.add(book);
        index++;
        return book;
    }
    @GetMapping("/getOne")
    public Book getOne(@RequestParam("id") Integer id){
        for (Book book : bookList){
            if (book.getId().equals(id)){
                return book;
            }
        }
        return null;
    }
    @GetMapping("/getAllbooks")
    public List<Book> getAll(){
        return bookList;
    }
    @PutMapping("/changeBook")
    public Book changeBook(
            @RequestParam("id")Integer id,
            @RequestBody Book requestBook
    ){
        for (Book book : bookList) {
            if(book.getId().equals(id)){
                book.setName(requestBook.getName());
                book.setAuthor(requestBook.getAuthor());
                book.setMakedYear(requestBook.getMakedYear());
                book.setPrice(requestBook.getPrice());
                book.setCount(requestBook.getCount());
            }
        }
        return requestBook;
    }
    @DeleteMapping(value="/deleteBook/{id}")
    public ResponseEntity<Long> deleteBook(@PathVariable Long id){
        var isRemoved = bookList.delete(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
