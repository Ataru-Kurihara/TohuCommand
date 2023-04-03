package com.tohu.tohucommand.Utils;

import com.tohu.tohucommand.TohuCommand;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class PlayerUtils {
    public static void setGameMode(TohuCommand plugin, Player player, GameMode gameMode) {
        Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {
            @Override
            public void run() {
                player.setGameMode(gameMode);
            }
        }, 20L);
    }
}
