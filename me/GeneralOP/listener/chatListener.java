package me.GeneralOP.listener;

import me.GeneralOP.GeneralOP;
import me.GeneralOP.utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatListener implements Listener
{

    GeneralOP plugin;
    FileConfiguration config;

    public chatListener(GeneralOP plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    @EventHandler
    public void onStaffChat(AsyncPlayerChatEvent e)
    {

    }
    
    @EventHandler
    public void onMutedChat(AsyncPlayerChatEvent e)
    {
        if (plugin.getConfig().getBoolean("Users."  + e.getPlayer().getName() + ".muted") == true)
        {
            e.getPlayer().sendMessage(ChatColor.RED + "You cannot send a message as you are muted!");
            e.setCancelled(true);
        }
    }

}
