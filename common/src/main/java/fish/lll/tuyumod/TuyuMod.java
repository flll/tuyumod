package fish.lll.tuyumod;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import fish.lll.tuyumod.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.Arrays;
import java.util.List;

public class TuyuMod {
    public static final String MOD_ID = "tuyumod";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    public static final RegistrySupplier<CreativeModeTab> TUYUMOD_TAB = TABS.register(
        "tuyumod_tab", // Tab ID
        () -> CreativeTabRegistry.create(
                Component.translatable("itemGroup.tuyumod.tuyumod_tab"), // Tab Name
                () -> new ItemStack(Items.STONE) // Icon
        )
);

    private static final List<ItemInfo> itemsToRegister = Arrays.asList(
        new ItemInfo("sandwich", SandwichItem::new),
        new ItemInfo("shrimp_tempura", ShrimpTempuraItem::new),
        new ItemInfo("apple_slice_moon", AppleSliceMoonItem::new),
        new ItemInfo("apple_slice_rabbit", AppleSliceRabbitItem::new),
        new ItemInfo("aurora_berry0", AuroraBerry0Item::new),
        new ItemInfo("aurora_berry1", AuroraBerry1Item::new),
        new ItemInfo("aurora_berry2", AuroraBerry2Item::new),
        new ItemInfo("aurora_berry3", AuroraBerry3Item::new),
        new ItemInfo("bento", BentoItem::new),
        new ItemInfo("bento_lid", BentoLidItem::new),
        new ItemInfo("glass", GlassItem::new),
        new ItemInfo("miracleless", MiraclelessItem::new),
        new ItemInfo("omusubi_nori", OmusubiNoriItem::new),
        new ItemInfo("omusubi_tenmusu", OmusubiTenmusuItem::new),
        new ItemInfo("onigiri_nori", OnigiriNoriItem::new),
        new ItemInfo("onigiri_umeboshi", OnigiriUmeboshiItem::new),
        new ItemInfo("onirigi_shio", OnirigiShioItem::new),
        new ItemInfo("sandwich_berry", SandwichBerryItem::new),
        new ItemInfo("voltagress_ore", VoltagressOreItem::new)
    );

    public static void registerItems() {
        itemsToRegister.forEach(itemInfo ->
            ITEMS.register(itemInfo.name, itemInfo.itemSupplier)
        );
    }
    // initメソッドは、Modの初期化時に呼び出され、登録物の登録を行い、設定ファイルのパスをコンソールに出力します。
    // このメソッドは、ゲームが起動するときに一度だけ呼び出され、必要な設定を行います。
    public static void init() {
        TABS.register();
        ITEMS.register();
        registerItems();
        
        // ここでは、設定ファイルの絶対パスをコンソールに出力しています。これにより、開発者は設定ファイルの場所を簡単に見つけることができます。
        //System.out.println(ExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
