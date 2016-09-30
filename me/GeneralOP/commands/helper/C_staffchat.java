package me.GeneralOP.commands.helper;

import com.google.common.base.Joiner;
import me.GeneralOP.GeneralOP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class C_staffchat implements CommandExecutor
{
    
    GeneralOP plugin;
    FileConfiguration config;

    public C_staffchat(GeneralOP plugin)
    {
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        String message = Joiner.on(" ").join(strings);
        if (!Bukkit.getOnlinePlayers().contains(cs))
        {
            for (Player all : Bukkit.getOnlinePlayers())
            {
                if (message.isEmpty())
                {
                    cs.sendMessage(ChatColor.RED + "You cannot send an empty message!");
                    return true;
                } else
                {
                    all.sendMessage(ChatColor.GRAY + "[" + ChatColor.YELLOW + "Staff Chat"
                            + ChatColor.GRAY + "] " + "CONSOLE" + ": " + ChatColor.RED + message);
                }
            }
        }

        if (cs.getServer().getOnlinePlayers().contains(cs))
        {
            for (Player all : Bukkit.getOnlinePlayers())
            {
                if (config.contains("users." + all + ".staff"))
                {

                    if (message.isEmpty())
                    {
                        cs.sendMessage(ChatColor.RED + "You cannot send an empty message!");
                        return true;
                    } else
                    {
                        all.sendMessage(ChatColor.GRAY + "[" + ChatColor.YELLOW + "Staff Chat"
                                + ChatColor.GRAY + "] " + cs.getName() + ": " + ChatColor.RED + message);
                    }
                }
            }
        }
        return true;
    }

}
