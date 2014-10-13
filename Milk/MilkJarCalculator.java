public class MilkJarCalculator
{
   public static void main(String[] args)
   {
      double milk = 10.0; // gallons
      double jarCapacity = 0.75; // gallons
      double completelyFilledJars = milk / jarCapacity;
      double notFilledJars = Math.round(completelyFilledJars);
      if (notFilledJars - completelyFilledJars > 0)
      {
          completelyFilledJars = notFilledJars - 1;
      }
      else
      {
          completelyFilledJars = notFilledJars;
      }
      
      System.out.println(completelyFilledJars);
   }
}
