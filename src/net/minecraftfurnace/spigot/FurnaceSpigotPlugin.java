package net.minecraftfurnace.spigot;

import net.minecraftfurnace.framework.Furnace;
import org.bukkit.plugin.java.JavaPlugin;

public class FurnaceSpigotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        Furnace.initMods();
    }

    @Override
    public void onDisable() {

    }
}
