package com.isystem.demo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private List<Person> personList;
    private static int index;

    public Controller(){
        this.personList = new ArrayList<>();
        index = 1;
    }

    @PostMapping("/createPerson")
    public Person create (@RequestBody Person person){
        person.setId(index);
        personList.add(person);
        index++;
        return  person;
    }

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return  personList;
    }

    @GetMapping("/showId")
    public Person showId(
            @RequestParam("id") Integer id
    ){
        for (Person person : personList) {
            if (person.getId().equals(id)){
                return person;
            }
        }
        return null;
    }

    @PutMapping("/changePerson")
    public Person changePerson(
            @RequestParam("id") Integer id,
            @RequestBody Person requestPerson
    ){
        for (Person person : personList) {
            if (person.getId().equals(id)){
                person.setName(requestPerson.getName());
                person.setAge(requestPerson.getAge());
                person.setSurname(requestPerson.getSurname());
            }
        }
        return requestPerson;
    }
}
