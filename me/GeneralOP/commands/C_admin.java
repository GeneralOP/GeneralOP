package me.GeneralOP.commands.executive;

import me.GeneralOP.commands.GeneralCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/* 
    /admin remove [NAME] [RANK]
    /admin demote [NAME] [RANK] [RANK TO DEMOTE TO]
*/
public class C_admin extends GeneralCommand implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        if (args[1].contains("remove"))
        {
            if (cs.hasPermission("rank.executive"))
            {
                RemoveStaff(Bukkit.getPlayer(args[2]), args[3]);
            }
            return true;
        }
        
        if (args[1].contains("demote"))
        {
            if (cs.hasPermission("rank.executive"))
            {
                demoteStaff(Bukkit.getPlayer(args[2]), args[3], args[4]);
            }
        }
        return true;
    }
    
}
