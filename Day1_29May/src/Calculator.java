//Accept  i/ps from User , till user enters "quit" or any other option.
//I/P : operation(add|sub|mult|div) , number1(double) , number2(double) 
//Display the result of the operation.
//It should be done in a loop , till user enters "quit" 

import java.util.Scanner;
class Calculator
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        double num1=sc.nextDouble();
        System.out.println("Enter Second Number");
        double num2=sc.nextDouble();

        
        System.out.println("1 Addition 2 Subtraction 3 Multiply 4 Divide 5 Quit");
       
        
        boolean flag = false;
        while(flag != true)
        {
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
        switch(choice)
        {
            case 1:
            double addition = num1 + num2 ;
            System.out.println("Addition = "+addition);
            break;

            case 2:
            double subtraction = num1 - num2;
            System.out.println("Subtraction = "+subtraction);
            break;

            case 3:
            double multiply = num1 * num2;
            System.out.println("Multiplication = "+multiply);
            break;

            case 4:
            double divide = num1 / num2;
            System.out.println("Division = "+divide);
            break;

            case 5:
            flag = true;
             
        }
           
        }
     sc.close();
    }
   
    
}