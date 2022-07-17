package io.papermc.testplugin;

import io.papermc.paper.plugin.bootstrap.PluginBootstrap;
import io.papermc.paper.plugin.bootstrap.PluginBootstrapContext;
import io.papermc.paper.registry.RegistryAccess;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestPluginBootstrap implements PluginBootstrap {

    public String secret;

    @Override
    public void boostrap(@NotNull PluginBootstrapContext context) {
        Logger logger = context.getLogger();

        logger.log(Level.INFO, "Hello from Initializer! :) This runs before the server start, that's cool!");
        logger.log(Level.INFO, "Bukkit.getServer() is null since the server doesn't exist yet!");

        logger.log(Level.SEVERE, "Cool initializer error for showing stacktrace only.", new AssertionError());
        RegistryAccess.getInstance();
        this.secret = "HI";
    }

    @Override
    public @NotNull JavaPlugin createPlugin(@NotNull PluginBootstrapContext context) {
        return new TestPlugin(this.secret);
    }
}
