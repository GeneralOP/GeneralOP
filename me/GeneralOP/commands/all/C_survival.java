package me.GeneralOP.commands.all;

import me.GeneralOP.GeneralOP;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class C_survival implements CommandExecutor
{
    GeneralOP plugin;
    FileConfiguration config;

    public C_survival(GeneralOP plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        String pname = cs.getName();
        
        if (cs.hasPermission("all.gamemode.survival") )
        {
                cs.getServer().getPlayer(pname).setGameMode(GameMode.SURVIVAL);
                cs.sendMessage(ChatColor.DARK_AQUA + "Gamemode > Your gamemode has been changed to Survival mode!");
            }
        
        return true;
    }
}