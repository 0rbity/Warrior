package io.github.mcwars.Warrior;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.minecraft.server.v1_12_R1.MinecraftServer;
import net.minecraft.server.v1_12_R1.WhiteList;

public class Main extends JavaPlugin implements Listener{
public ArrayList<String> PlayerList = new ArrayList<String>();
	public void onEnable(){
		// Registers events.
		registerEvents();
		getLogger().info("Warrior now is Enabled.");
	}
	
	public void onDisable(){
		getLogger().info("Warrior is now Disabled.");
	}

	
@SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	if(cmd.getName().equalsIgnoreCase("devs")){
		// Lists Warrior devs. You rock!
		sender.sendMessage(ChatColor.GOLD + "Warrior Developers: " + ChatColor.DARK_RED + "RainDropInMC, Whimpers, Orbity, AtomicRift, OrganicCuber.");
	}
	if(cmd.getName().equalsIgnoreCase("reop")){
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "Re-oping all Operators...");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op AtomicRift");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd AtomicRift Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Whimpers");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Whimpers Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op OrganicCuber");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd OrganicCuber Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op FactoDoesStuff");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd FactoDoesStuff Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op RainDropInMC");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd RainDropInMC Manager");
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "50 percent complete...");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Orbity");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Orbity Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Diamistic");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Diamistic Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Fruitified");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Fruitified Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op MechaArch");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd MechaArch Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op WNHCreeperMan");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd WNHCreeperMan Owner");
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "Re-oping completed.");
	
	}
	if (cmd.getName().equalsIgnoreCase("emergencyrestart")){
		WhiteList whitelist = MinecraftServer.getServer().getPlayerList().getWhitelist();
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "EMERGENCY RESTART ACTIVATED.");
		whitelist.getValues().clear();
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "WHITELIST CLEARED");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op AtomicRift");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd AtomicRift Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add AtomicRift");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Whimpers");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Whimpers Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add Whimpers");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op OrganicCuber");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd OrganicCuber Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add OrganicCuber");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op FactoDoesStuff");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd FactoDoesStuff Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add FactoDoesStuff");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op RainDropInMC");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd RainDropInMC Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add RainDropInMC");
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "RESTART 50 PERCENT COMPLETE.");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Orbity");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Orbity Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add Orbity");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Diamistic");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Diamistic Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add Diamistic");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op Fruitified");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd Fruitified Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add Fruitified");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op MechaArch");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd MechaArch Manager");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add MechaArch");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "op WNHCreeperMan");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "manuadd WNHCreeperMan Owner");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist add WNHCreeperMan");
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "ENABLING WHITELIST");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "whitelist on");
		sender.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.DARK_RED + "RESTARTING SERVER");
		Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "restart");
	}
		
		
	{
	// Calls the player
	Player player = (Player)sender;
	if(cmd.getName().equalsIgnoreCase("freeze"))
	{
		// Checks if no IGN is named in the command at time of execution.
		if(args.length == 0)
		{
			// Sends a message if no one is named.
			player.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.RED + "Please specify the Player's IGN you want to freeze.");
		}
		// Targets the Player.
		Player target = getServer().getPlayer(args[0]);
		// Checks if there is 1 argument (The Player)
		if(args.length == 1)
		{
			// This occurs if the Player happens to not exist or is not online at the time of execution
			if(target == null)
			{
			player.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.RED + "That user does not exist or is not online at this time.");
			return false;
			// If that person is online...
			} else
			{
				// This executes if the IGN is already in the list
				if(PlayerList.contains(target.getName()))
				{
					// Removes the player.
					PlayerList.remove(target.getName());
					// If (s)he is not in the list...
				} else
				{
					//Adds their name into the frozen list
					PlayerList.add(target.getName());
				}
			}
		}
	}
	
	
	return false;
	}

}

// Tells that there is an event here
	@EventHandler
	// Method for the player movement
	public void onPlayerMove(PlayerMoveEvent e)
	{
		//calls the player
		Player player = e.getPlayer();
		// Checks if the IGN is in the list
		if(PlayerList.contains(player.getName()))
		{
			//Cancels the movement of the player
			e.setCancelled(true);
			// Sends the player frozen a message
			player.sendMessage(ChatColor.GOLD + "Warrior> " + ChatColor.RED + "You've frozen. Do not log off or else you will be banned. You have 10 minutes to join an audio lounge at https://discord.gg/XSYWgaa");
		}
	}
	// the method for registering events
	public void registerEvents()
	{
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCommandPreprocess(PlayerCommandPreprocessEvent e, CommandSender sender, Command cmd, String label, String[] args) {
	              if (e.getMessage().equalsIgnoreCase("/plugins")) {
	            	  sender.sendMessage(ChatColor.WHITE + "Plugins (1): " + ChatColor.GREEN + "Warrior");
	                }
	}	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCommandPreprocess1(PlayerCommandPreprocessEvent e, CommandSender sender, Command cmd, String label, String[] args) {
	              if (e.getMessage().equalsIgnoreCase("/pl")) {
	            	  sender.sendMessage(ChatColor.WHITE + "Plugins (1): " + ChatColor.GREEN + "Warrior");
	                }
	}	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onCommandPreprocess2(PlayerCommandPreprocessEvent e, CommandSender sender, Command cmd, String label, String[] args) {
	              if (e.getMessage().equalsIgnoreCase("/version")) {
	            	  sender.sendMessage(ChatColor.WHITE + "Loading Version...");
	            	  sender.sendMessage(ChatColor.WHITE + "Warrior version 1.1 - The Security and Emergency Update.");
	                }
	}	
	
	
	
}

