package me.GeneralOP.commands.owner;

import com.google.common.base.Joiner;
import java.util.ArrayList;
import me.GeneralOP.GeneralOP;
import me.GeneralOP.utils.Utils;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;

public class C_setmotd implements CommandExecutor
{

    public static ArrayList<String> staff = new ArrayList<>();

    GeneralOP plugin;
    FileConfiguration config;

    public C_setmotd(GeneralOP plugin)
    {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] args)
    {
        String message = Joiner.on(" ").join(args);
        
        if (args[0].isEmpty())
        {
            cs.sendMessage(Utils.PREFIX + "The message you entered is not valid.");
        }
        else
        {
            config.set("server.motd", args);
        }
        
        return true;
    }
}
