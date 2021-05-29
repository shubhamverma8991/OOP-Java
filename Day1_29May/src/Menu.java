// Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa .......10 . Generate Bill ) Assign fixed prices to food items
//When user enters 'Generate Bill' option(10) , display total bill & exit.

import java.util.Scanner;
public class Menu {
    public static void main(String[] args)
    {
        double quant1=0,quant2=0,quant3=0,quant4=0,quant5=0,quant6=0,quant7=0,quant8=0,quant9=0;
        System.out.println("Welcome to the Restaurant");
        Scanner sc= new Scanner(System.in);
        System.out.println("Here is Your Menu");
        System.out.println("1.Dosa 40rs 2.Samosa 20rs 3.Idli 25rs ");
        System.out.println("4.Chowmein 35rs 5.Fried Rice 50rs 6.CholeBhature 55rs ");
        System.out.println("7.PavBhaji 55rs 8.Biryani 90rs 9.Roll 50rs");
        System.out.println("10.Bill");
        boolean flag = false;
        while(flag != true)
        {
            System.out.println("Choose");
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("Quantity for Dosa :");
                quant1 = sc.nextDouble();
                break;
                case 2:
                System.out.println("Quantity for Samosa :");
                quant2 = sc.nextDouble();
                break;
                case 3:
                System.out.println("Quantity for Idli :");
                quant3 = sc.nextDouble();
                break;
                case 4:
                System.out.println("Quantity for Chowmein :");
                quant4 = sc.nextDouble();
                break;
                case 5:
                System.out.println("Quantity for FriedRice :");
                quant5 = sc.nextDouble();
                break;
                case 6:
                System.out.println("Quantity for Chole Bhature :");
                quant6 = sc.nextDouble();
                break;
                case 7:
                System.out.println("Quantity for PavBhaji :");
                quant7 = sc.nextDouble();
                break;
                case 8:
                System.out.println("Quantity for Biryani :");
                quant8 = sc.nextDouble();
                break;
                case 9:
                System.out.println("Quantity for Roll :");
                quant9 = sc.nextDouble();
                break;
                case 10:
                flag = true;
                break;
            }

        }
        sc.close();
        double Total = (quant1*40)+(quant2*20)+(quant3*25)+(quant4*35)+(quant5*50)+(quant6*55)+(quant7*55)+(quant8*90)+(quant9*50);
        System.out.println("Your Total Bill = "+Total);

    }
}
