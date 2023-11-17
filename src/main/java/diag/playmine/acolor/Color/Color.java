package diag.playmine.acolor.Color;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.text.MessageFormat;

public class Color {
    public static YamlConfiguration config;
    public static String c(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
    public static String message(String a, String[] args){
        return (MessageFormat.format(c(config.getString(a)), args));
    }
    public static String jsonMessage(String a, String[] args) {
        return (String.format(c(config.getString(a)), args));
    }
}
