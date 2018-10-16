package net.minecraftfurnace.framework.util;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;

public class FurnaceModLoader {

    private static final String modFolderPath = "Furnace/mods/";

    public static void createModFolder() {
        new File(modFolderPath).mkdirs();
    }

    public static File[] findMods() {
        return new File(modFolderPath).listFiles((d, n) -> n.endsWith(".jar"));
    }

    public static boolean validateMod(String fileName) {
        try {
            URL jarURL = new URL("jar:file:" + modFolderPath + fileName + "!/mod.yml");
            JarURLConnection conn = (JarURLConnection) jarURL.openConnection();
            return conn.getInputStream() != null;

        } catch (IOException e) {
//            System.err.println("[Furnace] " + fileName + " - " + e.getMessage());
            return false;
        }
    }
}
