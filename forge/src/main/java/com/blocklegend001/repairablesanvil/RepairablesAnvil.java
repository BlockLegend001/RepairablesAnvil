package com.blocklegend001.repairablesanvil;

import com.blocklegend001.repairablesanvil.util.EventHandler;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class RepairablesAnvil {

    public RepairablesAnvil(FMLJavaModLoadingContext context) {
        var modEventBus = context.getModBusGroup();
        CommonClass.init();
        PlayerInteractEvent.RightClickBlock.BUS.addListener(EventHandler::onRightClickBlock);
    }
}