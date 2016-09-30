package me.GeneralOP.listener;

import java.util.ArrayList;
import me.GeneralOP.GeneralOP;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class scoreboardListener implements Listener
{
    static ArrayList<String> A = new ArrayList<>();
    GeneralOP plugin;
    private Plugin GeneralOP;
    
    public scoreboardListener(GeneralOP plugin)
    {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }
    
    	public void add(final Player player) {
		final ScoreboardManager manager = Bukkit.getScoreboardManager();
		final Scoreboard board = manager.getNewScoreboard();
		
		Objective objective = board.registerNewObjective("Scoreboard", "dummy");
		objective.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		Score spacer = objective.getScore("§f");
		spacer.setScore(4);
		
		Score score = objective.getScore(ChatColor.GREEN + "" + ChatColor.BOLD  + "Name: "  + ChatColor.GOLD + player.getName());
		score.setScore(3);
                
                Score spacer2 = objective.getScore("§f");
                spacer2.setScore(2);
                
                Score score2 = objective.getScore(ChatColor.GREEN  + "" + ChatColor.BOLD + "Online Players: " +  ChatColor.GOLD + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers());
		score2.setScore(1);
                
		A.clear();
		A.add("1");
		
		BukkitScheduler Scheduler = Bukkit.getServer().getScheduler();
		Scheduler.scheduleSyncRepeatingTask(GeneralOP, () ->
                {
                    Integer i = A.size();
                    if(i == 1) {
                        objective.setDisplayName(Format("&b&lGeneralOP"));
                        A.add("A");
                    }
                    if(i == 2) {
                        objective.setDisplayName(Format("&d&lG&b&leneralOP"));
                        A.add("B");
                    }
                    if(i == 3) {
                        objective.setDisplayName(Format("&d&lGe&b&lneralOP"));
                        A.add("C");
                    }
                    if(i == 4) {
                        objective.setDisplayName(Format("&d&lGen&b&leralOP"));
                        A.add("D");
                    }
                    if(i == 5) {
                        objective.setDisplayName(Format("&d&lGene&b&lralOP"));
                        A.add("E");
                    }
                    if(i == 6) {
                        objective.setDisplayName(Format("&d&lGener&b&lalOP"));
                        A.add("F");
                    }
                    if(i == 7) {
                        objective.setDisplayName(Format("&d&lGenera&b&llOP"));
                        A.add("G");
                    }
                    if(i == 8) {
                        objective.setDisplayName(Format("&d&lGeneral&b&lOP"));
                        A.add("H");
                    }
                    if(i == 9) {
                        objective.setDisplayName(Format("&d&lGeneralO&b&lP"));
                        A.add("I");
                    }
                    if(i == 10) {
                        objective.setDisplayName(Format("&d&lGeneralOP&b&l"));
                        A.add("J");
                    }
                    if(i == 11) {
                        objective.setDisplayName(Format("&d&lGeneralO&b&lP"));
                        A.add("K");
                    }
                    if(i == 12) {
                        objective.setDisplayName(Format("&d&lGeneral&b&lOP"));
                        A.add("L");
                    }
                    if(i == 13) {
                        objective.setDisplayName(Format("&d&lGenera&b&llOP"));
                        A.add("M");
                    }
                    if(i == 14) {
                        objective.setDisplayName(Format("&d&lGener&b&lalOP"));
                        A.add("N");
                    }
                    if(i == 15) {
                        objective.setDisplayName(Format("&d&lGene&b&lralOP"));
                        A.add("O");
                    }
                    if(i == 16) {
                        objective.setDisplayName(Format("&d&lGen&b&leralOP"));
                        A.add("P");
                    }
                    if(i == 17) {
                        objective.setDisplayName(Format("&d&lGe&b&lneralOP"));
                        A.add("Q");
                    }
                    if(i == 18) {
                        objective.setDisplayName(Format("&d&lG&b&leneralOP"));
                        A.add("R");
                    }
                    if(i == 18) {
                        A.clear();
                        A.add("1");
                    }
                }, 0, 6);

		player.setScoreboard(board);
	}
	
	public static String Format(String text) {
		return text.replaceAll("&", "§");
	}
	
	@EventHandler
	public void PlayerJoinEvent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		this.add(p);
	}
}
