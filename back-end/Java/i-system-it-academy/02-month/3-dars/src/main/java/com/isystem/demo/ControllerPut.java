package com.isystem.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class ControllerPut {
    private String name;
    private Integer age;
    @PostMapping("/humans")
    public HashMap<String, String> humans(@RequestBody String request){
        HashMap<String, String> people = new HashMap<String, String>();
        JSONObject jsnObj = new JSONObject(request);
        String name = (String) jsnObj.get("name");
        Integer age = (int) jsnObj.get("age");
        people.put(age.toString(), name);
        return people;
    }
    @PutMapping("/{age}")
    public HashMap<Integer, String> putTesting(@PathVariable("age") Integer age,
                                               @RequestBody String request){
        HashMap<Integer, String> result = new HashMap<>();
        JSONObject jsnObj = new JSONObject(request);
        String name = (String) jsnObj.get("name");
        result.put(age, name);
        return result;
    }
}
