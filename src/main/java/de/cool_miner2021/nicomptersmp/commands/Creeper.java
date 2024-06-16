package de.cool_miner2021.nicomptersmp.commands;

import de.cool_miner2021.nicomptersmp.NicompterSMP;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Creeper implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(args.length != 1){
            commandSender.sendMessage(NicompterSMP.prefix+"§cBenutzung /creeper [Spielername]");
            return false;
        }
        Player target = Bukkit.getPlayer(args[0]);
        if(target == null){
            commandSender.sendMessage(NicompterSMP.prefix+"§cDieser Spieler konnte nicht gefunden werden");
            return false;
        }
        target.playSound(target.getLocation(), Sound.ENTITY_CREEPER_PRIMED,3.0f,1.0f);
        commandSender.sendMessage(NicompterSMP.prefix+"§aCreeper Sound wurde erfolgreich bei §2"+target.getName()+"§a abgespielt");
        return true;
    }
}
