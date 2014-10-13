import java.util.Scanner;

public class Pseudocode2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What is the amount due in pennies: ");
        int due = s.nextInt();
        System.out.println("What is the amount received in pennies: ");
        int received = s.nextInt();
        
        int change = received - due;
        int dollars = change/100;
        int quarters = (change - 100*dollars)/25;
        int dimes = (change - 100*dollars - 25*quarters)/10;
        int nickels = (change - 100*dollars - 25*quarters - 10*dimes)/5;
        int pennies = (change-100*dollars - 25*quarters - 10*dimes - 5*nickels);
        
        System.out.println("Number Dollars " + dollars);
        System.out.println("Number Quarters " + quarters);
        System.out.println("Number Dimes " + dimes);
        System.out.println("Number Nickels " + nickels);
        System.out.println("Number Pennies " + pennies);
    }
}