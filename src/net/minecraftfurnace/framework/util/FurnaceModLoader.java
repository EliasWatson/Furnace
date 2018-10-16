package net.minecraftfurnace.framework.util;

import java.io.File;

public class FurnaceModLoader {

    private static final String modFolderPath = "Furnace/mods/";

    public static void createModFolder() {
        new File(modFolderPath).mkdirs();
    }

    public static File[] findMods() {
        return new File(modFolderPath).listFiles((d, n) -> n.endsWith(".jar"));
    }
}
