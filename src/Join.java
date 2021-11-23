import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.Random;


public class Join extends ListenerAdapter {

    public class GuildMemberJoin extends ListenerAdapter {

        String msg1 = "[member] joined. Karl wishes you would fail.";
        String msg2 = "Gopal says [member] isn't following the tips for success";
        String msg3 = "BOOOOOOOOO [member]";
        String msg4 = "Yikes! [member] has joined, Everyone hide!";
        String msg5 = "Hi [member], welcome to the dungeon of CS";
        String msg6 = "I WANT YOU BACK [member]";


        String[] messages = {msg1, msg2, msg3, msg4, msg5, msg6};

        @Override
        public void onGuildMemberJoin(GuildMemberJoinEvent event) {
            Random randomPicker = new Random();
            int num = randomPicker.nextInt(messages.length);

            EmbedBuilder join = new EmbedBuilder();
            join.setColor(0x66d8ff);
            join.setDescription(messages[num].replace("[member]", event.getMember().getAsMention()));
            event.getGuild().getDefaultChannel().sendMessage(join.build()).queue();

        }

        //Member member = event.getMember();

    }
}



