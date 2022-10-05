package com.Isystem.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ControllerGet {
    @GetMapping("/test")
    public String test(){
        return "Test";
    }

    @PostMapping("/maximums")
    public HashMap<String, String> maximums(
            @RequestParam("a") Integer a,
            @RequestParam("b") Integer b,
            @RequestParam("c") Integer c,
            @RequestParam("d") Integer d
    ){
        int[] array = {a, b, c, d};
        Integer max = array[0] > array[1] ? array[0] : array[1];
        Integer secondMax = array[0] > array[1] ? array[1] : array[0];
        for (int i = 2; i < array.length; i++) {
            int value = array[i];
            if (value > max) {
                int tmp = max;
                max = value;
                secondMax = tmp;
            } else if (value > secondMax) {
                secondMax = value;
            }
        }
        HashMap<String, String> twomax = new HashMap<String, String>();
        twomax.put("Max 1 ", max.toString());
        twomax.put("Max 2 ", secondMax.toString());
        return twomax ;
    }
    @GetMapping("/speed")
    public HashMap<String, String> speed(
            @RequestParam("km") Integer km
    ){
        Integer result = km*1000/3600;
        HashMap<String, String> res = new HashMap<String, String>();
        res.put("Km/h ", km.toString());
        res.put("M/s", result.toString());
        return res;
    }
    @GetMapping("/celsy")
    public String celsy(
            @RequestParam("c") Integer c
    ){
        Double result = c+273.15;
        return result.toString();
    }

}
