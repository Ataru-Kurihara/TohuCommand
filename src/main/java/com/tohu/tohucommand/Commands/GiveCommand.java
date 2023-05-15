package com.tohu.tohucommand.Commands;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GiveCommand {
    public static boolean giveCommand(String type, Player player, String item) {
        if (type.equals("give")) {
            Material material = Material.getMaterial(item);
            ItemStack itemStack = new ItemStack(material);
            Inventory inventory = player.getInventory();
            player.getInventory().setItem(inventory.firstEmpty(), itemStack);
            return true;

        } else {
            player.sendMessage("コマンドが間違えてるよ");
            return false;
        }
    }
}
