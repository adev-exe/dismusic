import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class
Commands extends ListenerAdapter {
	

	public String prefix = "/";
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(prefix + "test")) {
			EmbedBuilder embed = new EmbedBuilder();
			embed.setTitle("Embed Title", "");
			embed.setDescription("This is the Embed description");
			embed.addField("Embed field 1", "This is the content of Field 1", false);
			embed.addField("Embed field 2", "This is the content of Field 2", false);
			embed.setFooter("Bot created by <@!235215267595026432>", event.getGuild().getOwner().getUser().getAvatarUrl());
			event.getChannel().sendMessage(embed.build()).queue();
			embed.clear();
		}
		else if(args[0].equalsIgnoreCase(prefix + "cutie")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Hell yeah!").queue();
		}

		else if(args[0].equalsIgnoreCase(prefix + "valorant")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("VALGOD").queue();
		}

	}

}
