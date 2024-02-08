package fish.lll.tuyumod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ShortcakeItem extends Item {
    public ShortcakeItem() {
        super(new Item.Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(4)  // 食べたときの満腹度回復量
                        .saturationMod(0.3F)  // 食べたときの隠し満腹度回復量
                        .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F)
                        .build()));
    }
}
