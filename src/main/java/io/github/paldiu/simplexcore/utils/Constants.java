package io.github.paldiu.simplexcore.utils;

import io.github.paldiu.simplexcore.SimplexCore;
import io.github.paldiu.simplexcore.command.CommandLoader;
import io.github.paldiu.simplexcore.plugin.AddonRegistry;
import org.bukkit.Server;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.logging.Logger;

public final class Constants {
    private static final SimplexCore plugin = JavaPlugin.getPlugin(SimplexCore.class);
    private static final Server server = plugin.getServer();
    private static final Logger logger = plugin.getLogger();
    private static final PluginManager manager = server.getPluginManager();
    private static final BukkitScheduler scheduler = server.getScheduler();

    public static SimplexCore getPlugin() {
        return plugin;
    }

    public static Server getServer() {
        return server;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static PluginManager getManager() {
        return manager;
    }

    public static BukkitScheduler getScheduler() {
        return scheduler;
    }

    public static AddonRegistry getRegistry() {
        return AddonRegistry.getInstance();
    }

    public static CommandLoader getCommandLoader() {
        return CommandLoader.getInstance();
    }
}