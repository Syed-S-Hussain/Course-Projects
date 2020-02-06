import java.util.Scanner;

public class Exercise02_17
{
        public static void main (String[]args)
        {
                Scanner input = new Scanner (System.in);
                System.out.println("Enter a temperature between -58°F and 41°F and a wind speed >= 2 MPH (Press enter after each):");
                double temp, speed, x;
                temp = input.nextDouble ();
                speed = input.nextDouble ();
                x = 35.74 + 0.6215 * temp - 35.75 * Math.pow (speed,0.16) + 0.4275 * temp * Math.pow (speed, 0.16);
                System.out.println ("The wind chill index is " + x);
        }
}
