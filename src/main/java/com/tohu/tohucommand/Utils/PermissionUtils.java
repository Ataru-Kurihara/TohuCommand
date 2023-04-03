package com.tohu.tohucommand.Utils;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.user.User;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.List;

public class PermissionUtils {
    public static String getPermissionGroup(Player player) {
        List<World> worlds = Bukkit.getServer().getWorlds();
        LuckPerms api = LuckPermsProvider.get();
        User user = null;
        user = api.getUserManager().getUser(player.getUniqueId());
        assert user != null;
        return user.getPrimaryGroup();
    }
    public static void setUserGroup(Player player) {
        player.performCommand("lp user "+player.getName()+" parent remove " + PermissionUtils.getPermissionGroup(player));
        player.sendMessage("remove permission");
    }
    public static void setPermissionGroup(Player player, String group) {
        player.performCommand("lp user " + player.getName() + " parent set " + group);
        player.sendMessage("set permission!");
    }

    public static void createPermissionGroup(Player player) {
        player.performCommand("lp creategroup " + "グループ名");
    }
    public static void setPermission(Player player, String permission, String group) {
        player.performCommand("lp group " + group + " permission set " + permission);
    }
}
