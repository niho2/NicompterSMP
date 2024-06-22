package de.cool_miner2021.nicomptersmp.commands;

import de.cool_miner2021.nicomptersmp.NicompterSMP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Location implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if(args.length<1){
            commandSender.sendMessage(NicompterSMP.prefix+"$cBenutzung /location [Spielername]");
            return false;
        }
        if(args.length==1){
            if (Bukkit.getPlayer(args[0]) == null){
                commandSender.sendMessage(NicompterSMP.prefix+"§cDieser Spieler ist nicht online");
                return false;
            }
            Player targetPlayer = Bukkit.getPlayer(args[0]);
            assert targetPlayer != null;
            String worldDisplayName = switch (targetPlayer.getWorld().getName()){
                case "world" -> "§2in der Overworld";
                case "world_nether" -> "§2im Nether";
                case "world_the_end" -> "§2im End";
                default -> "in der Welt §2" + targetPlayer.getWorld().getName();
            };
            commandSender.sendMessage(NicompterSMP.prefix+"§2"+targetPlayer.getName()+" §abefindet sich "+worldDisplayName+" §abei den Koordinaten §2"+(int) targetPlayer.getLocation().getX()+" "+(int) targetPlayer.getLocation().getY()+" "+(int) targetPlayer.getLocation().getZ());
            return true;
        }
        return false;
    }
}
