import java.util.Scanner;

public class Exercise03_01
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

    System.out.print ("Enter a, b, c: ");
    double A = input.nextDouble ();
    double B = input.nextDouble ();
    double C = input.nextDouble ();

    double NumSolutions = Math.pow (B, 2) - 4 * A * C;

    if (NumSolutions > 0)
      {
	double root = (-B + Math.pow (NumSolutions, 0.5)) / (2 * A);
	double root2 = (-B - Math.pow (NumSolutions, 0.5)) / (2 * A);
	  System.out.println ("The equation has two roots " + root + " and " + root2);
      }
    
    else if (NumSolutions == 0)
      {
	double root = (-B + Math.pow (NumSolutions, 0.5)) / (2 * A);
	System.out.println ("The equation has one root " + root);
      }
    
    else if (NumSolutions < 0)
      {
      System.out.println ("The equation has no real roots");
      } 
  }
}
