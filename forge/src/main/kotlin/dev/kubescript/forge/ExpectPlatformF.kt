package dev.kubescript.forge

import net.minecraftforge.fml.loading.FMLPaths
import java.nio.file.Path

class ExpectPlatformF {
    fun getConfigDirectory(): Path {
        return FMLPaths.CONFIGDIR.get()
    }
}