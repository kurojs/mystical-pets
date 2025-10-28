/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.Container
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.entity.Entity
 *  net.minecraft.world.entity.LivingEntity
 *  net.minecraft.world.entity.player.Player
 *  net.minecraft.world.item.ItemStack
 *  net.minecraft.world.level.ItemLike
 */
package net.mcreator.pets.procedures;

import net.mcreator.pets.init.PetsModItems;
import net.minecraft.world.Container;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class AguadeuwuProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        Player _player;
        LivingEntity _entity;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
            if (!_entity.hasEffect(MobEffects.FIRE_RESISTANCE)) {
// TODO: Fix remaining obfuscated MobEffect
        //                 _entity.addEffect(new MobEffectInstance(MobEffects.f_19618_, 1800, 1));
            }
        }
        if (entity instanceof LivingEntity) {
            _entity = (LivingEntity)entity;
            if (!_entity.hasEffect(MobEffects.FIRE_RESISTANCE)) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 1));
            }
        }
        if (entity instanceof Player) {
            _player = (Player)entity;
            ItemStack _stktoremove = new ItemStack((ItemLike)PetsModItems.AGUADEUWU.get());
// TODO: Fix clearOrCountMatchingItems signature
        //             _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1);
        }
        if (entity instanceof Player) {
            _player = (Player)entity;
            _player.getCooldowns().addCooldown(itemstack.getItem(), 600);
        }
    }
}

