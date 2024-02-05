package fish.lll.tuyumod.forge;

import dev.architectury.platform.forge.EventBuses;
import fish.lll.tuyumod.TuyuMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TuyuMod.MOD_ID)
public class TuyuModForge {
    public TuyuModForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(TuyuMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TuyuMod.init();
    }
}
