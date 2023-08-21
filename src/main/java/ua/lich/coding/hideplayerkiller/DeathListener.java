package ua.lich.coding.hideplayerkiller;

import org.bukkit.Bukkit;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import org.bukkit.potion.PotionEffectType;

public class DeathListener implements Listener {


    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        try {
            if(event.getEntity().getKiller() != null && event.getEntity().getKiller().getType() == EntityType.PLAYER) {
                //Who killed
                Player player = event.getEntity();

                //Killer
                Player killer = event.getEntity().getKiller();


                //Check Invisible
                if (killer != null && killer.hasPotionEffect(PotionEffectType.INVISIBILITY)) {
                    event.setDeathMessage(player.getName() + " was killed.");
                }

            }
        } catch (NullPointerException e) {
            Bukkit.getServer().getConsoleSender().sendMessage("Игрок просто умер.");
        }
    }

}
