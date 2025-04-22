package com.blocklegend001.repairablesanvil;

import com.blocklegend001.repairablesanvil.util.EventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class RepairablesAnvil {

    public RepairablesAnvil() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        CommonClass.init();
        modEventBus.addListener(this::loadEvents);
    }

    public void loadEvents(FMLLoadCompleteEvent event) {
        MinecraftForge.EVENT_BUS.register(EventHandler.class);
    }
}

