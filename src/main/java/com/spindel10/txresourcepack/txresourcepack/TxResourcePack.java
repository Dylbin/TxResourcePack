package com.spindel10.txresourcepack.txresourcepack;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class TxResourcePack extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(command.getName().equals("txresourcepack")) {
            if(sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.GOLD + "https://github.com/dylbinthedev/0txPack/releases");
            }else{
                System.out.println("You need to be a player to use this command!");
            }
        }

        return false;
    }
}
