package fish.lll.tuyumod.quilt;

import fish.lll.tuyumod.TuyuMod;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TuyuModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        TuyuMod.init();
    }
}
