package com.isystem.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ControllerPost {
    @PostMapping("/convert")
    public HashMap<String, String> convert(@RequestBody String request){
        HashMap<String, String> response = new HashMap<String, String>();
        try {
            JSONObject jsnObj = new JSONObject(request);
            String name = (String) jsnObj.get("name");
            Integer age = (int) jsnObj.get("age");
            response.put("Hello ", name);
            response.put("Your age ", age.toString());
        }catch (JSONException e){
            System.out.println("Error " + e.toString());
        }
        return response;
    }

    @PostMapping("/login")
    public String login(@RequestBody String request){
        String user = "iTech";
        int pass = 2005;
        String noty = null;
        JSONObject jsnObj = new JSONObject(request);
        String username = (String) jsnObj.get("username");
        Integer password = (int) jsnObj.get("password");
        if(username.equals(user) && password.equals(pass)){
            noty = "Succesfully entered.";
        }
        else{
            noty = "An error has occured!";
        }
        return noty;
    }
    @PostMapping("/library")
    public String library(@RequestBody String request){
        String book = null;
        JSONObject jsnObj = new JSONObject(request);
        String name = (String) jsnObj.get("name");
        String author = (String) jsnObj.get("author");
        String price = (String) jsnObj.get("price");
        String created_date = (String) jsnObj.get("created_date");
        return String.format("This book %s was created by %s in %s and its price %s $", name, author, created_date, price);
    }
    @PostMapping("/pifagor")
    public HashMap<String, String> pifagor(
            @RequestBody String request
    ){
        HashMap<String, String> sides = new HashMap<String, String>();
        JSONObject jsnObj = new JSONObject(request);
        Integer a = (int) jsnObj.get("a");
        Integer b = (int) jsnObj.get("b");
        Double result = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        sides.put("Side a ", a.toString());
        sides.put("Side b ", b.toString());
        sides.put("Side c", result.toString());
        return sides;
    }
    @PostMapping("/sumof3")
    public HashMap<String, String> sumof3(
            @RequestBody String request
    ){
        HashMap<String, String> numbers = new HashMap<String, String>();
        JSONObject jsnObj = new JSONObject(request);
        Integer a = jsnObj.getInt("a");
        Integer b = jsnObj.getInt("b");
        Integer c = jsnObj.getInt("c");
        Integer sum = 0;

        if(a!=b){
            sum+=a;
        }
        if(b!=c){
            sum+=b;
        }
        if(a!=c){
            sum+=c;
        }

        numbers.put("A ", a.toString());
        numbers.put("B ", b.toString());
        numbers.put("C ", c.toString());
        numbers.put("Sum ", sum.toString());
        return numbers;
    }
    @PostMapping("/sumof5")
    public HashMap<String, String> sumof5(
            @RequestBody String request
    ){
        HashMap<String, String> numbers = new HashMap<String, String>();
        JSONObject jsnObj = new JSONObject(request);
        Integer a = jsnObj.getInt("a");
        Integer b = jsnObj.getInt("b");
        Integer c = jsnObj.getInt("c");
        Integer d = jsnObj.getInt("d");
        Integer e = jsnObj.getInt("e");
        Integer[] arr = {a, b, c, d, e};
        Integer temp = 0, sum = 0;
        for(int i = 0; i < arr.length; i++){
            for (int k = 0;k<arr.length-1; k++){
                if(arr[k]<arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int j = 1;j< arr.length;j++){
            sum+=arr[j];
        }
        numbers.put("A ", a.toString());
        numbers.put("B ", b.toString());
        numbers.put("C ", c.toString());
        numbers.put("D ", d.toString());
        numbers.put("E ", e.toString());
        numbers.put("Sum ", sum.toString());
        return numbers;
    }
    @PostMapping("/average")
    public String average(
            @RequestBody String request
    ){
        JSONObject jsnObj = new JSONObject(request);
        Integer a = jsnObj.getInt("a");
        Integer b = jsnObj.getInt("b");
        Integer c = jsnObj.getInt("c");
        Integer sum = a+b+c;
        int [] array = {a, b, c};
        String text = null;
        if(sum%3 == 0){
            text = "True! ";
        }
        else{
            text = "False";
        }
        return text;
    }
    @PostMapping("/textLength")
    public String textLength (
            @RequestBody String request
    ){
        
    }
}
