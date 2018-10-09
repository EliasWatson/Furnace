package net.minecraftfurnace.spigot.manager;

import net.minecraftfurnace.framework.crafting.CraftingShape;
import net.minecraftfurnace.framework.crafting.WorkbenchRecipe;
import net.minecraftfurnace.framework.manager.CraftingManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.HashMap;
import java.util.Map;

public class SpigotCraftingManager implements CraftingManager {

    @Override
    public void register(WorkbenchRecipe workbenchRecipe) {
        // TODO: Support mod items
        NamespacedKey key = new NamespacedKey(NamespacedKey.MINECRAFT, workbenchRecipe.result);
        ItemStack item = new ItemStack(Material.getMaterial(workbenchRecipe.result));
        Recipe recipe;

        // Generate Key-Values & Recipe Strings
        Map<Material, Character> ingredients = new HashMap<>();
        String stringRecipe[] = new String[3];
        int recipeStringPos = 0;

        for(String ingredient : workbenchRecipe.recipe) {
            Material material = Material.getMaterial(ingredient);
            if(!ingredients.containsKey(material)) {
                ingredients.put(material, ("" + ingredients.size()).charAt(0));
            }

            char id = ingredients.get(material);
            stringRecipe[recipeStringPos++ / 3] += id;
        }

        // Generate Recipe Object
        switch (workbenchRecipe.shape) {
            case SHAPED:
                ShapedRecipe shapedRecipe = new ShapedRecipe(key, item);
                shapedRecipe.shape(stringRecipe);
                ingredients.forEach((material, charID) -> shapedRecipe.setIngredient(charID, material));
                recipe = shapedRecipe;
                break;

            case SHAPELESS:
                ShapelessRecipe shapelessRecipe = new ShapelessRecipe(key, item);
                // TODO
                recipe = shapelessRecipe;
                break;

            default:
                return;
        }

        Bukkit.addRecipe(recipe);
    }
}
