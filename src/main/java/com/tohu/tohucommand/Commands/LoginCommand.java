package com.tohu.tohucommand.Commands;

import com.tohu.tohucommand.Utils.PermissionUtils;
import com.tohu.tohucommand.Utils.TohuUseUtils;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class LoginCommand {
    // ログイン
    public static boolean loginCommand(String type, Player player) {
        if (type != null) {
            String url = "https://tohu-mc-backend-prod-ibldvcwaka-an.a.run.app/api/auth?auth_code="+type;
            if (TohuUseUtils.getAuthenticated(url)) {
                player.sendTitle(TohuUseUtils.getUserName(url) + "さん、ようこそ！", "権限が"+TohuUseUtils.getRole(url)+"に設定されました", 20, 40 ,20);
                if (TohuUseUtils.getRole(url).equals("admin")) {
                    PermissionUtils.setPermissionGroup(player, TohuUseUtils.getRole(url));
                    return true;
                } else if (TohuUseUtils.getRole(url).equals("owner")) {
                    PermissionUtils.setPermissionGroup(player, TohuUseUtils.getRole(url));
                    return true;
                } else if (TohuUseUtils.getRole(url).equals("moderator"))  {
                    PermissionUtils.setPermissionGroup(player, TohuUseUtils.getRole(url));
                    return true;
                } else if (TohuUseUtils.getRole(url).equals("user")) {
                    PermissionUtils.setPermissionGroup(player, TohuUseUtils.getRole(url));
                    return true;
                } else {
                    player.sendMessage("情報がうまく入手出来ませんでした");
                    return false;
                }
            } else {
                player.sendMessage("情報がうまく入手出来ませんでした");
                return false;
            }
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
            return false;
        }
    }
}
