import java.util.Scanner;
import java.util.Random;

public class Exercise03_17
{
  public static void main (String[]args)
  {
    Random Opponent = new Random ();
    int comp = Opponent.nextInt (3);
    Scanner input = new Scanner (System.in);

    System.out.print ("scissor (0), rock (1), paper (2): ");
    int user = input.nextInt ();

    switch (comp)
      {
        case 0:System.out.print ("The computer is scissor.");
	break;
	case 1:System.out.print ("The computer is rock.");
	break;
	case 2:System.out.print ("The computer is paper.");
      }

    switch (user)
      {
      case 0:
	System.out.print (" You are scissor");
	break;
      case 1:
	System.out.print (" You are rock");
	break;
      case 2:
	System.out.print (" You are paper");
      }

    if (comp == user)
      System.out.println (" too. It is a draw");
    else
      {
	boolean winner = (user == 0 && comp == 2) || (user == 1 && comp == 0)
	  || (user == 2 && comp == 1);
	if (winner)
	  System.out.println (". You won");
	else
	  System.out.println (". You lose");
      }
  }
}