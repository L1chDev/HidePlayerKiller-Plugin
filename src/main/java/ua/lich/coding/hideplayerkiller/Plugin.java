package ua.lich.coding.hideplayerkiller;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new DeathListener(), this);
        getConfig().options().copyDefaults();
        this.saveConfig();
    }
}
