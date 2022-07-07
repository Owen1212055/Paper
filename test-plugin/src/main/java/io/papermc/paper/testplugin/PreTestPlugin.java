package io.papermc.paper.testplugin;

import io.papermc.paper.plugin.Initializer;
import io.papermc.paper.registry.RegistryAccess;
import org.bukkit.Bukkit;

public class PreTestPlugin implements Initializer {
    @Override
    public void initialize() {
        // TODO: Loggers? We could expose the provider logger? Idk a nice way tho
        System.out.println("HELLO FROM INITIALIZER");
        new NullPointerException().printStackTrace();
        RegistryAccess.getInstance();
        System.out.println(Bukkit.getServer());
    }
}
