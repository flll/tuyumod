package fish.lll.tuyumod.forge;

import dev.architectury.platform.forge.EventBuses;
import fish.lll.tuyumod.TuyuMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TuyuMod.MOD_ID)
public class TuyuModForge {
    public TuyuModForge() {
        // アーキテクチャが適切なタイミングでコンテンツを登録できるように、イベントバスを提出します
        EventBuses.registerModEventBus(TuyuMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        TuyuMod.init();
    }
}
