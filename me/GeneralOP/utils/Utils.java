package me.GeneralOP.utils;

import me.GeneralOP.GeneralOP;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class Utils
{

    GeneralOP plugin;
    FileConfiguration config;

    public Utils(GeneralOP plugin)
    {
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    public static String PREFIX = ChatColor.GRAY + "[" + ChatColor.BOLD + "" + ChatColor.BLUE + "GeneralOP" + ChatColor.GRAY + "] " + ChatColor.GRAY + ">" + ChatColor.RESET + " ";

    public static String NO_PERMS = ChatColor.YELLOW + "You do not have the required permission!";

    public static String masterBuilderPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Master Builder" + ChatColor.DARK_GRAY + "] ";
    public static String helperPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "Helper" + ChatColor.DARK_GRAY + "] ";
    public static String moderatorPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Moderator" + ChatColor.DARK_GRAY + "] ";
    public static String administratorPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.GREEN + "Administrator" + ChatColor.DARK_GRAY + "] ";
    public static String assistantExecPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.RED + "Assistant Executive" + ChatColor.DARK_GRAY + "] ";
    public static String executivePrefix = ChatColor.DARK_GRAY + "[" + ChatColor.RED + "Executive" + ChatColor.DARK_GRAY + "] ";
    public static String developerPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.DARK_PURPLE + "Developer" + ChatColor.DARK_GRAY + "] ";
    public static String coownerPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.LIGHT_PURPLE + "Co-Owner" + ChatColor.DARK_GRAY + "] ";
    public static String ownerPrefix = ChatColor.DARK_GRAY + "[" + ChatColor.RED + "Owner" + ChatColor.DARK_GRAY + "] ";

    public static boolean isStaff(Player user)
    {
       
       return false;
    }
}
