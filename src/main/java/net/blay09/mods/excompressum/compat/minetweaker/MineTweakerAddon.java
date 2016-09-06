package net.blay09.mods.excompressum.compat.minetweaker;

import minetweaker.MineTweakerImplementationAPI;
import minetweaker.util.IEventHandler;
import net.blay09.mods.excompressum.compat.IAddon;
import net.blay09.mods.excompressum.registry.compressor.CompressedRecipeRegistry;
import net.blay09.mods.excompressum.registry.sieve.HeavySieveRegistry;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

@SuppressWarnings("unused")
@Optional.Interface(modid = "MineTweaker3", iface = "minetweaker.util.IEventHandler", striprefs = true)
public class MineTweakerAddon implements IEventHandler<MineTweakerImplementationAPI.ReloadEvent>, IAddon {
    public MineTweakerAddon() {
        MineTweakerImplementationAPI.onPostReload(this);
    }

    @Override
    public void handle(MineTweakerImplementationAPI.ReloadEvent reloadEvent) {
        HeavySieveRegistry.reload();
        CompressedRecipeRegistry.reload();
    }

    @Override
    public void loadConfig(Configuration config) {
    }

    @Override
    public void postInit() {
    }

    @Override
    public void serverStarted(FMLServerStartedEvent event) {
    }
}
