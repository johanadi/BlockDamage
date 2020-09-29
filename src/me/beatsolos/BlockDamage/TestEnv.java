package me.beatsolos.BlockDamage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class TestEnv implements Listener {

    @EventHandler
    public void onBreakBlock(BlockBreakEvent event) {

        event.getPlayer().damage(2.0);
    }

}
