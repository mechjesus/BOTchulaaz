import org.jibble.pircbot.*;

public class BotchuMain {

	public static void main(String[] args) throws Exception {

		Botchu bot = new Botchu();
		bot.setVerbose(true);
		bot.connect("irc.freenode.net");
		bot.joinChannel("#csf");
	}
}


