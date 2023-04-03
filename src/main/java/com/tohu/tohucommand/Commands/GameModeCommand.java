package com.tohu.tohucommand.Commands;

import com.tohu.tohucommand.TohuCommand;
import com.tohu.tohucommand.Utils.PlayerUtils;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public class GameModeCommand {
    public static boolean gameModeCommand(String type, Player player, TohuCommand plugin) {
        if (type.equals("survival") || type.equals("creative") || type.equals("adventure") || type.equals("spectator")) {
            GameMode gameMode = GameMode.valueOf(type.toUpperCase());
            player.setGameMode(gameMode);
            PlayerUtils.setGameMode(plugin, player, gameMode);
            if (type.equals("survival")) player.sendMessage("ゲームモードをサバイバルに変更しました");
            if (type.equals("creative")) player.sendMessage("ゲームモードをクリエイティブに変更しました");
            if (type.equals("adventure")) player.sendMessage("ゲームモードをアドベンチャーに変更しました");
            if (type.equals("spectator")) player.sendMessage("ゲームモードをスペクテイターに変更しました");
            return true;
        }else {
            player.sendMessage("コマンドが間違えてるよ");
            return false;
        }
    }

    public static boolean gameModeToPlayerCommand(String type, String playerName, Player player) {
        if (type.equals("survival") || type.equals("creative") || type.equals("adventure") || type.equals("spectator")) {
            GameMode gameMode = GameMode.valueOf(type.toUpperCase());
            Player receivePlayer = Bukkit.getPlayer(playerName).getPlayer();
            if (player.getWorld().getName().equals(receivePlayer.getWorld().getName())) {
                receivePlayer.setGameMode(gameMode);
                if (type.equals("survival")) receivePlayer.sendMessage(player.getName()+"にゲームモードをサバイバルに変更されました");
                if (type.equals("creative")) receivePlayer.sendMessage(player.getName()+"にゲームモードをクリエイティブに変更されました");
                if (type.equals("adventure")) receivePlayer.sendMessage(player.getName()+"にゲームモードをアドベンチャーに変更されました");
                if (type.equals("spectator")) receivePlayer.sendMessage(player.getName()+"にゲームモードをスペクテイターに変更されました");
                return true;
            }
            return true;
        } else {
            player.sendMessage("コマンドを間違えてるよ");
            return false;
        }
    }
}
