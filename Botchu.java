import org.jibble.pircbot.*;

public class Botchu extends PircBot {
	
	public Botchu() {
		this.setName("Paul_Bot");
	}

	// this is where we put in replies etc...
	public void onMessage(String channel, String sender, String login, String hostname, String message) {

		if (message.equalsIgnoreCase("@time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is now " + time);
			}
	   	if (message.equalsIgnoreCase("@go away")) {
			sendMessage(channel, "Goodbye " + sender + ", it has been fun.");
			disconnect();
			}
		if (message.equalsIgnoreCase("@test")) {
			sendMessage(channel, sender + " your test worked. Good Jorb.");
			}
		if (message.equalsIgnoreCase("@help")) {
			sendMessage(sender, "Commands: time, fight, test, go away");
			}
		if (message.equalsIgnoreCase("@fight")) {
			sendAction(channel, "establishes dominance over all other bots.");
			}
		if (message.equalsIgnorecase("@test2")) {
			final Random r = new Random();
			int i = r.nextInt(6) + 1;
			int y = r.nextInt(6) + 1;
			final int total = i + y;

			send(getChannel(), sender + " rolled two dice: " + i + " and " + y + " for a total of " + total);

			i = r.nextInt(6) + 1;
			y = r.nextInt(6) + 1;
			action("rolled two dice: " + i + " and " + y + " for a total of " + (i + y));

			if (total < (i + y))
			{
				action("wins.");
			}
			else if (total > (i + y))
			{
				action("lost.");
			}
			else
			{
				action("tied.");
			}
		}
		}
	//	if (message.equalsIgnoreCase("Ascend")) {
	//		changeNick(String alpha_paul_bot);
	//		}
//if (recipientNick.equalsIgnoreCase(getNick())) {
//    joinChannel(channel);
//}



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


	
	public void onPrivateMessage(String channel, String sender, String login, String hostname, String message) {

		if (message.equalsIgnoreCase("time")) {
			String time = new java.util.Date().toString();
			sendMessage(sender, sender + ": The time is now " + time);
			}
	   	if (message.equalsIgnoreCase("go away")) {
			sendMessage(sender, "Goodbye " + sender + ", it has been fun.");
			disconnect();
			}
		if (message.equalsIgnoreCase("test")) {
			sendMessage(sender, sender + " your test worked. Good Jorb.");
			}
		if (message.equalsIgnoreCase("help")) {
			sendMessage(sender, "Commands: time, fight, test, go away");
			}
		if (message.equalsIgnoreCase("fight")) {
			sendAction(sender, "establishes dominance over all other bots.");
			}





	}
}
