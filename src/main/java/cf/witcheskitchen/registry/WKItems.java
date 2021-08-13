package cf.witcheskitchen.registry;

import cf.witcheskitchen.WK;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WKItems {

    static Item BELLADONNA_SEEDS = new Item(new FabricItemSettings().group(WK.OTHER_GROUP));
    public static void register()
    {
        registerItem("belladonna_seeds", BELLADONNA_SEEDS);
    }
    public static void registerItem(String id, Item item)
    {
        Registry.register(Registry.ITEM, new Identifier(WK.MODID, id), item);
    }
}

