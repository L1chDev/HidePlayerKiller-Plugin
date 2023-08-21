package ua.lich.coding.hideplayerkiller;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getServer().getPluginManager().registerEvents(new DeathListener(this), this);
        FileConfiguration config = this.getConfig();
        config.options().copyDefaults();
        saveConfig();

        this.saveConfig();
    }
}
