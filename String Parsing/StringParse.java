import java.util.Scanner;

public class StringParse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number = s.next();
        System.out.println(number.replace(",",""));
    }
}