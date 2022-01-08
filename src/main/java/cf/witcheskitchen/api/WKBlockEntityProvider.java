package cf.witcheskitchen.api;

import cf.witcheskitchen.common.blocks.entity.WKDeviceBlockEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public abstract class WKBlockEntityProvider extends Block implements BlockEntityProvider {

    public WKBlockEntityProvider(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return (tickerWorld, pos, tickerState, blockEntity) -> {
            if (!world.isClient) {
                if (blockEntity instanceof BlockEntityTicker ticker) {
                    ticker.tick(tickerWorld, pos, tickerState, blockEntity);
                }
            } else {
                if (blockEntity instanceof WKDeviceBlockEntity deviceEntity) {
                    deviceEntity.onClientTick(tickerWorld, pos, tickerState, tickerWorld.getRandom());
                }
            }
        };
    }
}
