import org.jibble.pircbot.*;
import java.util.Random;
import java.io.*;

public class Botchu extends PircBot {
	
	public Botchu() {
		this.setName("Paul_Bot");
	}
	
	// this is where we put in replies etc...
	public void onMessage(String channel, String sender, String login, String hostname, String message) {
		
		int sounda = 50;
		if (message.equalsIgnoreCase("@time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is now " + time);
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
		if (message.startsWith("+", 0)) {
			String increase = message.replaceAll("\\D+","");
			int change = new Integer(increase);
			change = Integer.parseInt(increase);
			sounda = (sounda + change);
			sendAction(channel, " raised it to" + sounda);
			}
			
			//  regex code to change string to only numbers
		//	str = str.replaceAll("\\D+","");
			
			// this should change the string message into an int
		//	Integer.parseInt(x);
			
			// then, add it to channel int and change that pitch etc,..
		//	int channel = (int channel + int message)
			
			}	
		}	
	

