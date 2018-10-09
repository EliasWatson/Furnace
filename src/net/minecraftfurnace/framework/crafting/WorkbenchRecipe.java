package net.minecraftfurnace.framework.crafting;

public class WorkbenchRecipe {

    public CraftingShape shape;
    public String[] recipe;
    public String result;
    public int resultAmount;

    /// SETTERS (Chainable)
    public WorkbenchRecipe setShape(CraftingShape shape) {
        this.shape = shape;
        return this;
    }

    public WorkbenchRecipe setRecipe(String[] recipe) {
        this.recipe = recipe;
        return this;
    }

    public WorkbenchRecipe setResult(String result) {
        this.result = result;
        return this;
    }

    public WorkbenchRecipe setResultAmount(int resultAmount) {
        this.resultAmount = resultAmount;
        return this;
    }
}
