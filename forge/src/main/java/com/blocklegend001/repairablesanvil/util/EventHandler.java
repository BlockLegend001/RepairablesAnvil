package com.blocklegend001.repairablesanvil.util;

import com.blocklegend001.repairablesanvil.event.AnvilEvent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

public class EventHandler {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (AnvilEvent.onAnvilUsage(new UseOnContext(
                event.getEntity(),
                event.getHand(),
                event.getHitVec()
        )) == InteractionResult.SUCCESS) {
            event.setCancellationResult(InteractionResult.PASS);
        }
    }
}
