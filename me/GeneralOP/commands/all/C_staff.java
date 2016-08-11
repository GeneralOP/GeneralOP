package me.GeneralOP.commands.all;

import java.util.ArrayList;
import me.GeneralOP.GeneralOP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class C_staff implements CommandExecutor
{

    public static ArrayList<String> staff = new ArrayList<>();

    GeneralOP plugin;

    public C_staff(GeneralOP passedPlugin)
    {
        this.plugin = passedPlugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        for (Player all : Bukkit.getOnlinePlayers())
        {
            all.sendMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "----------"
                    + ChatColor.LIGHT_PURPLE + "Stsff online"
                    + ChatColor.ITALIC + "" + ChatColor.GRAY + "----------");

            all.sendMessage(ChatColor.GOLD + staff.toString());
            all.sendMessage(ChatColor.ITALIC + "" + ChatColor.GRAY + "----------------------------------");
        }
        return false;
    }
}
