package net.vivatcreative.vivatbrush;

import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class VivatBrush extends JavaPlugin {

    private String PREFIX = "[VivatBrush] ";

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX + "successfully enabled");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(PREFIX + "successfully disabled");

    }
}
