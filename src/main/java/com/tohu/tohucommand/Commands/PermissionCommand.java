package com.tohu.tohucommand.Commands;

import com.tohu.tohucommand.Utils.PermissionUtils;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class PermissionCommand {
    public static boolean permissionCommand(String type, Player player, World world) {
        if (type.equals("group")) {
            player.sendMessage("あなたの権限グループは、"+ PermissionUtils.getPermissionGroup(player));
            return true;
        }else {
            player.sendMessage("コマンドを間違えてるよ");
            return false;
        }
    }
}
