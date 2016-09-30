package me.GeneralOP.listener;

import me.GeneralOP.GeneralOP;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class motdListener implements Listener
{

    GeneralOP plugin;
    FileConfiguration config;

    public motdListener(GeneralOP plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
        config = plugin.getConfig();
    }

    @EventHandler
    public void onServerPing(ServerListPingEvent e)
    {
        String motd = "&bTest \n &cTesy \n as";
        motd.replace("&", "\u00A7");
        e.setMotd(motd);
    }
}
