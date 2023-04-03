package com.tohu.tohucommand;

import com.tohu.tohucommand.Commands.Tohu;
import org.bukkit.plugin.java.JavaPlugin;

public final class TohuCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("tohu").setExecutor(new Tohu());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
