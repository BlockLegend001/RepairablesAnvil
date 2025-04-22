package com.blocklegend001.repairablesanvil;


import com.blocklegend001.repairablesanvil.util.EventHandler;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(Constants.MOD_ID)
public class RepairablesAnvil {

    public RepairablesAnvil(IEventBus modEventBus) {
        modEventBus.addListener(this::loadEvents);
        CommonClass.init();
    }

    public void loadEvents(FMLLoadCompleteEvent event) {
        NeoForge.EVENT_BUS.register(EventHandler.class);
    }
}
