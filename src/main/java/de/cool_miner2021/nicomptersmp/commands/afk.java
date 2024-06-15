package de.cool_miner2021.nicomptersmp.commands;

import net.kyori.adventure.text.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class afk implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player){
            Player p = ((Player) commandSender).getPlayer();
            if(p.getName() != p.getPlayerListName()){
                p.setPlayerListName(p.getName());
                p.sendMessage("§aDu bist nun nicht mehr als AFK markiert");
            }else{
                p.setPlayerListName("§c§oAFK §r"+p.getName());
                p.sendMessage("§aDu bist nun als AFK markiert");
            }
        }

        return false;
    }
}
