import java.util.Scanner;

public class Yards
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your phone number: ");
        String num = s.next();
        String num1 = num.substring(0, 3);
        String num2 = num.substring(3, 6);
        String num3 = num.substring(6, 10);
        System.out.println("(" + num1 + ")" + " " + num2 + "-" + num3);
    }
}
        
        

