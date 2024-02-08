package fish.lll.tuyumod.registry;

import dev.architectury.registry.registries.DeferredRegister;
import fish.lll.tuyumod.TuyuMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class TuyuItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(TuyuMod.MOD_ID, Registries.ITEM);
        
        public static final Supplier<Item> TOFUKINU = ITEMS.register("ebifly", () -> new Item((new Item.Properties()).food()));
        
        private static Supplier<Item> register(String name, Supplier<Item> item) {
            return ITEMS.register(name, item);
        }

}
