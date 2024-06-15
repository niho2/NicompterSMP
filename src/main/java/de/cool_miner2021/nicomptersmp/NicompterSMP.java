package de.cool_miner2021.nicomptersmp;

import de.cool_miner2021.nicomptersmp.commands.afk;
import de.cool_miner2021.nicomptersmp.listerners.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class NicompterSMP extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("afk")).setExecutor(new afk());
        Bukkit.getLogger().info("NicompterSMP Plugin enabled successfully");
        getServer().getPluginManager().registerEvents(new JoinListener(), this);

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("NicompterSMP Plugin disabled");
    }
}
