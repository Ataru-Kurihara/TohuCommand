package com.tohu.tohucommand.Commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.*;

public class MobCommand {
    public static boolean mobCommand(String type, Player player, World world) {
        if (type.equals("kill")) {
            for (Entity e: world.getEntities()) {
                if (e instanceof Monster) {
                    ((Monster) e).setHealth(0);
                    player.sendMessage(e.getName() + " をキルしました");
                }
                else if (e instanceof Animals) {
                    ((Animals) e).setHealth(0);
                    player.sendMessage(e.getName() + " をキルしました");
                } else if (e instanceof Slime) {
                    ((Slime) e).setHealth(0);
                    player.sendMessage(e.getName() + " をキルしました");

                }
            }
            return true;
        } if (type.equals("true") || type.equals("false")) {
            world.setGameRuleValue("doMobSpawning", type);
            if (type.equals("true")) {
                player.sendMessage("Mobが発生するようになりました");
            } else {
                player.sendMessage("Mobが発生しないようになりました");
            }
            return true;
        }else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }
}
