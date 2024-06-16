package de.cool_miner2021.nicomptersmp;

import de.cool_miner2021.nicomptersmp.commands.Afk;
import de.cool_miner2021.nicomptersmp.commands.Creeper;
import de.cool_miner2021.nicomptersmp.commands.Ping;
import de.cool_miner2021.nicomptersmp.listerners.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class NicompterSMP extends JavaPlugin {

    public static String prefix = "§x§F§B§0§0§0§0[§x§F§D§2§A§0§BN§x§F§E§5§4§1§6i§x§F§B§7§E§1§Ac§x§F§3§A§A§1§1o§x§E§A§D§5§0§9m§x§B§5§E§3§1§5p§x§7§5§E§A§2§5t§x§3§E§E§0§3§Ee§x§2§7§9§3§7§6r§x§1§1§4§6§A§FS§x§4§1§1§E§D§0M§x§A§0§0§F§E§3P§x§F§F§0§0§F§6]§r ";

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("afk")).setExecutor(new Afk());
        Objects.requireNonNull(getCommand("ping")).setExecutor(new Ping());
        Objects.requireNonNull(getCommand("creeper")).setExecutor(new Creeper());
        Bukkit.getLogger().info("NicompterSMP Plugin enabled successfully");
        getServer().getPluginManager().registerEvents(new JoinListener(), this);

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("NicompterSMP Plugin disabled");
    }
}
