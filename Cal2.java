import java.util.Scanner;
public class Calc {
    
    public static void main(String[] args) {
        boolean run = true;
        while(run){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Type CE if you want convert C ot F type FA if you want to convert F to C");
        String temp = scanner.nextLine();
        
        switch (temp) {
    
            case "FA" -> {
            System.out.println("Type Farenheit");
            double FF = scanner.nextDouble();
            double CC = (5*(FF-32)/9);
            System.out.println(FF+" Farenheit in Celcius is "+CC);
            }
            
            case "CE"-> {
            System.out.println("Type Celcius");
            double CC = scanner.nextDouble();
            double FF = ((CC*9)/5)+32;
            System.out.println(CC+" Celcius in Farenheit is " +FF);
            
            }
            default -> {}
            
        }
    
    
       }
    }
}