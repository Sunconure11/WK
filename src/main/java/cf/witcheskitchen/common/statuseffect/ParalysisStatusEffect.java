package cf.witcheskitchen.common.statuseffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ParalysisStatusEffect extends StatusEffect {
    public ParalysisStatusEffect(StatusEffectCategory type, int color) {
        super(type, color);
    }

    @Override
    public boolean isInstant() {
        return false;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public boolean isBeneficial() {
        return false;
    }

    //Todo: Make paralysis potions cause the player to sink if they are in water
    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        BlockPos pos = entity.getBlockPos();
        World world = entity.getEntityWorld();
        entity.setVelocity(0, 0, 0);
        if (entity.isSwimming()) {
            entity.damage(DamageSource.DROWN, 2f);
            entity.setAir(0);
            world.playSound(null, pos, SoundEvents.ENTITY_PLAYER_HURT_DROWN, SoundCategory.HOSTILE, 1, 1);
        }
    }
}
