// Accept 2 double values from User (using Scanner). Check data type.
//If arguments are not doubles , supply suitable error message & terminate.
//If numbers are double values , print its average.

import java.util.Scanner;

public class Average {
    public static void main(String[] args )
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter First Number");
        
        if (sc.hasNextDouble())
        {double num1 =sc.nextDouble();
            System.out.println("Enter Second Number");
           
                if(sc.hasNextDouble())
                {  double num2 =sc.nextDouble();
                    double avg = ((num1+num2)/2);
                    System.out.println("Average "+avg);
                }
                else 
                System.out.println("Entered number is not Double Value");
               
        }
        else 
        System.out.println("Entered number is not Double Value");
        sc.close();
        
        
       
    }
}

