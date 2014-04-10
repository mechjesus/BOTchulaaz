import org.jibble.pircbot.*;
import java.util.Random;

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
			//insert a boolean expression here that activates to true post message
			//then change the disconnect to execute if boolean is true.
			disconnect();
			}
		if (message.equalsIgnoreCase("@test")) {
			sendMessage(channel, sender + " your test worked. Good Jorb.");
			}
		if (message.equalsIgnoreCase("@help")) {
			sendMessage(sender, "Commands: time, fight, test, test2, test3,  go away");
			}
		if (message.equalsIgnoreCase("@fight")) {
			sendAction(channel, "establishes dominance over all other bots.");
			}
		}	
	}
}
