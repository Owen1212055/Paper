package io.papermc.paper.testplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        try {
            System.out.println(Class.forName("com.owen1212055.particlehelper.api.ParticleHelper"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
