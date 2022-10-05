package com.isystem.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.util.HashMap;

@SpringBootApplication
@RestController
public class SpringwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebApplication.class, args);
	}
//	@GetMapping("/plus")
//	public HashMap<String, String> plus(
//			@RequestParam("first") Integer first,
//			@RequestParam("second") Integer second
//	){
//		HashMap<String, String> sum = new HashMap<String, String>();
//		Integer yigindi = first+second;
//		sum.put("First ", first.toString());
//		sum.put("Second ", second.toString());
//		sum.put("Result ", yigindi.toString());
//		return sum;
//	}
//	@GetMapping("/kvadrat")
//	public HashMap<String, String> kvadrat(
//			@RequestParam("fsqrt") Integer fsqrt
//	){
//		HashMap<String, String> num = new HashMap<String, String>();
//		Integer sqrt = fsqrt * fsqrt;
//		num.put("Number ", fsqrt.toString());
//		num.put("Result", sqrt.toString());
//		return num;
//	}
//	@GetMapping("/kub")
//	public HashMap<String, String> kub(
//			@RequestParam("N") Integer N
//	){
//		HashMap<String, String> kubi = new HashMap<String, String>();
//        Integer result = N*N*N;
//		kubi.put("Number " , N.toString());
//        kubi.put("Result " , result.toString());
//		return kubi;
//	}
//    @GetMapping("/sin")
//    public HashMap<String, String> sin(
//            @RequestParam("N") Integer N
//    ){
//        HashMap<String, String> num = new HashMap<String, String>();
//        Double sinus = Math.sin(N);
//        num.put("Number ", N.toString());
//        num.put("Result ", sinus.toString());
//        return num;
//
//    }
//    @GetMapping("/cos")
//    public HashMap<String, String> cos(
//            @RequestParam("N") Integer N
//    ){
//        HashMap<String, String> num = new HashMap<String, String>();
//        Double cosinus = Math.cos(N);
//        num.put("Number ", N.toString());
//        num.put("Result ", cosinus.toString());
//        return num;
//
//    }
//
//    @GetMapping("/circle")
//    public  HashMap<String, String> circle(
//            @RequestParam("r") String r
//    ){
//        Double Result = 3.14 * (Integer.parseInt(r) * Integer.parseInt(r));
//        HashMap<String, String> ucircle = new HashMap<String, String>();
//        ucircle.put("Radius ", r);
//        ucircle.put("Result ", Result.toString());
//        return ucircle;
//    }
//    @GetMapping("/queryP")
//    public HashMap<String, String> queryP (
//            @RequestParam("a") Integer a
//    ){
//        HashMap<String, String> QP = new HashMap<String, String>();
//        Integer Result = a*4;
//        QP.put("Side ", a.toString());
//        QP.put("Result ", Result.toString());
//        return QP;
//    }
//    @GetMapping("/queryY")
//    public HashMap<String, String> queryY (
//            @RequestParam("a") Integer a
//    ){
//        HashMap<String, String> QY = new HashMap<String, String>();
//        Integer Result = a*a;
//        QY.put("Side ", a.toString());
//        QY.put("Result ", Result.toString());
//        return QY;
//    }
//    @GetMapping("/rectangleP")
//    public HashMap<String, String> rectangleP(
//            @RequestParam("a") Integer a,
//            @RequestParam("b") Integer b
//    ){
//        HashMap<String , String > RP = new HashMap<String, String>();
//        Integer Result = (2*a)+(2*b);
//        RP.put("Side A ", a.toString());
//        RP.put("Side B ", b.toString());
//        RP.put("Result ", Result.toString());
//        return RP;
//    }
//    @GetMapping("/rectangleS")
//    public HashMap<String, String> rectangleS(
//            @RequestParam("a") Integer a,
//            @RequestParam("b") Integer b
//    ){
//        HashMap<String, String> RS = new HashMap<String, String>();
//        Integer Result = a*b;
//        return RS;
//    }


}
