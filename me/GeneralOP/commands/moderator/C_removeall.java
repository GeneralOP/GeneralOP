package me.GeneralOP.commands.moderator;

import me.GeneralOP.GeneralOP;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;

public class C_removeall implements CommandExecutor
{

    GeneralOP plugin;

    public C_removeall(GeneralOP passedPlugin)
    {
        this.plugin = passedPlugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings)
    {
        if (cs.hasPermission("rank.moderator"))
        {
            for (Player all : Bukkit.getOnlinePlayers())
            {
                all.sendMessage(ChatColor.AQUA + cs.getName() + " - " + "is removing all online players!");

                PermissionAttachment permission = all.addAttachment(plugin);
                permission.setPermission("rank.guest", true);
                permission.setPermission("rank.user", false);
                all.sendMessage("Sorry! You are not a member anymore!");
            }
        }
        return true;
    }

}
