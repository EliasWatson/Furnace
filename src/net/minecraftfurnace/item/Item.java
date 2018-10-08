package net.minecraftfurnace.item;

public class Item {

    public String uid;
    public String displayName;
    public String textureName;

    /// CONSTRUCTORS
    public Item(String uid) {
        this.uid = uid;
    }

    public Item(String uid, String displayName) {
        this.uid = uid;
        this.displayName = displayName;
    }

    public Item(String uid, String displayName, String textureName) {
        this.uid = uid;
        this.displayName = displayName;
        this.textureName = textureName;
    }

    /// SETTERS (Chainable)
    public Item setUID(String uid) {
        this.uid = uid;
        return this;
    }

    public Item setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public Item setTextureName(String textureName) {
        this.textureName = textureName;
        return this;
    }
}
