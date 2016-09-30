package me.GeneralOP.commands.helper;

import com.google.common.base.Joiner;
import me.GeneralOP.GeneralOP;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;

public class C_warn implements CommandExecutor
{
    
    GeneralOP plugin;
    FileConfiguration config;

    public C_warn(GeneralOP plugin)
    {
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        Integer warnPoints = plugin.getConfig().getInt("users."  + args[0] + ".warnPoints");
        String warnMessage = Joiner.on(" ").join(args);
        if (Bukkit.getServer().getOnlinePlayers().contains(args[0]))
        {
            if (!plugin.getConfig().contains("users." +  args[0].toLowerCase() + "warnPoints"))
            {
                cs.sendMessage(ChatColor.RED + "Warning > You have been warned by" + cs.getName() + "for " + warnPoints + " this is your first warning be careful!");
                plugin.getConfig().createSection("users." + args[0].toLowerCase() + ".warnPoints");
            }
            
            if (warnPoints == 1)
            {
                Bukkit.getServer().getPlayer(args[0]).kickPlayer(ChatColor.RED + "You have been kicked by \n" + ChatColor.WHITE + cs.getName() + ChatColor.RED + "\n \n for \n" + warnMessage);
            }
            
            if (warnPoints == 2)
            {
                Bukkit.getServer().getPlayer(args[0]).kickPlayer(ChatColor.RED + "You have been banned by \n" + ChatColor.WHITE + cs.getName() + ChatColor.RED + "\n \n for \n" + warnMessage + "\n You shall be banned for 5 minutes");
                Bukkit.getServer().getPlayer(args[0]).setBanned(true);
                               
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, () -> 
                {
                    Bukkit.getServer().getPlayer(args[0]).setBanned(false);
                }, 5 * 60);
            }
            
            if (warnPoints == 3)
            {
                Bukkit.getServer().getPlayer(args[0]).kickPlayer(ChatColor.RED + "You have been kicked by \n" + ChatColor.WHITE + cs.getName() + ChatColor.RED + "\n \n for \n" + warnMessage + "\n You shall be banned for 24 hours");
                Bukkit.getServer().getPlayer(args[0]).setBanned(true);
                
                Bukkit.getServer().getScheduler().scheduleSyncDelayedTask((Plugin) this, () -> 
                {
                    Bukkit.getServer().getPlayer(args[0]).setBanned(false);
                }, 24 * 1440);
            }
        }
        else 
        {
            cs.sendMessage("The requested user" + args[0] + "can't located! Are you sure they are online or you spelt it correctly?");
            return true;
        }
        return true;
    }
}
