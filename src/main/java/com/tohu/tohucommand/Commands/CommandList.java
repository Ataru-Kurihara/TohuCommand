package com.tohu.tohucommand.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class CommandList {
    public static void setCommandList(CommandSender sender) {
        sender.sendMessage("----------使えるコマンド----------");
        sender.sendMessage(ChatColor.YELLOW + "昼や夜に変える: " + ChatColor.WHITE + "/tohu time day/night");
        sender.sendMessage(ChatColor.YELLOW + "天気を晴れにする: " + ChatColor.WHITE + "/tohu weather clear");
        sender.sendMessage(ChatColor.YELLOW + "時間を固定(無効/有効): " + ChatColor.WHITE + "/tohu time <true/false>");
        sender.sendMessage(ChatColor.YELLOW + "天気を固定(無効/有効): " + ChatColor.WHITE + "/tohu weather <true/false>");
        sender.sendMessage(ChatColor.YELLOW + "Mobの湧き設定(有効/無効): " + ChatColor.WHITE + "/tohu mob <true/false>");
        sender.sendMessage(ChatColor.YELLOW + "mobたちをキルする: " + ChatColor.WHITE + "/tohu mob kill");
        sender.sendMessage(ChatColor.YELLOW + "ゲームモードの変更: " + ChatColor.WHITE + "/tohu gamemode <survival/creative/adventure/spectator>");
        sender.sendMessage(ChatColor.YELLOW + "人のゲームモードの変更: " + ChatColor.WHITE + "/tohu gamemode <survival/creative/adventure/spectator> [変えたい人の名前]");
        sender.sendMessage(ChatColor.YELLOW + "Worldの情報を確認する: " + ChatColor.WHITE + "/tohu world info");
        sender.sendMessage(ChatColor.YELLOW + "特定のユーザにチャットをする: " + ChatColor.WHITE + "/tohu chat [メッセージ] [プレイヤー名]");
        sender.sendMessage(ChatColor.YELLOW + "現在地をリスポーン地点に設定: " + ChatColor.WHITE + "/tohu set spawn");
        sender.sendMessage(ChatColor.YELLOW + "特定のプレイヤーにテレポートします: " + ChatColor.WHITE + "/tohu tp [プレイヤー名]");
        sender.sendMessage(ChatColor.YELLOW + "ワールド一覧を表示: " + ChatColor.WHITE + "/tohu world list");
        sender.sendMessage("--------------------------------");
    }
}
