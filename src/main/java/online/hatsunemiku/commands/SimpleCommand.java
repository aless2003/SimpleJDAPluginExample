package online.hatsunemiku.commands;

import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.dispatching.CommandEvent;
import org.pf4j.Extension;

@CommandController
public class SimpleCommand {
  @Command("simple")
  public void simpleCommand(CommandEvent event) {
    event.reply("Hello World!");
  }
}
