package fish.lll.tuyumod.fabric;

import fish.lll.tuyumod.TuyuMod;
import net.fabricmc.api.ModInitializer;

public class TuyuModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TuyuMod.init();
    }
}
