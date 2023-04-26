package com.tohu.tohucommand.Commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class HelpCommand {
    public static boolean helpCommand(String type, Player player) {
        if (type.equals("help")) {
            player.sendMessage("-------ここから下を先生に見せてね！---------");
            player.sendMessage("サーバー名: " + player.getServer().getServerName());
            player.sendMessage("ワールド名: " + player.getWorld().getName());
            player.sendMessage("座標: " + player.getLocation().toString());
            player.sendMessage("------------------------------------------");
            return true;
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }
}
