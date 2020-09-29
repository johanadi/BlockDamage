package me.beatsolos.BlockDamage;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();

        pm.registerEvents(new TestEnv(), this);

    }
    public void onDisable() {

    }

}
