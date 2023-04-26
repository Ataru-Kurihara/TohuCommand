package com.tohu.tohucommand.Commands;

import org.bukkit.Location;

import java.util.Random;

public class SetArmorStandName {
    public static boolean setArmorStandName(Location[] loc, String name) {
        Random random = new Random();
        int rnd = random.nextInt(4);
        if (rnd == 0) {
            for (int i = 0; i < 5; i++) {
                loc[0].add(0, 0, 2);
            }
        }
        return true;
    }
}
