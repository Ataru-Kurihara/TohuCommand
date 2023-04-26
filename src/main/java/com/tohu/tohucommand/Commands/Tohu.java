package com.tohu.tohucommand.Commands;

import com.tohu.tohucommand.TohuCommand;
import com.tohu.tohucommand.Utils.PermissionUtils;
import com.tohu.tohucommand.Utils.PlayerUtils;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tohu implements CommandExecutor {
    private static final TohuCommand plugin = TohuCommand.getPlugin(TohuCommand.class);
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        World world = player.getWorld();
        if (command.getName().equalsIgnoreCase("tohu")) {
            if (args.length == 0) {
                CommandList.setCommandList(sender);
            } else {
                if (PermissionUtils.getPermissionGroup(player).equals("admin") || PermissionUtils.getPermissionGroup(player).equals("owner")) {
                    if (args[0].equals("weather")) return WeatherCommand.weatherCommand(args[1], player, world);
                    if (args[0].equals("permission")) return PermissionCommand.permissionCommand(args[1], player, world);
                    if (args[0].equals("time")) return TimeCommand.timeCommand(args[1], player, world);
                    if (args[0].equals("mob")) return MobCommand.mobCommand(args[1], player, world);
                    if (args.length == 2) {
                        if (args[0].equals("gamemode")) return GameModeCommand.gameModeCommand(args[1], player, plugin);
                    }
                    if (args.length == 3) {
                        if (args[0].equals("gamemode")) return GameModeCommand.gameModeToPlayerCommand(args[1], args[2], player);
                    }
                    if (args[0].equals("world")) {
                        if (args[1].equals("info")) return WorldCommand.worldInfoCommand(args[1], player);
                        if (args[1].equals("list")) return WorldCommand.getWorldsName(args[1], player);
                    }
                    if (args[0].equals("login")) return LoginCommand.loginCommand(args[1], player);
                    if (args[0].equals("chat")) return ChatCommand.chatCommand(args[1], args[2], player);
                    if (args[0].equals("set")) return WorldCommand.setSpawnLocationCommand(args[1], player);
                    if (args[0].equals("tp")) return TeleportCommand.teleportCommand(args[0], player, args[1]);
                    else player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
                }else if (PermissionUtils.getPermissionGroup(player).equals("moderator") || PermissionUtils.getPermissionGroup(player).equals("user")) {
                    if (args[0].equals("login")) return LoginCommand.loginCommand(args[1], player);
                    if (args[0].equals("chat")) return ChatCommand.chatCommand(args[1], args[2], player);
                    if (args[0].equals("tp")) return TeleportCommand.teleportCommand(args[0], player, args[1]);
                } else {
                    player.sendMessage(ChatColor.RED + "権限がないよ");
                }
            }
        } else {
            player.sendMessage(ChatColor.RED + "!!!" + ChatColor.WHITE + "コマンドが間違えてるよ" + ChatColor.RED + "!!!");
        }
        return false;
    }
}
