package com.tohu.tohucommand.Commands;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class TimeCommand {
    public static boolean timeCommand(String type, Player player, World world) {
        switch (type) {
            case "day":
                world.setTime(0);
                player.sendMessage("時間を朝にします");
                return true;
            case "night":
                world.setTime(13000);
                player.sendMessage("時間を夜にします");
                return true;
            case "true":
                world.setGameRuleValue("doDaylightCycle", type);
                player.sendMessage("時間の固定を無効化しました");
                return true;
            case "false":
                world.setGameRuleValue("doDaylightCycle", type);
                player.sendMessage("時間の固定を有効化しました");
                return true;
            default:
                player.sendMessage("コマンドを間違えてるよ");
                return false;
        }
    }

}
