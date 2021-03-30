package info.itsthesky.SlimeRP.slimerp.cmd;

import info.itsthesky.SlimeRP.slimerp.objects.Utils;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.concurrent.atomic.AtomicReference;

public class Craft implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof ConsoleCommandSender) return false;
        Player player = (Player) sender;
        if (
                player.getInventory().getItemInMainHand().getType().equals(Material.AIR)
        ) {
            if (args.length == 0) {
                player.sendMessage(Utils.colored("&4&l» &cVous devez tenir dans vos main ou ajouter l'ID de l'object voulu!"));
                return false;
            }
        }
        String id = Utils.join("_", args).toUpperCase();

        if (!PlayerProfile.find(player).isPresent()) {
            player.sendMessage(Utils.colored("&4&l» &cErreur interne, impossible de charger vos donnés!"));
            return false;
        }

        if (player.getInventory().getItemInMainHand().getType().equals(Material.AIR)) {
            AtomicReference<SlimefunItem> sfItem = new AtomicReference<>();
            SlimefunPlugin.getRegistry().getSlimefunItemIds().forEach((key, item) -> {
                if (id.replace(" ", "_").equalsIgnoreCase(key)) {
                    sfItem.set(item);
                }
            });
            PlayerProfile profile = PlayerProfile.find(player).get();
            if (sfItem.get() == null) {
                player.sendMessage(Utils.colored("&4&l» &cImpossible de trouver un item avec l'ID '"+id+"'!"));
                return false;
            }
            SlimefunGuide.displayItem(profile, sfItem.get(), true);
        } else {
            AtomicReference<SlimefunItem> sfItem = new AtomicReference<>();
            SlimefunPlugin.getRegistry().getSlimefunItemIds().forEach((key, item) -> {
                if (item.getItem().equals(player.getInventory().getItemInMainHand())) {
                    sfItem.set(item);
                }
            });
            PlayerProfile profile = PlayerProfile.find(player).get();
            if (sfItem.get() == null) {
                player.sendMessage(Utils.colored("&4&l» &cL'item que vous tenez dans la main ne viens pas de SlimeFun!"));
                return false;
            }
            SlimefunGuide.displayItem(profile, player.getInventory().getItemInMainHand(), true);
        }
        return true;
    }
}
