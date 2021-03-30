package info.itsthesky.SlimeRP.slimerp.machine;

import info.itsthesky.SlimeRP.slimerp.Items;
import info.itsthesky.SlimeRP.SlimeRP;
import io.github.thebusybiscuit.slimefun4.implementation.setup.DefaultCategories;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

public class Foundry extends CraftingMultiBlock {

    public static final RecipeType RECIPE_TYPE = new RecipeType(
            new NamespacedKey(SlimeRP.getInstance(), "foundry"),
            Items.FOUNDRY,
            "&7Permet de combiner", "&7plusieurs minerais en un seul."
    );

    private static final ItemStack dispenser = new ItemStack(Material.DISPENSER);
    private static final ItemStack crying = new ItemStack(Material.CRYING_OBSIDIAN);
    private static final ItemStack table = new ItemStack(Material.CRAFTING_TABLE);
    private static final ItemStack ironbars = new ItemStack(Material.IRON_BARS);

    public Foundry() {
        super(DefaultCategories.basicMachines, Items.FOUNDRY, new ItemStack[] {
                null, table, null,
                crying, dispenser, crying,
                ironbars, null, ironbars
        }, new ItemStack[0], BlockFace.DOWN);
    }

}
