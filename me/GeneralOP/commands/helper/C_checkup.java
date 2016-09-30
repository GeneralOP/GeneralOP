package me.GeneralOP.commands.helper;

import me.GeneralOP.GeneralOP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class C_checkup implements CommandExecutor
{

    GeneralOP plugin;
    FileConfiguration config;

    public C_checkup(GeneralOP plugin)
    {
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        if (Bukkit.getServer().getOnlinePlayers().contains(args[0]))
        {
            cs.sendMessage(ChatColor.GOLD + "-----" + ChatColor.RED + args[0] + ChatColor.GOLD + "-----");
            cs.sendMessage(ChatColor.GOLD + "Gamemode: " + Bukkit.getServer().getPlayer(args[0]).getGameMode());
            cs.sendMessage(ChatColor.GOLD + "Health: " + Bukkit.getServer().getPlayer(args[0]).getHealth() + "/"
                    + Bukkit.getServer().getPlayer(args[0]).getMaxHealth());
            cs.sendMessage(ChatColor.GOLD + "-----------------");
        }

        return true;
    }

}
