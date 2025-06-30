package com.blocklegend001.repairablesanvil;

import com.blocklegend001.repairablesanvil.event.AnvilEvent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.world.item.context.UseOnContext;

public class RepairablesAnvil implements ModInitializer {

    @Override
    public void onInitialize() {
        loadEvents();
        CommonClass.init();
    }

    public void loadEvents() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) ->
                AnvilEvent.onAnvilUsage(new UseOnContext(player, hand, hitResult)));
    }
}
