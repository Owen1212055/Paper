package io.papermc.paper.testplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class TestPlugin extends JavaPlugin implements Listener {

    private final String key;

    public TestPlugin(String key) {
        this.key = key;
    }

    @Override
    public void onLoad() {
        this.getLogger().log(Level.INFO, "HELLO FROM onLoad!");
        this.getLogger().log(Level.INFO, "Secret bootstrap value: " + this.key);
    }

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
