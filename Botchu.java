import org.jibble.pircbot.*;

public class Botchu extends PircBot {
	
	public Botchu() {
		this.setName("BOtchulaaz");
	}

	// this is where we put in replies etc...
	public void onMessage(String channel, String sender, String login, String hostname, String message) {

		if (message.equalsIgnoreCase("time")) {
			String time = new java.util.Date().toString();
			sendMessage(channel, sender + ": The time is now " + time);
		}

	}

}

