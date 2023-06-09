package com.tohu.tohucommand.Commands;

import com.tohu.tohucommand.TohuCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.awt.*;
import java.io.File;

public class WorldCommand {
//    private static final Tohu plugin = Tohu.getPlugin(Tohu.class);
    private static final TohuCommand plugin = TohuCommand.getPlugin(TohuCommand.class);
    public static FileConfiguration spawnList = plugin.getConfig();
    public static boolean worldInfoCommand(String type, Player player) {
        if (type.equals("info")) {
            for (int i = 1; i<=4; i++) {
                player.performCommand("mv info " + i);
            }
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }
    public static boolean setSpawnLocationCommand(String type, Player player) {
        if (type.equals("spawn")) {
            player.performCommand("mv set spawn");
            player.sendMessage("座標: " + player.getLocation().getBlockX() + ", " + player.getLocation().getBlockY() + ", " + player.getLocation().getBlockZ() + "にリスポーン地点が設定されました");
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }

    public static boolean getWorldsName(String type, Player player) {
        if (type.equals("list")) {
            player.sendMessage("ワールド一覧");
            for (World world: Bukkit.getWorlds()) {
                player.sendMessage(world.getName());
            }
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }

}
