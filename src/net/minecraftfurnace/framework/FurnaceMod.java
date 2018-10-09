package net.minecraftfurnace.framework;

public abstract class FurnaceMod {

    public String modName;
    public String uid;

    public abstract void init();

    public void destroy() {}
}
