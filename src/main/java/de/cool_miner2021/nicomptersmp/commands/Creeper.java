package de.cool_miner2021.nicomptersmp.commands;

import de.cool_miner2021.nicomptersmp.NicompterSMP;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

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

        // Generate a unique replay name based on the current time and player's name
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String replayName = "CR_" + target.getName() + "_" + timestamp;

        // Start recording 1 second before playing the sound
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "replay start " + replayName + ":10 " + target.getName());

        // Schedule the sound to be played after 1 second (20 ticks)
        Bukkit.getScheduler().runTaskLater(NicompterSMP.getPlugin(NicompterSMP.class), () -> {
            Location location = target.getLocation();
            target.playSound(location, Sound.ENTITY_CREEPER_PRIMED, 3.0f, 1.0f);

        }, 20L); // 1 second delay before playing the sound



        // target.playSound(target.getLocation(), Sound.ENTITY_CREEPER_PRIMED,3.0f,1.0f);
        commandSender.sendMessage(NicompterSMP.prefix+"§aCreeper Sound wurde erfolgreich bei §2"+target.getName()+"§a abgespielt");
        return true;
    }
}
