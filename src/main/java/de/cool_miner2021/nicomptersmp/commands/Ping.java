package de.cool_miner2021.nicomptersmp.commands;

import de.cool_miner2021.nicomptersmp.NicompterSMP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Ping implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (!(commandSender instanceof Player p)) {
            commandSender.sendMessage(NicompterSMP.prefix+"Dieser Befehl kann nur von Spielern ausgeführt werden");
            return false;
        }

        if(args.length == 0){
            p.sendMessage(NicompterSMP.prefix+"§aDein Ping beträgt §2" + p.getPing() + "ms");
        }else if(args.length == 1){
            if(!p.hasPermission("NicompterSMP.ping")){
                p.sendMessage(NicompterSMP.prefix+"§cDu hast keine Berechtigung den Ping anderer Spieler zu sehen");
                return false;
            }
            Player target = Bukkit.getPlayer(args[0]);
            if(target == null){
                p.sendMessage(NicompterSMP.prefix+"§cDieser Spieler ist nicht online");
                return false;
            }
            p.sendMessage(NicompterSMP.prefix+"§aDer Ping von §2"+target.getName()+"§a beträgt §2"+target.getPing()+"ms");
        }else {
            p.sendMessage(NicompterSMP.prefix+ "§cBenutzung /ping [Spielername]");
        }


        return true;
    }
}
