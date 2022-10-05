// 7-dars-------------
//package com.company;

//class Person{
//    String name;
//    int age;
//    char gender;
//}

//class Car{
//    String name;  // instance variales
//    int birthdate;  // instance variales
//    char series;  // instance variales
//    String color;
//    double price;
//
//    void changeColor(String newColor){
//        this.color = newColor;
//    }
//    double setNewPrice(double newPrice){
//        this.price = newPrice;
//        return price;
//    }
//    void printSeries() {
//        System.out.println(series);
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Car mycar = new Car();  // New instance
//        mycar.name = "BMW";
//        mycar.birthdate = 2021;
//        mycar.series = 'y';
//        mycar.color = "red";
//        mycar.price = 340.32;
//
//        mycar.setNewPrice(421.43);
//
//        System.out.println("Name: " + mycar.name);
//        System.out.println("Birthdate: " + mycar.birthdate);
//        System.out.println("Series: " + mycar.series);
//        System.out.println("Price: " + mycar.price);



        // D. R. Y. -> Don't Repeat Yourself.
        // Class -> Andoza
        // Andozani "Attribute va Methood" bor
        // Attribute -> Field
        // Behavior -> Behavior
        // schema.org
//        Person p = new Person();
//        p.name = "Abror";
//        p.age = 32;
//        p.gender = 'm';
//        System.out.println(p.name);
//        System.out.println(p.age);
//        System.out.println(p.gender);
//    }
//}

//6-dars------imtihonLittle
//
//        5-dars------
//
//        package com.company;
//
//        import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner (System.in);
//
//
//        String[] text = new String[3];
//        int size = text.length;
//        int[] array= new int [size];
//
//
//        for(int a=0; a<text.length;a++){
//            text[a] = scan.nextLine();
//        }
//
//        for(int i=0; i < text.length; i++) {
//            if(array[i] == ' '){
//                array[i] = 0;
//            }
//
//        }
//
//        for(int s = 0; s < text.length; s++){
////            if(array[s] % 8==0){
//            System.out.println(array[s]);
////            }
//        }

//	    int[] input = new int[100];
//        int u=0, box;
//        for(int i=0;i<100;i++){
//            input[i]= scan.nextInt();
//            if(input[i]<=10){
//                break;
//            }
//            u++;
//        }
//        for(int y=1; y<u; y++){
//            for(int k=0;k<u;k++){
//                if(input[k]<input[k+1]){
//                    box=input[k];
//                    input[k]=input[k+1];
//                    input[k+1]=box;
//                }
//            }
//        }
//
//        for(int a=0;a<u;a++){
//            System.out.println(input[a]);
//        }
//    }
//}
