package me.GeneralOP;

import me.GeneralOP.commands.all.*;
import me.GeneralOP.commands.helper.*;
import me.GeneralOP.commands.moderator.*;
//import me.GeneralOP.commands.administrator.*;
//import me.GeneralOP.commands.executive.*;
import me.GeneralOP.commands.owner.*;
import me.GeneralOP.listener.*;
import org.bukkit.plugin.java.JavaPlugin;

public class GeneralOP extends JavaPlugin
{

    @Override
    public void onEnable()
    {     
        chatListener chatListener = new chatListener(this);
        joinListener joinListener = new joinListener(this);
        leaveListener leaveListener = new leaveListener(this);
        motdListener motdListener = new motdListener(this);
        this.getCommand("removeall").setExecutor(new C_removeall(this));
        this.getCommand("removeall").setUsage("/removeall");
        this.getCommand("addall").setUsage("/addall");
    }

    @Override
    public void onDisable()
    {
    }

    @Override
    public void onLoad()
    {

    }

}
