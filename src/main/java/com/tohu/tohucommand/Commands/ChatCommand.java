package com.tohu.tohucommand.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatCommand {
    public static boolean chatCommand(String type, String playerName, Player player) {
        if (type != null && playerName.equals(Bukkit.getPlayer(playerName).getName())) {
            Player toPlayer = Bukkit.getPlayer(playerName).getPlayer();
            toPlayer.sendMessage(ChatColor.BLUE +"From " + ChatColor.BLUE +player.getName() + ChatColor.BLUE + ": " + ChatColor.WHITE + type);
            return true;
        }
        if (!playerName.equals(Bukkit.getPlayer(playerName).getName())) {
            player.sendMessage("プレイヤー名を間違えてるよ");
        }else {
            player.sendMessage("コマンドが間違えてるよ");
        }
        return false;
    }
}
