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
			sendMessage(channel, "/me establishes dominance over all other bots.");
			}
	//	if (message.equalsIgnoreCase("Ascend")) {
	//		changeNick(String alpha_paul_bot);
	//		}
if (recipientNick.equalsIgnoreCase(getNick())) {
    joinChannel(channel);
}

/* 

the above is my next trick which is practicing changing paulbots nickname. 
Once I am able to get that figured out, I will have a command "Paulbot become "x" where x is what paulbot will change thier nickname too. They can then use a command to be implimented later, "wheres my bot at?". 

There is a raw class below that will be used for a dice roll opperation. I am currently trying to make the program try and take input from irc and use it as variables / strings to be used later. Once I figure out how to do this, I will be able to start getting some serious work done on PaulBot. 

/*

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

