package com.focamacho.ringsofascension.item.rings.effects;

import com.focamacho.ringsofascension.config.ConfigHolder;
import com.focamacho.ringsofascension.item.ItemRingBase;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ItemRingSlowFalling extends ItemRingBase {

    public ItemRingSlowFalling(Properties properties, String name, String tooltip) {
        super(properties, name, tooltip);
    }

    @Override
    public void tickCurio(String identifier, int index, LivingEntity livingEntity) {
        if(!ConfigHolder.ringSlowFalling) return;
        livingEntity.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 20, 0, false, false));
    }

}