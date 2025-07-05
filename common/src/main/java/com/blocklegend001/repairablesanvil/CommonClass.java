package com.blocklegend001.repairablesanvil;

import com.blocklegend001.repairablesanvil.platform.Services;

public class CommonClass {
    public static void init() {
        if (Services.PLATFORM.isModLoaded("repairablesanvil")) {
            Constants.LOG.info("Repairables Anvil Loaded!");
        }
    }
}
