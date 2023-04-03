package com.tohu.tohucommand.Commands;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TeleportCommand {
    public static boolean teleportCommand(String type, Player player, String playerName) {
        if (type.equals("tp")) {
            if (!player.getWorld().getPlayers().contains(Bukkit.getPlayer(playerName))) {
                player.sendMessage("プレイヤー名が正しくありません");
                return false;
            } else {
                player.teleport(Bukkit.getPlayer(playerName).getLocation());
                player.sendMessage(playerName + "にテレポートします");
                return true;
            }
        }
        return false;
    }
}
