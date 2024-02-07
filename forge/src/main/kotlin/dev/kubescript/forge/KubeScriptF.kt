package dev.kubescript.forge

import dev.architectury.platform.forge.EventBuses
import dev.kubescript.KubeScript
import net.minecraftforge.fml.common.Mod
import thedarkcolour.kotlinforforge.forge.MOD_BUS
import thedarkcolour.kotlinforforge.forge.MOD_CONTEXT

@Mod(KubeScript.MOD_ID)
class KubeScriptF {
    init {
        KubeScript.init()
        EventBuses.registerModEventBus(KubeScript.MOD_ID, MOD_CONTEXT.getKEventBus())
    }
}