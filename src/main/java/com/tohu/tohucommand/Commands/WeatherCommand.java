package com.tohu.tohucommand.Commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class WeatherCommand {
    public static boolean weatherCommand(String type, Player player, World world) {
        if (type.equals("rain") || type.equals("thunder") || type.equals("clear") ) {
            player.performCommand("weather " + type);
//            Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(), "weather " + type);
            return true;
        }
         if (type.equals("true") || type.equals("false")) {
            world.setGameRuleValue("doWeatherCycle", type);
            if (type.equals("true")) {
                player.sendMessage("天気の固定を無効化しました");
            } if (type.equals("false")) {
                player.sendMessage("天気の固定を有効化しました");
            }
            return true;
        }
        else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }
}
