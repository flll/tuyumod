package fish.lll.tuyumod;

import net.minecraft.world.item.Item;
import java.util.function.Supplier;

public class ItemInfo {
    String name;
    Supplier<Item> itemSupplier;

    public ItemInfo(String name, Supplier<Item> itemSupplier) {
        this.name = name;
        this.itemSupplier = itemSupplier;
    }
}