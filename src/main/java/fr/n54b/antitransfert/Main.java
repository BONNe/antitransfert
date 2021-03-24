package fr.n54b.antitransfert;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    PluginManager pm = Bukkit.getPluginManager();
    public static Main instance;
    private static Main getInstance() {
        return instance;
    }

    public void onEnable() {
        instance = this;
        System.out.println("[antitransfert] Le plugin viens de s'allumer !");
        this.pm.registerEvents(new dropitem(), this);
        this.pm.registerEvents(new placeitem(), this);
    }

    public void onDisable() {
        System.out.println("[antitransfert] Le plugin viens de s'\u00e9teindre !");
    }
}
