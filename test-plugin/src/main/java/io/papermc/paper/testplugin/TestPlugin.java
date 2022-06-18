package io.papermc.paper.testplugin;

import io.papermc.paper.world.damagesource.DamageSource;
import io.papermc.paper.world.damagesource.EntityDamageSource;
import io.papermc.paper.world.damagesource.StaticDamageSource;
import org.bukkit.Material;
import org.bukkit.entity.Axolotl;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestPlugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onSwap(PlayerSwapHandItemsEvent event) {
        LivingEntity target = (LivingEntity) event.getPlayer().getTargetEntity(5);
        if (event.getPlayer().getInventory().contains(Material.DIAMOND)) {
            target.damage(5, StaticDamageSource.DROWN);
        }

        EntityDamageSource damageSource = DamageSource.entitySource("pricked", event.getPlayer())
            .setBypassInvul(true)
            .build();

        if (event.getPlayer().getInventory().contains(Material.GOLD_INGOT)) {
            target.damage(5, damageSource);
        }
    }
}
