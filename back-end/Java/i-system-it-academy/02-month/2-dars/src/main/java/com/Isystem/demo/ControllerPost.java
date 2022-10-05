package com.Isystem.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ControllerPost {
    @PostMapping("/maxvalue")
    public String maxvalue(
            @RequestParam("a") Integer a,
            @RequestParam("b") Integer b,
            @RequestParam("c") Integer c
    ){
        Integer max=0;
        Integer[] array = {a, b, c};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max.toString();
    }

    @PostMapping("/oddnum")
    public HashMap<Integer, Integer> oddnum(
            @RequestParam("a") Integer a,
            @RequestParam("b") Integer b
    ){
        HashMap<Integer, Integer> oddnumbers = new HashMap<Integer, Integer>();
        Integer u = 1;
        for(Integer odd = a; odd < b; odd++){
            if(odd % 2 != 0){
                oddnumbers.put(u, odd);
                u++;
            }
        }
        return oddnumbers;
    }



}