package me.GeneralOP.commands;

import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.Plugin;

public class GeneralCommand
{

    private Plugin plugin;
    public void Format(String message)
    {
        message.replace("&", "§");
    }
    
    public void AddStaff(Player user, String rank)
    {
        PermissionAttachment permission = user.addAttachment(plugin);
        permission.setPermission("rank." + rank, true);
        permission.setPermission("rank.user", false);
    }
    
    public void RemoveStaff(Player user, String rank)
    {
        PermissionAttachment permission = user.addAttachment(plugin);
                permission.setPermission("rank." + rank, false);
                permission.setPermission("rank.user", true);
    }
    
    public void demoteStaff(Player user, String rank, String demote)
    {
        PermissionAttachment permission = user.addAttachment(plugin);
                permission.setPermission("rank." + rank, false);
                permission.setPermission("rank.user", true);
    }
}
