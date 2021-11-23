package cf.witcheskitchen.common.entities.hostile;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.world.World;

public abstract class WKHostileEntity extends HostileEntity implements Monster {
    public static final TrackedData<Integer> VARIANT = DataTracker.registerData(WKHostileEntity.class,
            TrackedDataHandlerRegistry.INTEGER);

    public WKHostileEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    @Environment(EnvType.CLIENT)
    public boolean shouldRender(double distance) {
        return true;
    }

    public abstract int getVariants();
}