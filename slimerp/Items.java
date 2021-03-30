package info.itsthesky.SlimeRP.slimerp;

import info.itsthesky.SlimeRP.SlimeRP;
import info.itsthesky.SlimeRP.slimerp.items.IridiumIngot;
import info.itsthesky.SlimeRP.slimerp.items.SmallWitherFragment;
import info.itsthesky.SlimeRP.slimerp.items.TinyWitherFragment;
import info.itsthesky.SlimeRP.slimerp.items.WitherFragment;
import info.itsthesky.SlimeRP.slimerp.machine.Foundry;
import io.github.thebusybiscuit.cscorelib2.skull.SkullItem;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.setup.DefaultCategories;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.Slimefun;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;

public class Items {

    private SlimeRP INSTANCE = SlimeRP.getInstance();

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack(
            "FOUNDRY",
            Material.BLAST_FURNACE,
            "&cFoundry",
            "&7Permet de combiner", "&7plusieurs minerais en un seul."
    );

    public static final SlimefunItemStack CATERIUM_INGOT = new SlimefunItemStack(
            "CATERIUM_INGOT",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTVlZmU4NDEzM2Q4YjRjNDhiMWE4YzViNTc3ZDY5M2JkM2MwZDc2ZDMzMjE0YTRjZWYxNzIxNTcyYWI5ZjIyNCJ9fX0="),
            "&eCaterium Ingot",
            "&7Basé sur du cuivre, ce matériau", "&7peut se rendre très utile."
    );

    public static final SlimefunItemStack TINY_WITHER_FRAGMENT = new SlimefunItemStack(
            "TINY_WITHER_FRAGMENT",
            new ItemStack(Material.MELON_SEEDS),
            "&8Tiny Wither Fragment",
            "&7De minuscules fragments de wither skeleton."
    );

    public static final SlimefunItemStack SMALL_WITHER_FRAGMENT = new SlimefunItemStack(
            "SMALL_WITHER_FRAGMENT",
            new ItemStack(Material.BLACK_DYE),
            "&8&lSmall Wither Fragment",
            "&7De petits fragments de wither skeleton."
    );

    public static final SlimefunItemStack WITHER_FRAGMENT = new SlimefunItemStack(
            "WITHER_FRAGMENT",
            new ItemStack(Material.COAL),
            "&8&l&nWither Fragment",
            "&7Des fragments de wither skeleton."
    );

    public static final SlimefunItemStack CATERIUM_PLATE = new SlimefunItemStack(
            "CATERIUM_PLATE",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDVmYzg2YzYyODg3MDY2YjcyNTI5ODE3ODBmZjA0OGU1NmEyMGFjYWFhYzliYjc1YTAwOWE0NDg3MzYwYjEyYyJ9fX0="),
            "&eCaterium Plate",
            "&7Plaque plus solide", "&7que la normale."
    );

    public static final SlimefunItemStack STEEL_BEAM = new SlimefunItemStack(
            "STEEL_BEAM",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmYxNmQ1YTk2ZWZkNzA3ZTQ2NzRjMDc1NDZlM2NkMDJjM2YzZTRiYjhiNGYwNjc4YmFmOTcwMWQ4Yzk1MTY5YSJ9fX0="),
            "&8Poutre en Acier",
            "&7Solide et robuste, parfait", "&7pour des fondations."
    );

    public static final SlimefunItemStack CATERIUM_WIRE = new SlimefunItemStack(
            "CATERIUM_WIRE",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmI5YTRkZmNjNzE1M2MzMTc2ZGM4Y2YzODg4N2QyZDgzODU1NDVmYTRjNWY4YzJmZjEzZjlkNjllOThlOSJ9fX0="),
            "&eFil de Caterium",
            "&7Mieux que des fils en cuivres,", "&7permet une plus grosse", "&7résistance au magma."
    );

    public static final SlimefunItemStack CATERIUM_BLOCK = new SlimefunItemStack(
            "CATERIUM_BLOCK",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDExMzliM2VmMmU0YzQ0YTRjOTgzZjExNGNiZTk0OGQ4YWI1ZDRmODc5YTVjNjY1YmI4MjBlNzM4NmFjMmYifX19"),
            "&e&lBlock de Caterium",
            "&7L'un des blocs les plus", "&7solide du serveur :3"
    );

    public static final SlimefunItemStack IRIUM_INGOT = new SlimefunItemStack(
            "IRIUM_INGOT",
            SkullItem.fromBase64("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzBlMWRhNTg2OTU0MjFkNDU1OGI3NzIyYmQ5OWU4ZjU3MGFmNDcyYWIxMDdmNTQxOTM4ZGI1MDRkNjQ3MmQwYiJ9fX0="),
            "&4Minerais d'Irium",
            "&7Le meilleur minerais du serveur.",
            LoreBuilder.radioactive(Radioactivity.VERY_HIGH),
            LoreBuilder.HAZMAT_SUIT_REQUIRED
    );

    public Items() {

        // Caterium ingot
        ItemStack[] recipeCaterium = {
                new ItemStack(Material.GOLD_INGOT), SlimefunItems.COPPER_INGOT, new ItemStack(Material.GOLD_INGOT),
                null, null, null,
                null, null, null
        };
        new SlimefunItem(DefaultCategories.resources, CATERIUM_INGOT, Foundry.RECIPE_TYPE, recipeCaterium).register(INSTANCE);

        // Steel beam
        ItemStack[] recipeSteelBeam = {
                new ItemStack(Material.SAND), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SAND),
                SlimefunItems.STEEL_INGOT, SlimefunItems.STEEL_PLATE, SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.SAND), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SAND)
        };
        new SlimefunItem(DefaultCategories.resources, STEEL_BEAM, RecipeType.ENHANCED_CRAFTING_TABLE, recipeSteelBeam).register(INSTANCE);

        // Caterium Wire
        ItemStack[] recipeCateriumWire = {
                null, CATERIUM_INGOT, null,
                CATERIUM_INGOT, null, CATERIUM_INGOT,
                null, CATERIUM_INGOT, null
        };
        new SlimefunItem(DefaultCategories.resources, new SlimefunItemStack(CATERIUM_WIRE, 4), RecipeType.ENHANCED_CRAFTING_TABLE, recipeCateriumWire).register(INSTANCE);

        // Caterium Plate
        ItemStack[] recipeCateriumPlate = {
                null, null, null,
                CATERIUM_INGOT, CATERIUM_INGOT, CATERIUM_INGOT,
                null, null, null
        };
        new SlimefunItem(DefaultCategories.resources, new SlimefunItemStack(CATERIUM_PLATE, 2), RecipeType.ENHANCED_CRAFTING_TABLE, recipeCateriumPlate).register(INSTANCE);

        // Caterium Block
        ItemStack[] recipeCateriumBlock = {
                CATERIUM_WIRE, CATERIUM_WIRE, CATERIUM_WIRE,
                CATERIUM_PLATE, CATERIUM_INGOT, CATERIUM_PLATE,
                CATERIUM_WIRE, CATERIUM_WIRE, CATERIUM_WIRE
        };
        new SlimefunItem(DefaultCategories.resources, CATERIUM_BLOCK, RecipeType.ENHANCED_CRAFTING_TABLE, recipeCateriumBlock).register(INSTANCE);

        // Iridium Ingot
        ItemStack[] recipeIridiumIngot = {
                CATERIUM_BLOCK, STEEL_BEAM, CATERIUM_BLOCK,
                STEEL_BEAM, SlimefunItems.PLUTONIUM, STEEL_BEAM,
                CATERIUM_BLOCK, STEEL_BEAM, CATERIUM_BLOCK
        };
        new IridiumIngot(DefaultCategories.resources, IRIUM_INGOT, Foundry.RECIPE_TYPE, recipeIridiumIngot).register(INSTANCE);

        // Tiny Wither Fragment
        ItemStack[] recipe = {
                SlimefunItems.CARBON_CHUNK, SlimefunItems.CARBONADO, SlimefunItems.CARBON_CHUNK,
                SlimefunItems.CARBONADO, new ItemStack(Material.WHEAT_SEEDS), SlimefunItems.CARBONADO,
                SlimefunItems.CARBON_CHUNK, SlimefunItems.CARBONADO, SlimefunItems.CARBON_CHUNK
        };
        new TinyWitherFragment(Categories.getCategory("WITHER_MANAGING"), TINY_WITHER_FRAGMENT, RecipeType.MAGIC_WORKBENCH, recipe).register(INSTANCE);

        // Small Wither Fragment
        recipe = new ItemStack[] {
                TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT,
                TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT,
                TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT, TINY_WITHER_FRAGMENT
        };
        new SmallWitherFragment(Categories.getCategory("WITHER_MANAGING"), SMALL_WITHER_FRAGMENT, RecipeType.MAGIC_WORKBENCH, recipe).register(INSTANCE);

        // Wither Fragment
        recipe = new ItemStack[] {
                SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT,
                SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT,
                SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT, SMALL_WITHER_FRAGMENT
        };
        new WitherFragment(Categories.getCategory("WITHER_MANAGING"), WITHER_FRAGMENT, RecipeType.MAGIC_WORKBENCH, recipe).register(INSTANCE);

        // Wither Skeleton Head
        recipe = new ItemStack[] {
                WITHER_FRAGMENT, WITHER_FRAGMENT, WITHER_FRAGMENT,
                WITHER_FRAGMENT, new ItemStack(Material.SKELETON_SKULL), WITHER_FRAGMENT,
                WITHER_FRAGMENT, WITHER_FRAGMENT, WITHER_FRAGMENT
        };
        RecipeType.ENHANCED_CRAFTING_TABLE.register(recipe, new ItemStack(Material.WITHER_SKELETON_SKULL));

    }

}
