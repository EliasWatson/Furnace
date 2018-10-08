package net.minecraftfurnace.crafting;

public class CraftingRecipe {

    public CraftingShape shape;
    public String[] recipe;

    /// CONSTRUCTORS
    public CraftingRecipe(CraftingShape shape, String[] recipe) {
        this.shape = shape;
        this.recipe = recipe;
    }

    public CraftingRecipe(String[] recipe) {
        this.recipe = recipe;
    }

    public CraftingRecipe(CraftingShape shape) {
        this.shape = shape;
    }

    /// SETTERS (Chainable)
    public CraftingRecipe setShape(CraftingShape shape) {
        this.shape = shape;
        return this;
    }

    public CraftingRecipe setRecipe(String[] recipe) {
        this.recipe = recipe;
        return this;
    }
}
