package me.thelt.eightball;

import org.bukkit.plugin.java.JavaPlugin;

import me.thelt.eightball.command.EightBallCommand;

public class Main extends JavaPlugin{
	public void onEnable() {
		loadConfig();
		getCommand("8ball").setExecutor(new EightBallCommand());
		
	}
	
	private void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}

	public void onDisable() {
		
	}

}
