import java.util.*;
public class App {
    public static void main(String[] args){
        // Scanner scan = new Scanner(System.in);
        // String day = "Wednesday";
        // int a=5;
        // System.out.println("Hey I you free on " + day + "?\n");
        // System.out.println("Hmm, let me check my calendar.\n");
    
        // switch (day) {
        //   case "Monday":{
        //     System.out.println("Sorry. I have to stay at work late.");
        //     break;
        //   }

        //   case "Tuesday":{
        //     System.out.println("It looks like I have meeting all day.");
        //     break;
        //   }

        //   case "Wednesday":{
        //     System.out.println("I have a dentist appointment Some another time.");
        //     break;
        //   }

        //   case "Thursday":{
        //     System.out.println("Sorry, Thursday is date night!");
        //     break;
        //   }

        //   case "Friday":{
        //     System.out.println("I'm free!");
        //     break;
        //   }

        //   case "Saturday":{
        //     System.out.println("I'm free!");
        //     break;
        //   }
        //   case "Sunday":{
        //     System.out.println("I'm free!");
        //   }
        //   default:
        //   System.out.println("That's not a day1");
        //     break;
        // }
    
        System.out.println("\n****ROYAL BANK OFF JAVA****\n");
        System.out.println("Are you here to get a mortgage?\n(Yes or No)");
        String name, user = scan.next();
        double savings, cardDebt;
        int years;
        switch (user) {
            case "yes":{
                System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?" + "\nAnd, hoiw much do you owe in credit card debt?");
                savings = scan.nextDouble();
                cardDebt = scan.nextDouble();
                System.out.println("\nHow many years have you worked for?");
                years = scan.nextInt();
                System.out.println("What is your name?");
                name = scan.next();
                if (savings / 100 * 120 >= cardDebt){
                    System.out.println("Congratulations " + name + " You have been appoved!");
                }
                else{
                    System.out.println("Sorry you are not eligible for a mortgage.");
                }

                break;
            }
      
            case "no":{
                System.out.println("\nOk. Have a nice day!");
                break;
            }
        }
    }
}
