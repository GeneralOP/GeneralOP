package me.GeneralOP.commands.helper;

import me.GeneralOP.GeneralOP;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class C_stopit implements CommandExecutor
{

    GeneralOP plugin;
    FileConfiguration config;

    public C_stopit(GeneralOP plugin)
    {
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        if  (cs.hasPermission("staff.helper"))
        {
        Bukkit.getServer().getPlayer(args[0]).kickPlayer(ChatColor.RED + "You have been told to stop it by \n" 
                + ChatColor.WHITE + cs.getName() + ChatColor.RED + "\n You shall be banned for 1 minute.");
        Bukkit.getServer().getPlayer(args[0]).setBanned(true);

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, ()
                -> 
                {
                    Bukkit.getServer().getPlayer(args[0]).setBanned(false);
        }, 1 * 60);

      
        }
      return true;
    }

}
