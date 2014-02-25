import org.jibble.pircbot.*;

public class Botchu extends PircBot {
	
	public Botchu() {
		this.setName("Paul_Bot");
	}

	// this is where we put in replies etc...
	public void onMessage(String channel, String sender, String login, String hostname, String message) {

		if (message.equalsIgnoreCase("time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is now " + time);
		if (message.equalsIgnoreCase("go away paulbot")) {
			sendMessage("Goodbye " + sender + ", it has been fun.");
			disconnect();

			
		}

/*	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		
		
import java.util.Random;
public class RollDice {
    public static int DiceRoll(int sides, int number) {
        int num = 0;
        int roll = 0;
        Random r = new Random();
        if (sides >= 3) {
        	long beg = System.nanoTime();
            for (int i = 0; i < number ; i++) {
                roll = r.nextInt(sides) + 1;
                System.out.println(roll + "!");
                num = num + roll;
            }
            long end = System.nanoTime();
        }
        else {
            System.out.println("Something broke, tell Mechjesus about this!");
        }
        return num;  
     } 

     public static void main(String[] args)
     {
         System.out.println("For a total of "+DiceRoll(5, 6)+"!");
     }
 }

*/     

	}
	}


	}
