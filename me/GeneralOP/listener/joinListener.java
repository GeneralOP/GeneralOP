package me.GeneralOP.listener;

import me.GeneralOP.GeneralOP;
import me.GeneralOP.commands.all.C_staff;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class joinListener implements Listener
{

    GeneralOP plugin;
    FileConfiguration config;

    public joinListener(GeneralOP plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public String helper = ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "Helper"
            + ChatColor.DARK_GRAY + "]";

    @EventHandler
    public void onStaffJoin(PlayerLoginEvent login)
    {
        Player p = login.getPlayer();
        String name = p.getName();

        if (p.hasPermission("rank.helper") || p.hasPermission("rank.moderator") || p.hasPermission("rank.administrator") || p.hasPermission("rank.assistantexecutive") || p.hasPermission("rank.executive") || p.hasPermission("rank.coowner") || p.hasPermission("rank.owner"))
        {
            C_staff.staff.add(name);
            Bukkit.broadcastMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "--------- " + ChatColor.RESET
                    + "" + ChatColor.LIGHT_PURPLE + "Staff" + ChatColor.ITALIC + "" + ChatColor.GRAY
                    + " ------------");
            Bukkit.broadcastMessage(ChatColor.GREEN + "" + name + ChatColor.WHITE + " has joined! Hide your hacks!");
            Bukkit.broadcastMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "--------------------------");
        }
    }

}
