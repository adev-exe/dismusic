import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Discmusic {
	public static String prefix = "/";

	public static void main(String[] args) throws LoginException {
		JDABuilder jda = JDABuilder.createDefault("OTExMzQwNzA1NjkwMDUwNjAx.YZf-LA.7CXOPdvk1XHBk6XglOeucWxXL_E");
//

//		jda.setActivity(Activity.listening("Katy Perry"));
		jda.setActivity(Activity.playing("VALORANT"));
		jda.setStatus(OnlineStatus.ONLINE);
		jda.addEventListeners(new Commands());
		jda.addEventListeners(new Clear());
		jda.build();
	}


}
