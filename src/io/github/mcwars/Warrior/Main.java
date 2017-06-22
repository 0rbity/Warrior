package io.github.mcwars.Warrior;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

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

	
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	if(cmd.getName().equalsIgnoreCase("devs")){
		// Lists Warrior devs. You rock!
		sender.sendMessage(ChatColor.GOLD + "Warrior Developers: " + ChatColor.DARK_RED + "RainDropInMC, Whimpers, Orbity, AtomicRift, OrganicCuber.");
	}
	
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
	
	
}

