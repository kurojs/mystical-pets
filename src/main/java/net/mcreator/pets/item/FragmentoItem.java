/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.world.item.CreativeModeTab
 *  net.minecraft.world.item.Item
 *  net.minecraft.world.item.Item$Properties
 *  net.minecraft.world.item.Rarity
 */
package net.mcreator.pets.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.mcreator.pets.init.PetsModTabs;

public class FragmentoItem
extends Item {
    public FragmentoItem() {
        super(new Item.Properties().tab(PetsModTabs.PETS).stacksTo(1).rarity(Rarity.RARE));
    }
}

