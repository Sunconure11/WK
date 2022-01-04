package cf.witcheskitchen.common.registry;

import cf.witcheskitchen.WK;
import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotAttributes;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Map;
import java.util.UUID;

public class WKItems {

    //PURELY FOR TESTING PURPOSES (TRINKETS)
    //WILL BE REMOVED IN THE FUTURE
    public static final Item DUMMY_CAPE = new TrinketItem(new FabricItemSettings().group(WK.WK_GROUP));

    static Item BELLADONNA_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item ST_JOHNS_WORT_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item AMARANTH_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item BRIAR_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item CAMELLIA_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item CHAMOMILE_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item CONEFLOWER_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item FOXGLOVE_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item HELLEBORE_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item IRIS_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item SANGUINARY_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));
    static Item WORMWOOD_SEEDS = new Item(new FabricItemSettings().group(WK.WK_GROUP));

    static Item DOLLOP_OF_FROSTING = new Item(new FabricItemSettings().food(WKFoodComponents.FROSTING).group(WK.WK_GROUP));
    static Item CHOCOLATE_RUM_BALLS = new Item(new FabricItemSettings().food(WKFoodComponents.RUM_BALLS).group(WK.WK_GROUP));
    static Item SUPER_BOOZE = new Item(new FabricItemSettings().food(WKFoodComponents.SUPER_BOOZE).group(WK.WK_GROUP));
    static Item CU_SITH_SPAWN_EGG = new SpawnEggItem(WKEntities.CUSITH, 3421236, 3497531, new Item.Settings().group(ItemGroup.MISC));

    public static void register() {
        registerItem("dummy_cape", DUMMY_CAPE);
        registerItem("belladonna_seeds", BELLADONNA_SEEDS);
        registerItem("dollop_of_frosting", DOLLOP_OF_FROSTING);
        registerItem("chocolate_rum_balls", CHOCOLATE_RUM_BALLS);
        registerItem("super_booze", SUPER_BOOZE);
        registerItem("cu_sith_spawn_egg", CU_SITH_SPAWN_EGG);
    }

    public static void registerItem(String id, Item item) {
        Registry.register(Registry.ITEM, new Identifier(WK.MODID, id), item);
    }
}

