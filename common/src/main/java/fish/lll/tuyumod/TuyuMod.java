package fish.lll.tuyumod;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrarManager;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class TuyuMod {
    public static final String MOD_ID = "tuyumod";
    // MOD_IDはこのModの一意の識別子です。他のModとの競合を避けるために使用されます。
    // "tuyumod"という文字列は、このModを他のModと区別するための固有の名前です。
    
    // REGISTRIESは、このModの全ての登録物を管理するためのSupplierです。RegistrarManagerを通じてアクセスします。
    // Suppliers.memoizeは、初めて呼び出された時の結果をキャッシュし、以降はそのキャッシュされた結果を返すラッパーです。
    public static final Supplier<RegistrarManager> REGISTRIES = Suppliers.memoize(() -> RegistrarManager.get(MOD_ID));

    // TABSは、このModで追加されるクリエイティブタブを登録するためのDeferredRegisterです。
    // DeferredRegisterは、ゲームの初期化段階でアイテムやブロックなどを登録するための仕組みです。
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);
    // EXAMPLE_TABは、新しいクリエイティブタブを具体的に登録し、そのタブ内で表示されるアイテムを設定します。
    // CreativeTabRegistry.createは、新しいクリエイティブタブを作成し、そのタブの表示名とアイコンを設定します。
    public static final RegistrySupplier<CreativeModeTab> EXAMPLE_TAB = TABS.register("example_tab", () ->
            CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".example_tab"),
                    () -> new ItemStack(TuyuMod.EXAMPLE_ITEM.get())));
    
    // ITEMSは、このModで追加されるアイテムを登録するためのDeferredRegisterです。
    // ここでは、新しいアイテムをModに追加するための準備をしています。
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registries.ITEM);
    // EXAMPLE_ITEMは、新しいアイテムを具体的に登録し、そのアイテムのプロパティを設定します。
    // new Item(new Item.Properties())は、新しいアイテムのインスタンスを作成し、そのプロパティ（例えば、どのクリエイティブタブに属するか）を設定します。
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () ->
            new Item(new Item.Properties().arch$tab(TuyuMod.EXAMPLE_TAB)));
    
    // initメソッドは、Modの初期化時に呼び出され、登録物の登録を行い、設定ファイルのパスをコンソールに出力します。
    // このメソッドは、ゲームが起動するときに一度だけ呼び出され、必要な設定を行います。
    public static void init() {
        TABS.register();
        ITEMS.register();
        
        // ここでは、設定ファイルの絶対パスをコンソールに出力しています。これにより、開発者は設定ファイルの場所を簡単に見つけることができます。
        System.out.println(ExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
