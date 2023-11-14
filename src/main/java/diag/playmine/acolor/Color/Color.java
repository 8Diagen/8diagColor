package diag.playmine.acolor.Color;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.text.MessageFormat;

public class Color {
    public Color(YamlConfiguration config) {
        this.config = config;
    }

    public String c(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
    public YamlConfiguration config;
    public String message(String a, String[] args){
        return (MessageFormat.format(c(config.getString(a)), args));
    }

    public String jsonMessage(String a, String[] args) {
        return (String.format(c(config.getString(a)), args));
    }
}
