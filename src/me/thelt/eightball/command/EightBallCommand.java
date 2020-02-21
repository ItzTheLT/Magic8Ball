package me.thelt.eightball.command;

import java.util.Random;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import me.thelt.eightball.Main;
import me.thelt.eightball.utils.Utils;

public class EightBallCommand implements CommandExecutor{
	public Plugin plugin = Main.getPlugin(Main.class);
	String prefix = plugin.getConfig().getString("Prefix");
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(Utils.chat(plugin.getConfig().getString("Not-Player")));
		} else {
			Player p = (Player) sender;
			if (p.hasPermission("eightball.command")) {
				if (args.length == 0) {
					p.sendMessage(Utils.chat(prefix + plugin.getConfig().getString("Instruction")));
					String affirmative = plugin.getConfig().getString("Affirmative");
				    if (affirmative == "none") {
				    	
				    } else {
				    	p.sendMessage(Utils.chat(affirmative));
				    }
				    String noncommittal = plugin.getConfig().getString("Non-committal");
				    if (noncommittal == "none") {
				    	
				    } else {
				    	p.sendMessage(Utils.chat(noncommittal));
				    }
				    String negative = plugin.getConfig().getString("Negative");
				    if (negative == "none") {
				    	
				    } else {
				    	p.sendMessage(Utils.chat(negative));
				    }
				} else {
					Random rnd = new Random();
					int n = rnd.nextInt(20);
					if (n == 0) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.1")));
					} else if (n == 1) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.2")));
					} else if (n == 2) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.3")));
					} else if (n == 3) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.4")));
					} else if (n == 4) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.5")));
					} else if (n == 5) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.6")));
					} else if (n == 6) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.7")));
					} else if (n == 7) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.8")));
					} else if (n == 8) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.9")));
					} else if (n == 9) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Affirmative-answer.10")));
					} else if (n == 10) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Non-committal-answer.1")));
					} else if (n == 11) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Non-committal-answer.2")));
					} else if (n == 12) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Non-committal-answer.3")));
					} else if (n == 13) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Non-committal-answer.4")));
					} else if (n == 14) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Non-committal-answer.5")));
					} else if (n == 15) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Negative-answer.1")));
					} else if (n == 16) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Negative-answer.2")));
					} else if (n == 17) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Negative-answer.3")));
					} else if (n == 18) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Negative-answer.4")));
					} else if (n == 19) {
						p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("Negative-answer.5")));
					}
				}
			} else {
				p.sendMessage(Utils.chat(prefix + " " + plugin.getConfig().getString("No-Permission")));
			}
		}
		return false;
	}

}
