package cf.witcheskitchen.common.statuseffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class FrostShieldStatusEffect extends StatusEffect {
    public FrostShieldStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        LivingEntity attacker = entity.getAttacker();
        if (entity.getAttacker() == attacker) {
            if (attacker != null) {
                attacker.setFrozenTicks(10);
                attacker.isFreezing();
                attacker.damage(DamageSource.FREEZE, 2f);
                attacker.setInPowderSnow(true);
            }
        }
    }
}
