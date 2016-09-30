package me.GeneralOP.commands.all;

import me.GeneralOP.GeneralOP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class C_nick implements CommandExecutor
{
    GeneralOP plugin;
    FileConfiguration config;

    public C_nick(GeneralOP plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
     
        return true;
    }
}
