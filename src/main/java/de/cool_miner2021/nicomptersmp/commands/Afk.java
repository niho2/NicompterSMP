package de.cool_miner2021.nicomptersmp.commands;

import de.cool_miner2021.nicomptersmp.NicompterSMP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Afk implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player){
            Player p = ((Player) commandSender).getPlayer();
            if(!Objects.requireNonNull(p).getName().equals(p.getPlayerListName())){
                p.setPlayerListName(p.getName());
                p.sendMessage(NicompterSMP.prefix +"§aDu bist nun nicht mehr als AFK markiert");
            }else{
                p.setPlayerListName("§c§o[AFK] §r"+p.getName());
                p.sendMessage(NicompterSMP.prefix+"§aDu bist nun als AFK markiert");
            }
        }

        return false;
    }
}
