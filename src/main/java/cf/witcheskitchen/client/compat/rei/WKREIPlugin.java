package cf.witcheskitchen.client.compat.rei;

import cf.witcheskitchen.WK;
import cf.witcheskitchen.client.compat.rei.category.FermentingCategory;
import cf.witcheskitchen.client.compat.rei.category.OvenCookingCategory;
import cf.witcheskitchen.client.compat.rei.display.FermentingDisplay;
import cf.witcheskitchen.client.compat.rei.display.OvenCookingDisplay;
import cf.witcheskitchen.client.gui.screen.WitchesOvenScreen;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class WKREIPlugin implements REIClientPlugin {

    public static final CategoryIdentifier<OvenCookingDisplay> OVEN_COOKING = CategoryIdentifier.of(WK.id("oven_cooking"));
    public static final CategoryIdentifier<FermentingDisplay> FERMENTING = CategoryIdentifier.of(WK.id("fermenting"));

    @Override
    public void registerCategories(CategoryRegistry registry) {
        OvenCookingCategory.register(registry);
        FermentingCategory.register(registry);
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        OvenCookingDisplay.register(registry);
        FermentingDisplay.register(registry);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerContainerClickArea(new Rectangle(76, 19, 22, 15), WitchesOvenScreen.class, OVEN_COOKING);
    }


}
