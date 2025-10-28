/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.entity.decoration.PaintingVariant
 *  net.minecraftforge.registries.DeferredRegister
 *  net.minecraftforge.registries.ForgeRegistries
 *  net.minecraftforge.registries.IForgeRegistry
 *  net.minecraftforge.registries.RegistryObject
 */
package net.mcreator.pets.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class PetsModPaintings {
    public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create((IForgeRegistry)ForgeRegistries.PAINTING_VARIANTS, (String)"pets");
    public static final RegistryObject<PaintingVariant> SHINIGAMY_STUDIOS = REGISTRY.register("shinigamy_studios", () -> new PaintingVariant(48, 48));
}

