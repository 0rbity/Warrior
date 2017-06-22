package me.kryptocrash.WarriorCoreMcWARS;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Commands extends JavaPlugin{
public boolean OnCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	if(cmd.getName().equalsIgnoreCase("test")){
		sender.sendMessage("Hey there!");
	}
	return false;
}
}
