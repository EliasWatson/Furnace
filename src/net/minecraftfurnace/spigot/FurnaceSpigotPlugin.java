package net.minecraftfurnace.spigot;

import net.minecraftfurnace.framework.Furnace;
import net.minecraftfurnace.framework.util.FurnaceModLoader;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class FurnaceSpigotPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Furnace.initMods();

        FurnaceModLoader.createModFolder();
        for(File f : FurnaceModLoader.findMods()) {
            System.out.println("[Furnace] Found mod: " + f.getName());
        }
    }

    @Override
    public void onDisable() {

    }
}
