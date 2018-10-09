package net.minecraftfurnace.framework;

import net.minecraftfurnace.framework.manager.CraftingManager;

import java.util.HashMap;
import java.util.Map;

public class Furnace {

    private static Map<String, FurnaceMod> mods = new HashMap<>();

    public static CraftingManager craftingManager;

    public static void registerMod(FurnaceMod mod) {
        mods.put(mod.uid, mod);
    }

    public static void initMods() {
        for(FurnaceMod m : mods.values()) {
            m.init();
        }
    }

    public static void destroyMods() {
        for(FurnaceMod m : mods.values()) {
            m.destroy();
        }
    }
}
