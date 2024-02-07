package dev.kubescript.fabric;

import dev.kubescript.KubeScript;
import net.fabricmc.api.ModInitializer;

public class KubeScriptFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KubeScript.init();
    }
}
