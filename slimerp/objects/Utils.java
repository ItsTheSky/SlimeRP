package info.itsthesky.SlimeRP.slimerp.objects;

import info.itsthesky.SlimeRP.SlimeRP;
import jdk.jfr.internal.LogLevel;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Slime;
import org.bukkit.scheduler.BukkitRunnable;

import java.io.File;
import java.util.logging.Level;

public class Utils {

    public static String colored(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static String join(String delimiter, String[] elements) {
        StringBuilder builder = new StringBuilder();
        for (String e : elements) {
            builder.append(e).append(delimiter);
        }
        return removeLastChar(builder.toString());
    }

    public static String removeLastChar(String s) {
        StringBuilder newString = new StringBuilder();
        int length = s.length()-1;
        int index = 0;
        for (String ss : s.split("")) {
            if (index < length) {
                newString.append(ss);
            }
            index++;
        }
        return newString.toString();
    }

    public static void runSync(Runnable r, int value) {
        new BukkitRunnable() {
            @Override
            public void run() {
                r.run();
            }
        }.runTaskTimer(SlimeRP.getInstance(), value, 0);
    }

    public static void log(Level level, String msg) {
        SlimeRP.getInstance().getLogger().log(level, msg);
    }
    public static YamlConfiguration load(String fileName) {
        final File file = new File(SlimeRP.getInstance().getDataFolder(), fileName);
        return YamlConfiguration.loadConfiguration(file);
    }
}
