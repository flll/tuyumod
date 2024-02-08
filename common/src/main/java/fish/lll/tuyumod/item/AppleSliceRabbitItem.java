package fish.lll.tuyumod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import fish.lll.tuyumod.TuyuMod;

public class AppleSliceRabbitItem extends Item {
    public AppleSliceRabbitItem() {
        super(new Properties()
                .food(new FoodProperties.Builder()
                        .nutrition(4)  // 食べたときの満腹度回復量
                        .saturationMod(0.3F)  // 食べたときの隠し満腹度回復量
                        .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0), 1.0F)  // 速度アップ効果を30秒間付与
                        .build())
                .arch$tab(TuyuMod.TUYUMOD_TAB));  // このアイテムをTuyuModのクリエイティブタブに追加
    }
}
