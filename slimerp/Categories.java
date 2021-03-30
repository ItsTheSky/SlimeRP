package info.itsthesky.SlimeRP.slimerp;

import info.itsthesky.SlimeRP.SlimeRP;
import io.github.thebusybiscuit.cscorelib2.item.CustomItem;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.implementation.setup.DefaultCategories;
import me.mrCookieSlime.Slimefun.Objects.Category;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class Categories {

    private final SlimeRP instance;
    private final static HashMap<String, Category> categories = new HashMap<>();
    public static Category getCategory(String id) {
        return categories.get(id);
    }

    public Categories(SlimeRP instance) {
        this.instance = instance;
    }

    public void registerCategories() {


        NamespacedKey categoryId = new NamespacedKey(instance, "WITHER_MANAGING");
        CustomItem categoryItem = new CustomItem(new ItemStack(Material.WITHER_SKELETON_SKULL), "&8Wither Managing");
        Category category = new Category(categoryId, categoryItem);
        categories.put(categoryId.getKey().toUpperCase(), category);
        category.register(instance);

    }

}
