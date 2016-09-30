package me.GeneralOP.listener;

import me.GeneralOP.GeneralOP;
import me.GeneralOP.commands.all.C_staff;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class leaveListener implements Listener
{

    GeneralOP plugin;
    FileConfiguration config;

    public leaveListener(GeneralOP plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }
    public String helper = ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "Helper"
            + ChatColor.DARK_GRAY + "]";

    @EventHandler
    public void onStaffLeave(PlayerQuitEvent logout)
    {
        Player p = logout.getPlayer();
        String name = p.getName();
        String pname = p.getDisplayName();

        if (p.hasPermission("rank.helper"))
        {
            C_staff.staff.remove(name);
            Bukkit.broadcastMessage(" ");
            Bukkit.broadcastMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "--------- " + ChatColor.RESET
                    + "" + ChatColor.LIGHT_PURPLE + "Staff" + ChatColor.ITALIC + "" + ChatColor.GRAY
                    + " ------------");
            Bukkit.broadcastMessage(ChatColor.GREEN + "" + pname + ChatColor.WHITE + " has left the game!");
            Bukkit.broadcastMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "--------------------------");
            Bukkit.broadcastMessage(" ");
        }

        if (p.hasPermission("rank.moderator"))
        {

        }
    }

}
