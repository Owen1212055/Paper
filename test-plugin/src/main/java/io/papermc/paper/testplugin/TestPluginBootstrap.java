package io.papermc.paper.testplugin;

import io.papermc.paper.plugin.PluginBootstrap;
import io.papermc.paper.registry.RegistryAccess;
import org.bukkit.Bukkit;

public class TestPluginBootstrap implements PluginBootstrap {
    @Override
    public void boostrap() {
        // TODO: Loggers? We could expose the provider logger? Idk a nice way tho
        System.out.println("HELLO FROM INITIALIZER");
        new NullPointerException().printStackTrace();
        RegistryAccess.getInstance();
        System.out.println(Bukkit.getServer());
    }
}
