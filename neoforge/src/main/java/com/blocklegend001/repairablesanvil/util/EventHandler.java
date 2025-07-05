package com.blocklegend001.repairablesanvil.util;

import com.blocklegend001.repairablesanvil.event.AnvilEvent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;

@EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (AnvilEvent.onAnvilUsage(new UseOnContext(
                event.getEntity(),
                event.getHand(),
                event.getHitVec()
        )) == InteractionResult.SUCCESS) {
            event.setCanceled(true);
        }
    }
}
