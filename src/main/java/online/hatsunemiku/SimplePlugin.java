package online.hatsunemiku;

import com.github.kaktushose.jda.commands.plugins.CommandPlugin;
import java.util.List;
import org.pf4j.Extension;


@Extension
public class SimplePlugin implements CommandPlugin {

  @Override
  public String getPluginName() {
    return "SimplePlugin";
  }

  @Override
  public String getVersion() {
    return "1.0.0";
  }

  @Override
  public String getAuthor() {
    return "Somebody";
  }

  @Override
  public String getDescription() {
    return null;
  }

  @Override
  public String getWebsite() {
    return null;
  }

  @Override
  public List<String> getCommandPackages() {
    return List.of("online.hatsunemiku.commands");
  }
}
