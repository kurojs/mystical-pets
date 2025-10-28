/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.effect.MobEffectInstance
 *  net.minecraft.world.effect.MobEffects
 *  net.minecraft.world.item.alchemy.Potion
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.pets.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class PetsModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.POTIONS, (String)"pets");
    public static final RegistryObject<Potion> OSCURIDAD = REGISTRY.register("oscuridad", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance(MobEffects.DARKNESS, 1200, 5, true, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, true, true), new MobEffectInstance(MobEffects.JUMP, 1200, 1, true, true)}));
    public static final RegistryObject<Potion> VIBRA = REGISTRY.register("vibra", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 4, false, true), new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 4, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 1, false, true)}));
// TODO: Fix remaining obfuscated MobEffect
        //     public static final RegistryObject<Potion> SDFSDF = REGISTRY.register("sdfsdf", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance(MobEffects.f_19620_, 600, 19, false, true)}));
    public static final RegistryObject<Potion> QUIETO = REGISTRY.register("quieto", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 800, 10, false, true)}));
}

